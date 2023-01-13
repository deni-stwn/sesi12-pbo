import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidInput {
    //Menangani kesalahan pada saat pemrosesan input yang tidak valid:
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan angka: ");
            int x = sc.nextInt();
            System.out.println("Angka yang dimasukkan: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid: " + e.getMessage());
        }
    }
}
