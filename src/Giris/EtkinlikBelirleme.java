package Giris;

import java.util.Scanner;

public class EtkinlikBelirleme {
    public static void main(String[] args) {
        //Scanner sınıfın tanımlıyoruz.
        Scanner input = new Scanner(System.in);
        int sicaklik;

        //Kullanıcıdan sıcaklık değerini alıyoruz.
        System.out.print("Lutfen hava sicakligini derece olarak girin: ");
        sicaklik = input.nextInt();

        String aktivite = sicaklik < 5 ? "Kayak" : sicaklik >= 5 && sicaklik < 15 ? "Sinema" : sicaklik >= 15 && sicaklik < 25 ? "Piknik" : sicaklik >= 25 ? "Yuzme" : "Herhangi bir etkinlik önerilemiyor";

        System.out.print("Size en uygun aktivite --> " + aktivite);
    }
}
