package Giris;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe;
        int yas;
        int tip;
        double KM = 0.1;


        System.out.print("Mesafe: ");
        mesafe = input.nextInt();
        System.out.print("Yas: ");
        yas = input.nextInt();
        System.out.print("Tek Yon --> 1 / Gidis-Donus --> 2 : ");
        tip = input.nextInt();

        double toplam =  KM * mesafe;

        if (tip == 1){

            if (yas < 12){
                toplam *= 0.5;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + "Ucretiniz: " + toplam);
            }
            else if (yas >= 12 && yas < 24){
                toplam *= 0.9;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + " Ucretiniz: " + toplam);
            }
            else if (yas >= 65){
                toplam *= 0.7;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + "Ucretiniz: " + toplam);
            }
        }
        else if (tip == 2) {
            toplam *= 2 * 0.8;
            if (yas < 12){
                toplam *= 0.5;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + "Ucretiniz: " + toplam);
            }
            else if (yas >= 12 && yas < 24){
                toplam *= 0.9;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + "Ucretiniz: " + toplam);
            }
            else if (yas >= 65){
                toplam *= 0.7;
                System.out.print("Biletiniz " + (tip == 1 ? "Tek Yon":"Gidis Donus") + "Ucretiniz: " + toplam);
            }
        }
        else {
            System.out.print("Hatali veri girdiniz...");
        }






    }
}
