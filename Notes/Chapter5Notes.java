

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
    
    public static boolean floatsAreEqual( double num1, double num2)
    {
        /*
         * if we use the equality operator for doubles. it will only
         * return true if they are =
         * thais prob nto the case
         * we will check isn they are close enough
         * 
         */
        final double EPSILON = 1e-14;
        if (Math.abs(num1 - num2) <EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }

        //int result = str1.compareTo( str2);
        //String firstStr = null;
    }
    public static void printStudentClass(int gradeNumber)
    {
        /*
         * switch statement
         * another conditional like if
         * prefered when evaluation several discrete values
         * flow of execution jumps to the branch matching the expression
         * can be used for byte, short, char, int primitive types
         * enumeration and the String class.
         */
        switch(gradeNumber)
        {
            /* 
             * can have mulitiple cases that share the same statements
             * 
             */
            case 6:
            case 7:
            case 8:
            {
                System.out.println("Junior High");
                /*
                 * break causes the flow of execution to leave the switch without a break
                 * flow of execution continues
                 */
       
                break;
            }
            case 9:
            {
                System.out.println("Freshman");
                break;
            }
            case 10:
            {
                System.out.println("Sophomore");
                break;
            }
            case 11:
            {
                System.out.println("Junior");
                break;
            }
            case 12:
            {
                System.out.println("Senior");
                break;
            }
            
            default:
            {
                System.out.println("Elementary");
            }
        }
        
        
    }
    
    /*
     * Enumeration is a set of objects that represent a related set of choice
     * usually compared with the equality operator (==)
     * enumerations are capitalized like classes
     * enumerated values are capitalized like constants
     */
    public enum FilingStatus { SINGLE, MARRIED, HEAD_OF_HOUSEHOLD};
    
    
    /*
     * Filing Status        Standard Deduction
     * single               $6300
     * married jointly      $12600
     * head of household    $9250
     */
    public static void calculateStandardDeduction(FilingStatus status)
    {
        int deduction;
        switch (status)
        {
            case SINGLE:
            {
                deduction = 6300;
                break;
            }
            case MARRIED:
            {
                deduction = 12600;
                break;
            }
            case HEAD_OF_HOUSEHOLD:
            {
                deduction = 9250;
                break;
            }
        }
        if( status == FilingStatus.MARRIED)
        {
            System.out.println( "must file jointly");
        }
        
    }
    
    public static void incrementExample()
    {
        /*
         * post increment / decrement operators
         * equivalent to adding or subtracting 1
         * returns the current value then inrements or decrements
         * 
         */
        int b = 7;
        int a = b++;
        
        System.out.println("a= " + a + "; b = " + b); 
        /*
         * pre incremetn/ decorator operator
         * equivalent ot +- 1
         * returns the value after the increment or decrement
         */
        int c = 7;
        int d = ++c;
        
        System.out.println("d = " + d + "; c= "+ c );
        
        /*
         * assignment operators: += -= *= /= %=
         * same as Python
         * performs specified operation and then assigns the resulting value
         */
        int x = 7;
        int y = 7;
        int z = 7;
        x = x + 1;
        y++;
        z +=1;
        
        System.out.println( "x= "+ x + "; y = " + y + "; z = " +z);
    }
    
    
    }
