package Giris;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.

        Scanner input = new Scanner(System.in);

        int sayi;
        int sum = 1;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            sum *= i;
        }
        System.out.print(sayi + " sayisinin faktoriyeli => " + sum);
    }
}
