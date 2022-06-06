package Giris;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        String userName, password;
        int kalanHak = 3;
        int hesapBakiye = 1500;
        int islemNumarasi;
        int tutar;

        boolean sonuc = true;

        while (kalanHak > 0){
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.print("Sifreniz: ");
            password = input.nextLine();

            if (userName.equals("Adana") && password.equals("1234")) {


                while (sonuc) {
                    System.out.print("Hosgeldiniz. Lutfen yapmak istediginiz islem numarasini tuslayiniz.");


                    System.out.println("1-Para yatirma\n" +
                        "2-Para Cekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Cıkis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    islemNumarasi = input.nextInt();
                    switch (islemNumarasi) {
                        case 1:
                            System.out.print("Lutfen yatirilacak tutari girin: ");
                            tutar = input.nextInt();
                            hesapBakiye += tutar;
                            System.out.print("Yeni bakiyeniz: " + hesapBakiye);
                            sonuc = false;
                            break;
                        case 2:
                            System.out.print("Lutfen cekilecek tutari girin: ");
                            tutar = input.nextInt();
                            hesapBakiye -= tutar;
                            System.out.print("Yeni bakiyeniz: " + hesapBakiye);
                            sonuc = false;
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: " + hesapBakiye);
                            sonuc = false;
                            break;
                        case 4:
                            System.out.print("Yine bekleriz...");
                            sonuc = false;
                            break;
                        default:
                            System.out.print("Boyle bir islem numarasi yoktur. Lutfen tekrara deneyin.");
                            sonuc = true;

                    }
                }
                break;
            }
            else {
                System.out.print("Yanlıs sifre girdiniz. Lutfen tekrar deneyin.");
                kalanHak--;
                if (kalanHak == 0){
                    System.out.print("Hesabiniz bloke edildi...");
                }
            }
        }
    }
}
