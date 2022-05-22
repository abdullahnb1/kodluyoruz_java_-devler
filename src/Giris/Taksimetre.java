package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Scannerı tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Gidilen KM' yi ve diğer değerleri tanımlıyoruz.
        double kmbasi = 2.20;
        int acilis = 10;

        System.out.print("Kaç KM gidildiğini yazın: ");
        int KM = input.nextInt();

        double tutar = (acilis + (kmbasi * KM));

        double sonuc = tutar >= 20 ? tutar:20;

        System.out.print("Ödenecek tutar: ");
        System.out.print(sonuc);
    }
}
