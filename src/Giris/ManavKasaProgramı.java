package Giris;
import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Diğer değerleri tanımlıyoruz.
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        int a,e,d,m,p;

        System.out.print("Kaç kilo armut: ");
        a = input.nextInt();
        System.out.print("Kaç kilo elma: ");
        e = input.nextInt();
        System.out.print("Kaç kilo domates: ");
        d = input.nextInt();
        System.out.print("Kaç kilo muz: ");
        m = input.nextInt();
        System.out.print("Kaç kilo patlıcan: ");
        p = input.nextInt();

        double toplam = (a*armut) + (e*elma) + (d*domates) + (m*muz) + (p*patlican);
        System.out.print("Toplam borcunuz: "+ toplam);
    }
}
