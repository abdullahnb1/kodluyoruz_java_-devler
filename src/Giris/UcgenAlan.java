package Giris;
import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Üçgenin kenarlarını tanımlıyoruz
        int a, b, c;
        System.out.print("Ucgenin birinci kenarini girin:");
        a = input.nextInt();
        System.out.print("Ucgenin ikinci kenarini girin:");
        b = input.nextInt();
        System.out.print("Ucgenin ucuncu kenarini girin:");
        c = input.nextInt();

        // Üçgenin çevresini tanımlıyoruz.
        int  u = (a+b+c)/2;

        int alan = (u * (u-a) * (u-b) * (u-c)) ;

        System.out.print("Verilen kenarların alanı: ");
        System.out.print(Math.sqrt(alan));
    }
}
