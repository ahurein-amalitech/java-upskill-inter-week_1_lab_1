import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TheadPoolApp {
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        String[] imageNames = {"image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg"};

        for(String image : imageNames){
            ImageTask task = new ImageTask(image);
            Future<String> result = executorService.submit(task);
            // blocking with future.get
            System.out.println(result.get());
        }
        executorService.shutdown();
    }
}
