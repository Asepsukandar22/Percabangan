import java.util.Scanner;
public class discount {
    public static void main(String[]args) throws Exception{
        Double totalBelanja, discount;
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Total Belanja : ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 1000000) {
            discount = 5/100 * totalBelanja;
            totalBelanja = totalBelanja - discount;
        }
        System.out.println("Total Yang Harus Dibayar "+totalBelanja);
    }
}
