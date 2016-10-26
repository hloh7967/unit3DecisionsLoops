
import java.util.Scanner;
/**
 * Write a description of class Note here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Note
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    public static void main(String[] args)
    {
        /*
         * evaluates a boolean condition (life if satement)
         * if true executes the statements
         * re-evaluates the boolean condition
         * contineus until condition is false
         */
        
        final int LIMIT = 5;
        int count = 1;
        
        while (count<=LIMIT)
        {
            System.out.println(count);
            count += 1;
        }
        
        System.out.println("Done");
        
        /*
         * Common Bug infinite loop
         */
        count = 1;
        //while (count != 50)
        //{
          //  System.out.println(count);
            //count += 2;
        //}
        while (count < 50)
        {
            System.out.println(count);
            count +=2;
        }
        
        /*
         * for loop:
         * three parts;
         * 1. initialization- executed once
         * 2. condition tested at the startt of iteration
         * 3. increment -executed at the end of each iteration, before testing condition
         */
        for ( int count2 = 1;
                 count2 <=LIMIT;
                 count2++)
        {
            System.out.println( count2);
        }
        System.out.println("done");
        
        for (int i = 0;
        i<=10;
        i++)
        {
            System.out.println(i);
        }
    }

    public static void doExample()
    {
        /*
         * do loop
         * executes body of the loop.
         * then evaluates boolean condition
         * if true executes body again.
         * false cointinues after loop
        */
       int count = 1;
       do
       {
           System.out.println(count);
           
           count += 1;
        }
        while(count <=5);
        

    }
    
    public static void sentinelExample()
    {
        /*
         * awnriWL value
         * values use to terminate a  while/do loop.
         * often these values are entered by the user
         */
        int sum = 0;
        int value = 0;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.print("Enter an integer (0 to quit): ");
            value = s.nextInt();
            sum += value;
        } while(value!= 0);
        System.out.println("sum: " + sum);
    }
    
    public static void sentinalExample2()
    {
        /*
         * awnriWL value
         * values use to terminate a  while/do loop.
         * often these values are entered by the user
         */
        int sum1 = 0;
        int value1 = 0;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter an integer (-1 to quit): ");
            value1 = s.nextInt();
            if(value1 ==-1)
            {
                break;
            }
            sum1+= value1;
        } 
        System.out.println("sum: " + sum1);
    }
    
    public static void sentinalExample3()
    {
        /*
         * awnriWL value
         * values use to terminate a  while/do loop.
         * often these values are entered by the user
         */
        int sum1 = 0;
        int value1 = 0;
        Scanner s = new Scanner(System.in);
        while (value1 !=-1)
        {
            System.out.print("Enter an integer (-1 to quit): ");
            value1 = s.nextInt();
            if(value1 ==-1)
            {
                /*
                 * skips to the end of the inner most loop
                 * reevaluate the loop condition at this point
                 * 
                 */
                continue;
            }
            sum1+= value1;
        } 
        System.out.println("sum: " + sum1);
    }
}
