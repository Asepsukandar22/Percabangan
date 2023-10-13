import java.util.Scanner;
public class Nilai {
    public static void main(String[]args) throws Exception{
        Double nilai;
        String indekNilai;
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Nilai : ");
        nilai = inputan.nextDouble();
        if (nilai >= 75) {
            indekNilai = "A";
        } else if(nilai >= 65){
            indekNilai = "B";
        }else if (nilai >= 55) {
            indekNilai = "C";
        } else {
            indekNilai = "D";
        }
       System.out.println("Indexs Nilai :" +indekNilai);
    }
}