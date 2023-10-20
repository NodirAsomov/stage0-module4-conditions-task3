package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;

public class AlphabeticCharacters {


    public void vowelDeterminer(char symbol) {

        if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')){
        if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' )
            System.out.println( "Vowel");
        else
            System.out.println("Consonant");
        } else
        System.out.println("wrong alphabet!");


    }



            public static void main(String[] args) {

        AlphabeticCharacters obj = new AlphabeticCharacters();
        obj.vowelDeterminer('я');

}
}

