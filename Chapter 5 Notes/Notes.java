public class Notes
{
    public static void main( String[] args )
    {
        /*
         * Math.random returns a double between 0.0 (inclusive) and
         *      1.0 (exclusive)
         *      
         *      To generate a random integer between 0 (inclusvie) and 
         *          x (exclusive), multiply by x and cast to an int.
         *      For example:    
         *          (int)(Math.random() * x);
         */
        
        // 1: heads; 0: tails
        int coin = (int)(Math.random() * 2);
        
        /*
         * if statement:
         *      conditional expression goes inside parantheses
         *      statements are grouped by blocks (e.g., {}) not indentation
         *      no colon (unlike Python)
         *      
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        
        /*
         * { } are not required for a single statement, but good idea
         *      leaving them out can lead to bugs like this
         */
        if( coin == 0 )
            System.out.println( "Coin is tails!" );
            System.out.println( "Better luck next time..." );
            
        /*
         * if-else statement:
         *      else block is executed if the conditional for the if
         *          statement is false
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        else
        {
            System.out.println( "Coin is tails!" );
            System.out.println( "Better luck next time..." );
        }
        
        // simulate the roll of a six-sided die (values 1-6)
        int dieRoll = (int)(Math.random() * 6) + 1;
        
        /*
         * if-else if-else statement
         *      else if is used instead of elif
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
            System.out.println( "rolled a 4, 5, or 6" );
        }
        
    }
    
}





