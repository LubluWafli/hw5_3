import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);

    String input = scan.nextLine();
        try
        {
            checkNumber(input);
        }
        catch(Exception e)
        {
            System.out.println("Строка не должна содержать число!!");
        }
    }

   static void checkNumber(String a)
    {
        for(char chr : a.toCharArray())
        {
            if (Character.isDigit(chr))
            {
                throw new NumberFormatException();
            }
        }

    }
}