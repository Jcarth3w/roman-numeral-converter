public class RomanNumeralConverter
{
    public int convertRN(String numeral)
    {
        int totalValueOfRN = 0;
        for(int i = 0; i < numeral.length(); i ++)
        {
            if(numeral.charAt(i) == 'I')
            {
                try
                {
                    if(numeral.charAt(i+1) == 'X' || numeral.charAt(i+1) == 'V')
                    {
                        totalValueOfRN -= 1;
                    }
                    else
                    {
                        totalValueOfRN++;
                    }
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    totalValueOfRN++;
                }

            }
            else if(numeral.charAt(i) == 'V')
            {
                totalValueOfRN += 5;
            }
            else if(numeral.charAt(i) == 'X')
            {
                try
                {
                    if(numeral.charAt(i+1) == 'L' || numeral.charAt(i+1) == 'C')
                    {
                        totalValueOfRN -= 10;
                    }
                    else
                    {
                        totalValueOfRN += 10;
                    }
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    totalValueOfRN += 10;
                }
            }
            else if(numeral.charAt(i) == 'L')
            {
                totalValueOfRN += 50;
            }
            else if(numeral.charAt(i) == 'C')
            {
                try
                {
                    if(numeral.charAt(i+1) == 'D' || numeral.charAt(i+1) == 'M')
                    {
                        totalValueOfRN -= 100;
                    }
                    else
                    {
                        totalValueOfRN += 100;
                    }
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    totalValueOfRN += 100;
                }
            }
            else if(numeral.charAt(i) == 'D' || numeral.charAt(i) == 'd')
            {
                totalValueOfRN += 500;
            }
            else if(numeral.charAt(i) == 'M' || numeral.charAt(i) == 'm')
            {
                totalValueOfRN += 1000;
            }
        }
        return totalValueOfRN;
    }
}
