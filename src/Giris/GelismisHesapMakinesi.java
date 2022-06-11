package Giris;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void toplama(){
        Scanner input = new Scanner(System.in);

        int sayi,i =1,result = 0;

        while (true){
            System.out.print(i + ". sayi = ");
            sayi = input.nextInt();
            result += sayi;
            i++;
            if (sayi == 0){
                break;
            }
        }
        System.out.print("Sonuc => " + result);
    }
    static void cıkarma(){
        Scanner input = new Scanner(System.in);

        int sayi,i =1,result = 0;

        while (true){
            System.out.print(i + ". sayi = ");
            sayi = input.nextInt();
            result -= sayi;
            i++;
            if (sayi == 0){
                break;
            }
        }
        System.out.print("Sonuc => " + result);
    }
    static void carpma(){
        Scanner input = new Scanner(System.in);

        int sayi,i =1,result = 1;

        while (true){
            System.out.print(i + ". sayi = ");
            sayi = input.nextInt();
            result *= sayi;
            i++;
            if (sayi == 0){
                break;
            }
        }
        System.out.print("Sonuc => " + result);
    }
    static void bolme(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double sayi, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextDouble();
            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = sayi;
                continue;
            }
            result /= sayi;
        }

        System.out.println("Sonuç : " + result);
    }
    static void usAlma(){
        Scanner input = new Scanner(System.in);
        int taban,us,result = 1;

        System.out.print("Taban : ");
        taban = input.nextInt();
        System.out.print("Us : ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++){
            result *= taban;
        }
        System.out.print("Sonuc => " + result);
    }
    static void factoriel(){
        Scanner input = new Scanner(System.in);

        int sayi,i =1,result = 1;
        System.out.print("Sayı girin: ");
        sayi = input.nextInt();

        for (int a = 1; a <= sayi; a++){
            result *= a;
        }
        System.out.print("Sonuc => " + result);
    }
    static void modAlma(){
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,i =1,result;

        System.out.print("Modu alinacak deger : ");
        sayi1 = input.nextInt();
        System.out.print("Mod alınacak deger : ");
        sayi2 = input.nextInt();

        result = sayi1 % sayi2;

        System.out.print("Sonuc => " + result);
    }
    static void dikdortgenCevreAlan(){
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,cevre,alan = 1;


        System.out.print("Dikdortgenin bir kenarını girin : ");
        sayi1 = input.nextInt();
        System.out.print("Dikdortgenin bir kenarını girin : ");
        sayi2 = input.nextInt();

        cevre = (sayi1 + sayi2) * 2;
        alan = sayi1 * sayi2;

        System.out.print("Alan => " + alan + "Cevre => " + cevre);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    factoriel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenCevreAlan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }

}
