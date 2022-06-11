package Giris;

import java.util.ArrayList;
import java.util.List;

public class FibonacciMetot {
    static String fibonacci(int sayi){

        int n1 = 1, n2 = 1, n3;

        String fibonacci = "1,1,";

        for (int i = 2; i < sayi; i++){
            n3 = n1+n2;
            fibonacci += n3 + ",";
            n1 = n2;
            n2 = n3;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.print(fibonacci(6));
    }
}
