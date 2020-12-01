package Rando_shit;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nväkommen till Adams gissnings spel för intruktioner skriv 101\n\n\n\n");
        int R = (int) (Math.random()*100) + 1;
        Scanner tgb = new Scanner(System.in);
        int Gissning = 0;
        int Gissningar = 0;
        boolean come_on_man = false;
        do {
            Gissningar++;
            do {
                come_on_man = false;
                try {
                    Gissning = Integer.parseInt(tgb.nextLine());
                } catch (NumberFormatException e) {
                    come_on_man = true;
                    System.out.println("Skriv ett nummer din dumma jävel.");
                }
            } while (come_on_man);
            if (R > Gissning){
                System.out.println("Gissa högre");
            }else if (R < Gissning && Gissning < 100){
                System.out.println("Gissa Lägre");
            }else if (Gissning >= 101){
                System.out.println("Du börjar spelet genom att gissa på ett valfrit nummer mellan 1 och 100 genom att skriva det här.\nSedan kommer datorn säga om du bör gissa högre eller lägre, och du gör en ny gissning.\nFörsök få så låg poängen möjligt.\n\nLycka till!");
                Gissningar--;
            }
        } while (R != Gissning);
        System.out.println("Du gissade rätt talet var " + R + " och det tog " + Gissningar + " antal gissningar!");
    }
}
