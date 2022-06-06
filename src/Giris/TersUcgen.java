package Giris;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = sayi; k > i; k--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i=sayi; i >0 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
