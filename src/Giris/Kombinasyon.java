package Giris;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.

        Scanner input = new Scanner(System.in);

        int sayiN;
        int sayiR;
        int sumN = 1;
        int sumR = 1;
        int sumNR = 1;

        System.out.print("Lutfen n girin: ");
        sayiN = input.nextInt();
        System.out.print("Lutfen r girin: ");
        sayiR = input.nextInt();

        for (int i = 1; i <= sayiN; i++){
            sumN *= i;
        }
        for (int i = 1; i <= sayiR; i++){
            sumR *= i;
        }
        for (int i = 1; i <= (sayiN - sayiR); i++){
            sumNR *= i;
        }

        float kombinasyon = sumN / (sumR * sumNR);

        System.out.print(sayiN + " sayisinin" + " kombinasyonu => " + kombinasyon);

    }
}