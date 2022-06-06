package Giris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int n1 = 0, n2 = 1, n3;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 2 ; i<=sayi; i++){
            n3=n1+n2;
            System.out.print(n1 + " + " + n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }


    }
}
