package sandbox;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Created by Nazar_Sheremeta on 8/13/14.
 */
public class RomanNumbersKata {

    private static TreeMap<Integer,String> numberToRoman = Maps.newTreeMap(Collections.reverseOrder());

    static{
        numberToRoman.put(1000,"M");
        numberToRoman.put(900,"CM");
        numberToRoman.put(500,"D");
        numberToRoman.put(400,"CD");
        numberToRoman.put(100,"C");
        numberToRoman.put(90,"XC");
        numberToRoman.put(50,"L");
        numberToRoman.put(40,"XL");
        numberToRoman.put(10,"X");
        numberToRoman.put(9,"IX");
        numberToRoman.put(5,"V");
        numberToRoman.put(4,"IV");
        numberToRoman.put(1,"I");
    }

    public String convertToRoman(int number){
        StringBuilder result = new StringBuilder();
            while(number != 0){
                for (int candidateNumber : numberToRoman.keySet()) {
                    if(number/candidateNumber > 0){
                        result.append(convertNumberToRoman(candidateNumber));
                        number -= candidateNumber;
                        break;
                    }
                }
            }
        return result.toString();
    }

    private String convertNumberToRoman(int number){
       return Strings.nullToEmpty(numberToRoman.get(number));
    }
}
