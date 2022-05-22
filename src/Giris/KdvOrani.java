package Giris;

import java.util.Scanner;
public class KdvOrani {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Ürünün fiyatını alıyoruz.
        System.out.print("Ucreti girin: ");
        int fiyat = input.nextInt();

        //KDV oranını belirliyoruz.
        double oran = fiyat < 1000 ? 0.18 : 0.08;

        double sonuc = fiyat + fiyat * oran;

        System.out.print(sonuc);

    }
}
