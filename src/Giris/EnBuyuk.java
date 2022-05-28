package Giris;

import java.util.Scanner;

public class EnBuyuk {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Karşılaştırılacak olan sayıları tanımlıyoruz.
        int a, b, c;

        System.out.print("Lutfen birinci sayiyi girin: ");
        a = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi girin: ");
        b = input.nextInt();
        System.out.print("Lutfen ucuncu sayiyi girin: ");
        c = input.nextInt();

        if (a > b && a > c){
            System.out.print("En buyuk sayi --> " + a);
        }
        else if (b > a && b > c) {
            System.out.print("En buyuk sayi --> " + b);
        }
        else {
            System.out.print("En buyuk sayi --> " + c);
        }
    }
}
