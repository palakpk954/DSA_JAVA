import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        System.out.println("File exists? " + file.exists());
        System.out.println("Readable? " + file.canRead());
        System.out.println("Writable? " + file.canWrite());
        System.out.println("File size: " + file.length() + " bytes");
    }
}
