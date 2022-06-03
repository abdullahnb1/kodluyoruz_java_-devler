package Giris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KucukKuvvetler {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        int sayi;
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        System.out.print("Lutfen bir sayi girin: ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i *= 4){
            l1.add(i);
        }
        for (int i = 1; i < sayi; i *= 5){
            l2.add(i);
        }
        System.out.println("4 un kuvvetleri => " + l1);
        System.out.println("5 in kuvvetleri => " + l2);
    }
}
