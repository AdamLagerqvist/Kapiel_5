package Kattis;

import java.util.Scanner;

public class Dice_cup {
    public static void main(String[] args){
        Scanner tgb = new Scanner(System.in);
        int D1 = Integer.parseInt(tgb.nextLine());
        int D2 = Integer.parseInt(tgb.nextLine());
        int D_total = D1 + D2;
        int[] v;
        int[] finnished;
        int[] D_1_arr;
        int[] D_2_arr;
        v = new int[D_total];
        finnished = new int[D_total];
        D_1_arr = new int[D1];
        D_2_arr = new int[D2];
        for (int i = 0; i < D1; i++)
            D_1_arr[i] = i + 1;
        for (int i = 0; i < D2; i++)
            D_2_arr[i] = i + 1;
        int i_2 = 0;
        while (i_2 < D2) {
            int i = 0;
            while (i < D1) {
                v[D_1_arr[i] + D_2_arr[i_2] - 1] = v[D_1_arr[i] + D_2_arr[i_2] - 1] + 1;
                i++;
            }
            i_2++;
        }
        int antal_svar = 0;
        int summa = 0;
        int i_3 = 0;
        while (i_3 < D_total) {
            if (v[i_3] > summa){
                antal_svar = 0;
                finnished[antal_svar] = i_3 + 1;
                summa = v[i_3];
            }
            if (v[i_3] == summa){
                antal_svar++;
                finnished[antal_svar] = v[i_3];
            }
            i_3++;
        }
        // System.out.println(D1 + " " + D2 + " " + D_total + " " + v[1] + " " + finnished[0]);
        //for (int i_4 = 0; i_4 < antal_svar; i_4++){
        //    System.out.println(finnished[i_4]);

            for (int i_4 = 0; i_4 < v.length; i_4++){
                System.out.println(v[i_4] + " " + (i_4 + 1));

        }
    }
}