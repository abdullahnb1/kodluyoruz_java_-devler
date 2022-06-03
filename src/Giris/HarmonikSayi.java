package Giris;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        int sayi;
        double sum = 0.0;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++){
            sum += 1/i;
        }
        System.out.print(sum);
    }
}
