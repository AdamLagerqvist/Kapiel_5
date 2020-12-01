package Rando_shit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AOC_1_2 {
    public static void main(String[] args) {
        Scanner in = null;
        {
            try {
                in = new Scanner(new File("AoC_1_2_input"));
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
            for(int i2 = 0;i2 <= tal.length - 1;i2++) {
                int T2 = tal[i2];
                for (int i3 = 0; i3 <= tal.length - 1; i3++) {
                    if (tal[i3] + T1 + T2 == 2020) {
                        System.out.println(tal[i3] * T1 * T2);
                        System.out.println(tal[i3] + " " + T1 + " "+ T2);
                        b = true;
                        break;
                    }
                }
                if (b)
                    break;
            }
            if (b)
                break;
        }
    }
}