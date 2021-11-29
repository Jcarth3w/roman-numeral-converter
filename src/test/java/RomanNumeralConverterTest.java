import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest
{
    @Test
    public void convertSingleRNTest()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "x";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(10, convertedNumeral);
    }

    @Test
    public void convertDoubleRNTest()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "XI";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(11, convertedNumeral);
    }

    @Test
    public void convertTripleRNTest()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "XII";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(12, convertedNumeral);
    }


    @Test
    public void convertNineNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "IX";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(9, convertedNumeral);
    }

    @Test
    public void convertFourNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "IV";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(4, convertedNumeral);
    }


    @Test
    public void convertFourteenNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "XIV";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(14, convertedNumeral);
    }

    @Test
    public void convertFortyNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "XL";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(40, convertedNumeral);
    }

    @Test
    public void convertNinetyNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "XC";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(90, convertedNumeral);
    }

    @Test
    public void convertFourHundredNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "CD";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(400, convertedNumeral);
    }

    @Test
    public void convertNineHundredNumeral()
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String numeral = "CM";

        int convertedNumeral = converter.convertRN(numeral);
        Assertions.assertEquals(900, convertedNumeral);
    }





}
