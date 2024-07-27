public class SynchronizedBlock {
    private int count = 0;
    private final Object lock = new Object();

    public void increment(){
        synchronized (lock){
            count ++;
        }
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlock block = new SynchronizedBlock();

        Runnable task = () -> {
            for(int i = 0; i < 80; i++){
                block.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(STR."Final count: \{block.getCount()}");
    }
}
