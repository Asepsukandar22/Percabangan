import java.util.Scanner;
public class ganjil {
    public static void main(String[]args) throws Exception{
        
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        int Angka = inputan.nextInt();
        if (Angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
    }
}
