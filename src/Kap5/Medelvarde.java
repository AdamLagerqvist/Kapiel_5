package Kap5;

public class Medelvarde {
    public static void main(String[] args) {
        double[] Test;
        Test = new double[10];
        int i = 0;
        do {
            Test[i] = i;
            i++;
        } while (i >= 10);
        System.out.println(Test);
    }
}
