package Giris;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        int taban;
        int kuvvet;
        int sonuc = 1;
        System.out.print("Taban: ");
        taban = input.nextInt();
        System.out.print("Kuvvet: ");
        kuvvet = input.nextInt();

        for (int i = 1; i <= kuvvet; i++){
            sonuc *= taban;
        }
        System.out.print(taban + " sayisinin " + kuvvet + " kuvveti " + sonuc);

    }
}
