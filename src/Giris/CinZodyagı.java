package Giris;

import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYılı;


        System.out.print("Lutfen dogum yilinizi girin: ");
        dogumYılı = input.nextInt();

        int kalan = dogumYılı % 12;
        String burc;

        switch (kalan){
            case 0:
                burc = "Maymun";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 1:
                burc = "Horoz";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 2:
                burc = "Kopek";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 3:
                burc = "Domuz";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 4:
                burc = "Fare";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 5:
                burc = "Okuz";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 6:
                burc = "Kaplam";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 7:
                burc = "Tavsan";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 8:
                burc = "Ejderha";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 9:
                burc = "Yılan";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 10:
                burc = "At";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
            case 11:
                burc = "Koyun";
                System.out.print("Cin Zodyagi Burcunuz: " + burc);
                break;
        }
    }
}
