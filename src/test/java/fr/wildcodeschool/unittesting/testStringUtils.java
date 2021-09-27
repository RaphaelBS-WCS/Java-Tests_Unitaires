package fr.wildcodeschool.unittesting;

import fr.wildcodeschool.unittesting.exception.InvalidStringException;
import org.junit.Test;
import static org.junit.Assert.*;

public class testStringUtils {
    @Test
    public void testVowels() {
        String candidate = "candidate";
        StringUtils  stringUtils = new StringUtils();
        String result = stringUtils.vowels(candidate);
        assertEquals("aiae", result);

        String candidate2 = "banane";
        String result2 = stringUtils.vowels(candidate2);
        assertEquals("aae", result2);

        String candidate3 = "a";
        String result3 = stringUtils.vowels(candidate3);
        assertEquals("a", result3);
    }

    @Test(expected = InvalidStringException.class)
    public void testVowelsWithNullValue() {
        StringUtils stringUtils = new StringUtils();
        stringUtils.vowels(null);
    }


}
