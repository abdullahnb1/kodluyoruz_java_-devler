package Giris;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Hangi ay hangi gün olduğunu öğreniyoruz.

        String ay;
        int gun;

        System.out.print("Lutfen hangi ayda dogdugunuzu belirtin(Aralik) :");
        ay = input.nextLine();
        System.out.print("Lutfen hangi gunde dogdugunuzu belirtin :");
        gun = input.nextInt();


        if (ay.equals("Ocak")){
            if (gun <= 21){ System.out.print("Oglak Burcusunuz...");}
            else if (gun >= 22) { System.out.print("Kova Burcusunuz ...");}

        }
        else if (ay.equals("Şubat")){
            if (gun <= 19){ System.out.print("Kova Burcusunuz...");}
            else if (gun >= 20) { System.out.print("Balik Burcusunuz ...");}

        }
        else if (ay.equals("Mart")){
            if (gun <= 20){ System.out.print("Balik Burcusunuz...");}
            else if (gun >= 21) { System.out.print("Koc Burcusunuz ...");}

        }
        else if (ay.equals("Nisan")){
            if (gun <= 20){ System.out.print("Balik Burcusunuz...");}
            else if (gun >= 21) { System.out.print("Boga Burcusunuz ...");}

        }
        else if (ay.equals("Mayıs")){
            if (gun <= 21){ System.out.print("Boga Burcusunuz...");}
            else if (gun >= 22) { System.out.print("Ikizler Burcusunuz ...");}

        }
        else if (ay.equals("Haziran")){
            if (gun <= 22){ System.out.print("Ikizler Burcusunuz...");}
            else if (gun >= 23) { System.out.print("Yengec Burcusunuz ...");}

        }
        else if (ay.equals("Temmuz")){
            if (gun <= 22){ System.out.print("Yengec Burcusunuz...");}
            else if (gun >= 23) { System.out.print("Aslan Burcusunuz ...");}

        }
        else if (ay.equals("Ağustos")){
            if (gun <= 22){ System.out.print("Aslan Burcusunuz...");}
            else if (gun >= 23) { System.out.print("Basak Burcusunuz ...");}

        }
        else if (ay.equals("Eylül")){
            if (gun <= 22){ System.out.print("Basak Burcusunuz...");}
            else if (gun >= 23) { System.out.print("Terazi Burcusunuz ...");}

        }
        else if (ay.equals("Ekim")){
            if (gun <= 22){ System.out.print("Terazi Burcusunuz...");}
            else if (gun >= 23) { System.out.print("Akrep Burcusunuz ...");}

        }
        else if (ay.equals("Kasım")){
            if (gun <= 21){ System.out.print("Akrep Burcusunuz...");}
            else if (gun >= 22) { System.out.print("Yay Burcusunuz ...");}

        }
        else if (ay.equals("Aralık")){
            if (gun <= 21){ System.out.print("Yay Burcusunuz...");}
            else if (gun >= 22) { System.out.print("Oglak Burcusunuz ...");}

        }

    }
}
