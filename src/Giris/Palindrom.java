package Giris;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

public class Palindrom {

    static boolean isPalindrom(int sayi){

        int reversedSayi = 0;
        int a;
        int temp = sayi;
        while (temp != 0) {
            a = temp % 10;
            reversedSayi = reversedSayi * 10 + a;
            temp /= 10;
        }
        if(reversedSayi == sayi){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(343));

    }
}
