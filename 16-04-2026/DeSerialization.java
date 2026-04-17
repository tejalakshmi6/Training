import java.io.*;

// used to print the object from the file
public class DeSerialization {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("student.txt");
        ObjectInputStream obj = new ObjectInputStream(fi);

        while (true) {
            try {
                Student s = (Student) obj.readObject();
                System.out.println(s.name + " " + s.mark);
            } catch (EOFException e) {
                break;
            }
        }

        fi.close();
        obj.close();
    }
}
