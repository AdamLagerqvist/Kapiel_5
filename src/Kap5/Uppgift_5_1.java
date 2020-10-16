package Kap5;

import javax.swing.*;

public class Uppgift_5_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("n?"));
        int k = 1;
        int summa = 0;
        while (k <= n){
            summa = k * k + summa;
            ++k;
        }
        JOptionPane.showMessageDialog(null, "Summan blir " + summa);
    }
}
