package fr.wildcodeschool.unittesting;

import fr.wildcodeschool.unittesting.exception.InvalidStringException;

import java.util.Arrays;
import java.util.LinkedHashSet;

import org.apache.commons.lang3.ArrayUtils;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if(candidate ==  null) {
            throw new InvalidStringException("Le mot ne peut pas être null");
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    public static String uniqueVowels(String s) {
        if(s ==  null) {
            throw new InvalidStringException("Le mot ne peut pas être null");
        }

        String vowels = vowels(s);

        if(vowels == "") {
            return "Ce mot n'a pas de voyelles.";
        }

        char[] letters = vowels.toCharArray();
        LinkedHashSet<Character> characterSet = new LinkedHashSet<Character>(
                Arrays.asList(
                        ArrayUtils.toObject(
                                s.toCharArray()
                        )
                )
        );

        String result = "";
        for(Character letter: characterSet) {
            result +=  letter.charValue();
        }
        return result;

    }
}