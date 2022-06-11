package Giris;

import java.util.Scanner;

public class UsAlma {
    static int usAlma(int sayi1, int sayi2){
        if (sayi2 == 0){
            return 1;
        }
        else {
            int result = 1;
            return (sayi1 * usAlma(sayi1,sayi2-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int taban, us;
        System.out.print("Taban degeri giriniz: ");
        taban = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        us = input.nextInt();
        System.out.print(usAlma(taban,us));

    }
}
