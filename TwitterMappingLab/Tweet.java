import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import twitter4j.*;

/**
 * takes a tweet, username, text, location, date and calculates sentiment.
 * 
 * @author Harrison Loh 
 * @version 11/17/16
 */
public class Tweet
{
    /** description of instance variable x (add comment for each instance variable) */
    private String user;
    private String text;
    private twitter4j.GeoLocation location;
    private Date date;
    public double sentiment;
    /**
     * Creates User, Text,Location, date, and sentiment
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
     * calculates the sentiment of a text and averages it.
     */
    public void calculateSentiment()
    {
         SentimentDictionary line = SentimentDictionary.getSingleton();
         Scanner s = new Scanner(text);
         double value = 0;
         int count = 0;
         while (s.hasNext() && s != null && location != null && date != null) {
             value += line.getSentiment(s.next());
             count += 1;
            }
         sentiment = value/count;
    }
    /**
     * Makes the toString for the user, text, location, and date.
     */
    public String toString()
    {
        String ret = "The user is: " + user + ". The text given is: " + text + 
        ". The location given is: " + location + ". The date given is: " + date;
        return ret;
    }
}
