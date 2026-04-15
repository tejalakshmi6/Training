import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File newFile = new File("test.txt");
            // file creation
            if (newFile.createNewFile()) { 
                System.out.println("File Created: " + newFile.getName());
            } else {
                System.out.println("Not able to create file");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
