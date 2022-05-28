package Giris;

import java.util.Scanner;

public class SifreDegistirme {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);
        //Eski şifreyi ve girilecek olan şifreyi belirliyoruz.

        String girilecekSifre;
        String password = "1234ABC";
        String olusturulacakSifre;
        //Kullanıcıdan şifresini girmesini istiyoruz.
        System.out.print("Lutfen sifrenizi girin:");
        girilecekSifre = input.nextLine();
        if (girilecekSifre.equals(password)){
            System.out.print("Basari ile giris yaptiniz!!");
        }
        else{
            //Kullanıcıdan alacağımız sorunun cevabını tanımlıyoruz.
            String cevap;
            System.out.print("Sifreniz hatalı degistirmek ister misiniz? EVET/HAYIR");
            cevap = input.nextLine();
            if (cevap.equals("EVET")){
                System.out.print("Yeni olusturacagınız sifre eskisi ile aynı olamaz. Lutfen buna dikkat edin.");
                System.out.print("Yeni sifreyi girin:");
                olusturulacakSifre = input.nextLine();


                if (olusturulacakSifre.equals(password)){
                    System.out.print("Eski sifre ile aynı degeri girdiniz. Lutfen baska bir sifre olusturun.");
                    olusturulacakSifre = input.nextLine();
                    password = olusturulacakSifre;
                    System.out.print("Yeni sifreniz olusturuldu: " + password);
                }
                else {
                    password = olusturulacakSifre;
                    System.out.print("Yeni sifreniz olusturuldu: " + password);
                }
            }
            else{
                System.out.print("Lutfen dogru sifreyi bulun!!!");
            }
        }
    }
}
