package Rando_shit;

public class Medelvarde {
    public static void main(String[] args) {
        double[] Test = {1.5,2.5};
        double medel_Test = medelvärde(Test);
        System.out.println(medel_Test);
    }
    public static double medelvärde(double[] doubleArray){
        double summa = 0;
        for (int i=0; i < doubleArray.length; i++){
            summa += doubleArray[i];
        }
        return summa / doubleArray.length;
    }
}
