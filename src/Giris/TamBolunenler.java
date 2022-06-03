package Giris;

import java.util.*;

public class TamBolunenler {
    public static void main(String[] args) {
        //Scanner sınıfını tamılıyoruz.
        Scanner input = new Scanner(System.in);

        int sayi;
        int sum = 0;

        sayi = input.nextInt();

        List<Integer> l1 = new ArrayList<Integer>();

        for(int i = 0; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                l1.add(i);
            }
            else {
                continue;
            }
        }
        float ort = sum/l1.size();
        System.out.println(l1);
        System.out.print("3 e ve 4 e tam bolunen sayilarin ortalamasi =>" + ort);
    }
}
