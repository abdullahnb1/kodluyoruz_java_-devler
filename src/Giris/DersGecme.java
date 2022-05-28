package Giris;

import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Dersleri tanımlıyoruz.
        int mat, fiz, turk, kim, muz;
        int oyMat = 0;
        int oyFiz = 0;
        int oyTurk = 0;
        int oyKim = 0;
        int oyMuz = 0;

        // Ders notlarını kullanıcıdan alıyoruz.

        System.out.print("Lutfen matematik notunuzu girin: ");
        mat = input.nextInt();
        System.out.print("Lutfen fizik notunuzu girin: ");
        fiz = input.nextInt();
        System.out.print("Lutfen turkce notunuzu girin: ");
        turk = input.nextInt();
        System.out.print("Lutfen kimya notunuzu girin: ");
        kim = input.nextInt();
        System.out.print("Lütfen muzik notunuzu girin: ");
        muz = input.nextInt();
        if (mat > 0 && mat < 100){
            oyMat = mat;
        }
        if (fiz > 0 && fiz < 100){
            oyFiz = mat;
        }
        if (turk > 0 && turk < 100){
            oyTurk = mat;
        }
        if (kim > 0 && kim < 100){
            oyKim = mat;
        }
        if (muz > 0 && muz < 100){
            oyMuz = mat;
        }

        int ortalama = (oyFiz + oyMat + oyKim + oyMuz + oyTurk)/5;

        if (ortalama >= 55){
            System.out.print("Gectiniz!!!");
        } else if (ortalama > 0 && ortalama < 55) {
            System.out.print("Kaldiniz!!!");
        }




    }
}
