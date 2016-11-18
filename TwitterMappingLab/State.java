import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import twitter4j.*;

/**
 * Makes a state with abbreviation, center, area, and sentiment.
 * 
 * @author Harrison Loh 
 * @version 11/17/16
 */
public class State
{
    /**
     * Sets abbreviation of state, center of state, area of state, and sentiment of state.
     */
    private String abbreviation;
    private twitter4j.GeoLocation center;
    private double area;
    public double sentiment;
    /**
     * Default constructor for objects of class State
     */
    public State(String abr, twitter4j.GeoLocation c, double a)
    {
        abbreviation = abr;
        center = c;
        area = a;
        sentiment = 0;
    }

    /**
     * Sets the sentiment value for the instance variable
     */
    public void setSentiment(double sentval)
    {
        this.sentiment = sentval;
    }
    
    
    /*
     * Gets the state abbreviation
     */
    public String getAbbreviation()
    {
        return abbreviation;
    }
    /*
     * Gets the center of the states
     */
    public twitter4j.GeoLocation getCenter()
    {
        return center;
    }
    /*
     * Gets the Area of the State
     */
        public double getArea()
    {
        return area;
    }
    /*
     * Gets the sentiment
     */
        public double getSentiment()
    {
        return sentiment;
    }
    /*
     * Gets the Radius of the State
     */
    public double getRadius()
    {
        double rad = Math.sqrt(area/3.14);
        return rad;
    }
    /*
     * ToString returns instance varib. in strings.
     */
    public String toString()
    {
        String val = "The State abbreviation is " + abbreviation + ". The center is " + center
        + ". The area is " + area + ". The sentiment is " + sentiment;
        return val;
    }
}