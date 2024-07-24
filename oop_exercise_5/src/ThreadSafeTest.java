import java.util.concurrent.TimeUnit;

public class ThreadSafeTest {
    public static void main(String[] args) throws InterruptedException {
        Cache<String, String> cache  = new Cache<>();

        Runnable  writerTask = () -> {
            for (int i = 0; i < 10; i++) {
                String key = "key" + i;
                String value = "value" + i;
                cache.put(key, value);
                System.out.println("Put: " + key + " = " + value);
                try {
                    TimeUnit.MILLISECONDS.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable readerTask = () -> {
            for (int i = 0; i < 10; i++) {
                String key = "key" + i;
                System.out.println("Get: " + key + " = " + cache.get(key));
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread writerThread = new Thread(writerTask);
        Thread readerThread = new Thread(readerTask);

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}
