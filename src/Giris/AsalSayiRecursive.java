package Giris;

import java.util.Scanner;

public class AsalSayiRecursive {
    static void asalmı(int sayi, int i){

        if (sayi == i){
            System.out.print(sayi + " Asaldir.");
            return;
        } else if (sayi % i == 0) {
            System.out.print(sayi + " Asal degildir.");
            return;
        }
        asalmı(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.print("Sayi girin: ");
        sayi = input.nextInt();

        asalmı(sayi, 2);
    }
}
