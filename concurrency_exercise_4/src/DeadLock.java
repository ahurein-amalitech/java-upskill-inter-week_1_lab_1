public class DeadLock {
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
            synchronized (resource1) {
                System.out.println("Thread 1: Holding lock on resource1...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired lock on resource2.");
                }
            }
        }
    }

    static class Task2 implements Runnable {
        @Override
        public void run() {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding lock on resource2...");

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired lock on resource1.");
                }
            }
        }
    }
}
