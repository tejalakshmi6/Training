import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = fr.readLine()) != null) {
                System.out.println(line);
            }
            // BufferedReader works faster than FileReader
            /* 
            FileReader fr = new FileReader("test.txt");
            int Char;
            while ((Char = fr.read()) != -1) {
                System.out.print((char) Char);
            }
            */
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
