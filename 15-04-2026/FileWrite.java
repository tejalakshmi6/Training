import java.io.*;
public class FileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Write using FileWriter");
            writer.newLine();
            writer.write("Buffered writer is used");
            System.out.println("Written in File");
            writer.close(); // must be closed everytime. 
            
            /*
            FileWriter - writes directly to fie (slower)
            BufferedReader - uses memory buffer (faster) : newLine(), flush()
            */

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
