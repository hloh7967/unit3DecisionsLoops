import java.util.Scanner;

/**
 * Write a description of class Factoring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factoring
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String list = "";
        System.out.println("Type a positive integer");
        int given = s.nextInt();
        for (int i = 2; i<given; i++)
        {
            if (given/i == ((double) given) / i)
            {
                list = list + " " + (given/i);
            }
        }
        System.out.println(list);
    }
}
