package Giris;

import java.util.Scanner;

public class BasamakDegerleri {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        int sayi;
        int sum = 0;
        int basamakSayisi = 0;

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        while (sayi > 0){
            sum += sayi % 10;
            sayi /= 10;
            basamakSayisi++;
        }
        System.out.print(sum);
    }
}
