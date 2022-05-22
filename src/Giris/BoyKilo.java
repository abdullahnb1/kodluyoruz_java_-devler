package Giris;
import java.util.Scanner;

public class BoyKilo {
    public static void main(String[] args) {
        //Scanner sınıfını kodluyoruz.
        Scanner input = new Scanner(System.in);

        //Diğer değerleri tanımlıyoruz.
        int kilo;
        double boy;

        System.out.print("Lütfen boyunuzu(metre cinsinden) girin: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu girin: ");
        kilo = input.nextInt();

        double indeks = kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: "+indeks);

    }
}
