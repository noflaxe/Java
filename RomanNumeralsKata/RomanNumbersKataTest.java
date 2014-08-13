package sandbox;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nazar_Sheremeta on 8/13/14.
 */
public class RomanNumbersKataTest {

    private RomanNumbersKata romanNum;

    @Before
    public void init(){
        romanNum = new RomanNumbersKata();
    }

    @Test
    public void convertOne() throws Exception {
       assertEquals("I",romanNum.convertToRoman(1));
    }

    @Test
    public void convertFive() throws Exception {
        assertEquals("V",romanNum.convertToRoman(5));
    }

    @Test
    public void convertSix() throws Exception {
        assertEquals("VI",romanNum.convertToRoman(6));
    }

    @Test
    public void convertFifteen() throws Exception {
        assertEquals("XV",romanNum.convertToRoman(15));
    }

    @Test
    public void convertSquareNumber() throws Exception {
        assertEquals("XXV",romanNum.convertToRoman(25));
    }

    @Test
    public void convertFour(){
        assertEquals("IV",romanNum.convertToRoman(4));
    }

    @Test
    public void converFortyNine(){
        assertEquals("XLIX",romanNum.convertToRoman(49));
    }
}
