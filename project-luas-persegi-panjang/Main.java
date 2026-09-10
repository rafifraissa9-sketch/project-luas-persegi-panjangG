import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Deklarasi variabel
        int panjang, lebar, luas;

        // Membuat Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input panjang
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        // Input lebar
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        // Menghitung luas
        luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi = " + luas);

        input.close();
    }
}
    
