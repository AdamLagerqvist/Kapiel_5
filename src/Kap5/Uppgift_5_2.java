package Kap5;

import javax.swing.*;

public class Uppgift_5_2 {
    public static void main(String[] args) {
        double d = 1;
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        int k = 1;
        double summa = 0;
        while (k <= n){
            summa = d / k + summa;
            ++k;
        }
        System.out.print("summan blir " + summa);
    }
}
