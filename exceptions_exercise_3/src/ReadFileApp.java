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
            System.out.println("Io exception occurred");
        }
    }

    public void ReadAndProcessData(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try{
            String line;
            while((line = reader.readLine()) != null){
                try {
                    processData(line);
                }catch (IOException e){
                    System.out.println("Io exception occurred");
                }
            }

        }catch (IOException e){
            System.out.println("Encountered IO exception");
            throw e;
        } finally {
            reader.close();
        }
    }

    public void processData(String data) throws IOException {
        if(data.contains("error")){
            throw new IOException();
        }
        System.out.println(STR."data processed \{data}");
    }
}
