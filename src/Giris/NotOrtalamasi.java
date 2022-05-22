package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri tanımladık.
        int matematik, fizik, kimya, türkce, tarih, müzik;

        //İnput almak için scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Kullanıcıya hangi değeri girmesi gerektiğini söylüyoruz.
        System.out.print("Matematik sonuç: ");
        matematik = input.nextInt();

        System.out.print("Fizik sonuç: ");
        fizik = input.nextInt();

        System.out.print("Kimya sonuç: ");
        kimya = input.nextInt();

        System.out.print("Türkçe sonuç: ");
        türkce = input.nextInt();

        System.out.print("Tarih sonuç: ");
        tarih = input.nextInt();

        System.out.print("Müzik sonuç: ");
        müzik = input.nextInt();

        String sonuc = ((matematik + fizik + kimya + türkce + tarih + müzik) / 6 >= 60) ? "Geçti":"Sınıfta Kaldı";

        System.out.print(sonuc);
    }
}
