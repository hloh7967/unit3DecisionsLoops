import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import twitter4j.*;

/**
 * Write a description of class Tweet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tweet
{
    /** description of instance variable x (add comment for each instance variable) */
    private String user;
    private String text;
    private twitter4j.GeoLocation location;
    private Date date;
    private double sentiment;
    /**
     * Default constructor for objects of class Tweet
     */
    public Tweet(String u, String t, twitter4j.GeoLocation l, Date d)
    {
        user = u;
        text = t;
        location = l;
        date = d;
        Tweet.this.calculateSentiment();
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void calculateSentiment()
    {
         SentimentDictionary line = SentimentDictionary.getSingleton();
    }

}
