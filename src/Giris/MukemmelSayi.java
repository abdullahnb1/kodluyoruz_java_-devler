package Giris;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int sum = 0;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0){
                sum += i;

            }
        }
        if (sum == sayi){
            System.out.print(sayi + " bir mukemmel sayidir.");
        }
        else {
            System.out.print(sayi + " bir mukemmel sayi degildir.");
        }
    }
}
