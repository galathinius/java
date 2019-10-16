package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TextManipulation {

    ArrayList < words > words = new ArrayList < words > ();

    static void buildWordsList (String text){
        text = text.replace(",", "");
        text = text.replace(".", "");
        String[] words1 = text.split(" ");


        System.out.println(text);
    }

    public static int countWords (String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public static int countSentences (String text){
        String[] sentences = text.split("\\.");
        return sentences.length;
    }


    static Set<Character> vowels = new HashSet<Character>(Arrays.<Character>asList('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'));

    public static int countVowels(String text){
        int count = 0;
        for (char letter : text.toCharArray())
        {
            if (vowels.contains(letter)) count++;
        }

        return count;
    }

    static Set<Character> consonants = new HashSet<Character>();
    public static int countConsonants(String text){
        //entering the consonants in the set
        for (int i = 65; i < 91; i++){
            char letter = (char)i;
            if (!vowels.contains(letter))consonants.add(letter);
            letter = (char)(i + 'a' - 'A');
            if (!vowels.contains(letter))consonants.add(letter);
        }

        int count = 0;
        for (char letter : text.toCharArray())
        {
            if (consonants.contains(letter)) count++;
        }

        return count;
    }



}
