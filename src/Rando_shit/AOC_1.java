package Rando_shit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AOC_1 {
    public static void main(String[] args) {
        Scanner in = null;
        {
            try {
                in = new Scanner(new File("AoC_1_input"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        int[] tal = new int[200];
        int count = 0;

        while (in.hasNext()) {
            tal[count] = in.nextInt();
            count++;
        }
        for(int i = 0;i <= tal.length - 1;i++){
            boolean b = false;
            int T1 = tal[i];
            for (int i2 = 0;i2 <= tal.length - 1;i2++){
                if (tal[i2] + T1 == 2020) {
                    System.out.println(tal[i2] * T1);
                    b = true;
                    break;
                }
            }
            if (b)
            break;
        }
    }
}