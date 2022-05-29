package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Lutfen yili girin:");
        yil = input.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0 && yil % 400 != 0){
                System.out.print(yil + " yili bir artik yil degildir.");
            }
            else {
                System.out.print(yil + " yili bir artik yildir.");
            }
        }
        else {
            System.out.print(yil + " yili bir artik yil degildir.");
        }
    }
}
