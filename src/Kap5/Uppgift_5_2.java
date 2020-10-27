package Kap5;

import java.util.Scanner;

public class Uppgift_5_2 {
    public static void main(String[] args) {
        double d = 1;
        Scanner tgb = new Scanner(System.in);
        int n = Integer.parseInt(tgb.nextLine());
        double summa = 0;
        for (int k = 1; k <= n; ++k){
            summa = d / k + summa;
        }
        System.out.print("summan blir " + summa);
    }
}
