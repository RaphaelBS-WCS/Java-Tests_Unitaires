package fr.wildcodeschool.unittesting;

import fr.wildcodeschool.unittesting.exception.InvalidStringException;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUniqueVowels {

     @Test
    public void testUniqueVowels() {
         String s = "aaa";
         StringUtils stringUtils = new StringUtils();
         String result = stringUtils.uniqueVowels(s);
         assertEquals("a", result);

         String s1 = "ee";
         StringUtils stringUtils1 = new StringUtils();
         String result1 = stringUtils.uniqueVowels(s1);
         assertEquals("e", result1);

         String s2 = "uuuuuuuuuuuuuuuuuu";
         StringUtils stringUtils2 = new StringUtils();
         String result2 = stringUtils.uniqueVowels(s2);
         assertEquals("u", result2);
     }

     @Test
    public void testUniqueVowelsWithNoVowels() {
         String s = "zzzpppppp";
         StringUtils stringUtils = new StringUtils();
         String result = stringUtils.uniqueVowels(s);
         assertEquals("Ce mot n'a pas de voyelles.", result);
     }

    @Test(expected = InvalidStringException.class)
    public void testUniqueVowelsWithNullValue() {
        StringUtils stringUtils = new StringUtils();
        stringUtils.uniqueVowels(null);
    }
}
