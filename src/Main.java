public class Main {
    public static void main(String[] args)
    {

        try
        {
            checkNumber("111");
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