import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a roman numeral from 1-3000 or z to quit: ");
            String inputNumeral = input.nextLine();
            if(inputNumeral.equalsIgnoreCase("z"))
            {
                break;
            }
            else
            {
                System.out.println(converter.convertRN(inputNumeral));
            }


        }
    }
}
