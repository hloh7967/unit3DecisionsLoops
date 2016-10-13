
public class Notes
{
    public static void main( String[] args )
    {
        /*
         * Math.random() returns a double between 0.0 (inclusive) and
         *      1.0 (exclusive)
         *      
         *      To generate a random integer between 0 (inclusive) and
         *          x (exclusive), multiply by x and cast to an int:
         *          
         *          (int)(Math.random() * x);
         */
        
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * if statement
         *      statements are executed if the conditional expression is true
         *      conditional expression must go inside of parentheses
         *      statements are grouped by blocks (i.e., { } )
         *          not by indentation like in Python
         *      no colon after the conditional expression (unlike Python)    
         */
        if( coinFlip == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        
        /*
         * { } are not required for a single statement
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        if( coinFlip == 0 )
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
            
        /*
         * if-else statement
         *      else block is executed if the conditional for the if
         *          statement is false
         */
        if( coinFlip == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        else
        {
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
        }
        
        // simulate the roll of a four-sided die (1-4)
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *      in Java, "else if" is used instead of elif like Python
         */
        if( dieRoll == 1 )
        {
            System.out.println( "rolled a 1" );
        }
        else if( dieRoll == 2 )
        {
            System.out.println( "rolled a 2" );
        }
        else if( dieRoll == 3 )
        {
            System.out.println( "rolled a 3" );
        }
        else
        {
            System.out.println( "rolled a 4" );
        }
    }
}






