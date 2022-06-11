package Giris;

import java.util.Scanner;

public class DeseneGoreMetot {
    static void desenNegatif(int sayi, int ilkSayi){
        if (sayi == ilkSayi){
            System.out.print(sayi);
            return;
        }else {
            System.out.print(sayi);
            desenNegatif(sayi + 5, ilkSayi);
        }

    }
    static  void desenPozitif(int sayi, int ilkSayi){
        if (sayi>0){
            System.out.print(sayi);
            desenPozitif(sayi-5, ilkSayi);
            return;
        } else if (sayi <= 0) {
            System.out.print(sayi);
            desenNegatif(sayi + 5, ilkSayi);
            return;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sayi girin: ");
        sayi = input.nextInt();
        desenPozitif(sayi,sayi);
    }
}