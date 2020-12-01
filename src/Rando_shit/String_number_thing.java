package Rando_shit;

public class String_number_thing {
    public static void main(String[] args) {
        String Test = "Test";
        Character CharArray[] = Splitter(Test);
        System.out.println(Test);
    }
    public static Character[] Splitter(String S){
        Character Yep[] = new Character[S.length()];
        for (int i = 0; i < S.length(); i++){
            Yep[i] = S.charAt(i);
        }
        return Yep;
    }
    public static int Antal_nummer(Character[] bunga) {
        return 0;
    }
}
