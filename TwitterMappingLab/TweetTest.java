

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class TweetTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TweetTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class TweetTest
     */
    public TweetTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testmethod()
    {
        Tweet tt = new Tweet("Name","hi", null, null);
        tt.calculateSentiment();
        tt.toString();
    }
    @Test
    public void calculateSentimentTest()
    {
        Tweet tt = new Tweet("Name","hi", null, null);
        tt.calculateSentiment();
        
    }
}
