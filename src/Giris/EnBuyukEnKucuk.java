package Giris;

import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sayi;
        int tekrar;
        int enBuyuk = 0;
        int enKucuk = 0;


        System.out.print("Lutfen kac sayi gireceginizi tuslayın: ");
        sayi = input.nextInt();

        for (int i = 0; i < sayi; i ++){
            System.out.print("Lutfen bir sayi girin: ");
            tekrar = input.nextInt();

            if (i == 1){
                enBuyuk = tekrar;
                enKucuk = tekrar;
            }
            if (tekrar < enKucuk){
                enKucuk = tekrar;
            }
            if (tekrar > enBuyuk){
                enBuyuk = tekrar;
            }

        }
        System.out.print("En buyuk => " + enBuyuk + "\nEn kucuk => " + enKucuk);

    }
}
