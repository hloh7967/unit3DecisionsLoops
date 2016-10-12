

/**
 * Write a description of class Chapter5Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chapter5Notes
{
    public static void main(String[] args)
    {
        /*
         * Math.random returns a double between 0.0 (inclusive between 0.0 and 1.0)
         * 
         * To generate a random integer between 0 and x, multiply by x and cast to an int. For ex:
         * 
         * (int)(Math.random()*x);
         */
        // 1: heads; 0: tails
        int coin = (int)(Math.random()*2);
        
        /* if statement:
         *  conditional expressions goes inside parentheses
         *  statement are grouped by blocks (e.g. {}) not indentation
         *  no colon (unlike Python)
         */
        if (coin == 1)
        {
            System.out.println("Coin is heads!");
        }
        if (coin == 0)
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        }
    }
    
}