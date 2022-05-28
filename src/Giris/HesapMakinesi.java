package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Yapılacak işlemleri kullanıcıya bildiriyoruz.
        int processNumber;
        System.out.println("Hesap makinesine hosgeldiniz.\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapmak istediginiz islemi secin:");
        processNumber = input.nextInt();

        //Kullanıcıdan alınan verileri tanımlıyoruz.

        int numberOne, numberTwo;
        System.out.print("Birinci sayiyi girin:");
        numberOne = input.nextInt();
        System.out.print("Ikinci sayiyi girin:");
        numberTwo = input.nextInt();
        switch (processNumber){
            case 1:
                System.out.print(numberOne+numberTwo);
                break;
            case 2:
                System.out.print(numberOne-numberTwo);
                break;
            case 3:
                System.out.print(numberOne*numberTwo);
                break;
            case 4:
                System.out.print(numberOne/numberTwo);
                break;
            default:
                System.out.print("Boyle bir islem numarasi yoktur.");
        }


    }
}
