import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class FileNotFound {
    // Menangani kesalahan pada saat mengakses file yang tidak ditemukan:
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}