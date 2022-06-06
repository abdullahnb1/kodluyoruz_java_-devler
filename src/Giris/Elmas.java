package Giris;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            for (int j = sayi; j > i; j--){
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int b = 1; b <= sayi; b++){
            for (int c = 1; c <= b; c++){
                System.out.print(" ");
            }
            for (int k = sayi; k > b; k--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}