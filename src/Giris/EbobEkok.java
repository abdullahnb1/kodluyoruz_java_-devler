package Giris;


import java.util.*;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2;
        int sayiKucuk, sayiBuyuk;
        int ebob;

        List<Integer> list=new ArrayList<Integer>();

        System.out.print("Lutfen sayi girin: ");
        sayi1 = input.nextInt();
        System.out.print("Lutfen sayi girin: ");
        sayi2 = input.nextInt();

        if (sayi1 > sayi2){
            sayiBuyuk = sayi1;
            sayiKucuk = sayi2;
        }
        else {
            sayiBuyuk = sayi2;
            sayiKucuk = sayi1;
        }
        for (int i = sayiKucuk; i >= 1; i--){
            if (sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
                int ekok = (sayi1*sayi2) / ebob;
                System.out.print(sayi1 + " ve " + sayi2 + " EBOB'u " + ebob + " ,EKOK'u " + ekok);
                break;
            }

        }





    }
}
