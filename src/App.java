import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukan Tahun Lahir :");
        Scanner masukScanner = new Scanner(System.in);
        int umur = masukScanner.nextInt();
        int tahunsekarang = 2023;
        int umurkmu = tahunsekarang - umur;
        System.out.println("Umur Kamu "+umurkmu);
        
    }
}
