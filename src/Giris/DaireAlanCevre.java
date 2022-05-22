package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Diğer değişkenleri tanımlıyoruz.
        double pi = 3.14;
        int r;
        int a;

        System.out.print("Lütfen dairenin yarıçapını girin:");
        r = input.nextInt();
        System.out.print("Lütfen dairenin merkez açısını girin:");
        a = input.nextInt();

        double alan = (pi * (r*r) * a) / 360;

        System.out.print(alan);


    }
}
