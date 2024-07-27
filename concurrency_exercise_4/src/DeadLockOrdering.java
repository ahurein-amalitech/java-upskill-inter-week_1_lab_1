public class DeadLockOrdering {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();
    }

    static class Task1 implements Runnable {
        @Override
        public void run() {
            acquireLocks(resource1, resource2);
            System.out.println("Thread 1: Acquired locks on resource1 and resource2.");
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            acquireLocks(resource1, resource2);
            System.out.println("Thread 2: Acquired locks on resource1 and resource2.");
        }
    }

    private static void acquireLocks(Object... locks) {
        for (Object lock : locks) {
            synchronized (lock) {
                System.out.println(STR."Acquired lock on \{lock}");
            }
        }
    }
}
