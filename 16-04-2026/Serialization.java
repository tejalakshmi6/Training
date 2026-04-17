import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;

class Student implements Serializable {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

class CustomObjectOutputStream extends ObjectOutputStream {
    CustomObjectOutputStream(FileOutputStream obj) throws IOException {
        super(obj);
    }

    @Override
    protected void writeStreamHeader() {

    }
}

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student s = new Student("Raju", 88);
        File file = new File("student.txt");
        FileOutputStream fo = new FileOutputStream("student.txt", true); // open file
        // ObjectOutputStream obj = new ObjectOutputStream(fo); // object to byte stream
        ObjectOutputStream obj;
        if (file.length() == 0)
            obj = new ObjectOutputStream(fo); // Initial Serialization
        else
            obj = new CustomObjectOutputStream(fo); // Appending Serialization
        obj.writeObject(s); // write in file
        fo.close();
        obj.close();
    }
}

/*
 * Serialization - FileOutputStream
 * DeSerialization - FileInputStream
 */
