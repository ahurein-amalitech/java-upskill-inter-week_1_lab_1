import java.awt.dnd.DropTarget;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {
    public static void main(String[] args) {
        ReadFileApp app = new ReadFileApp();

        try{
            app.ReadAndProcessData("C:\\Users\\EbenezerAhurein\\Documents\\authorization.txt");
        }catch (IOException e){
            System.out.println("Outer io exception occurred");
        }
    }

    public void ReadAndProcessData(String fileName) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)) ){
            String line;
            while((line = reader.readLine()) != null){
                try {
                    processData(line);
                }catch (ProcessingException e){
                    System.out.println("Inner custom exception occurred");
                }
            }

        }catch (IOException e){
            System.out.println("Encountered IO exception");
            throw e;
        }
    }

    public void processData(String data){
        if(data.contains("error")){
            throw new ProcessingException("Data contains error");
        }
        System.out.println(STR."data processed \{data}");
    }
}
