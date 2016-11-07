import java.util.Scanner;

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How wide is the diamond");
        int value = s.nextInt();
        String prt;

        prt = "";
        for (int row = 1; row <= value; row++)
        {
        prt = "";
        for (int a = 1; a <=2*value -row; a++)
            {
                prt = prt + " ";

        }
            for (int i = 1; i <= (2*row-1); i++)
            {
                prt = prt + "*";
        }
        System.out.println(prt);
    }
    }
    
}
