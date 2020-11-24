import java.util.Scanner;
/**
 * Write a description of class MagpieRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagpieRunner
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MagpieRunner
     */
    public static void main (String[] args)
    {
        Mag maggie = new Mag();
        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        while (!statement.equals("Bye"))
        {
            System.out.println(maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}
