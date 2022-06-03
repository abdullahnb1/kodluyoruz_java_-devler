package Giris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TekCiftDort {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        int sayi;
        int sum = 0;
        List<Integer> l1 = new ArrayList<Integer>();

        boolean tekMi = false;

        while (!tekMi) {
            System.out.print("Lutfen bir sayi girin: ");
            sayi = input.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                l1.add(sayi);
                sum += sayi;
            } else if (sayi % 2 != 0) {
                tekMi = true;
                System.out.println(l1);
                System.out.print("4e tam bolunenlerin toplami => " + sum);
            }

        }

    }
}