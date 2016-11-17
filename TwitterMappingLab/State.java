import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import twitter4j.*;

/**
 * Write a description of class State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class State
{
    /** description of instance variable x (add comment for each instance variable) */
    private String abbreviation;
    private twitter4j.GeoLocation center;
    private double area;
    private double sentiment;
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
    public void setSentiment(double sentval)
    {
        this.sentiment = sentval;
    }
    

    public String getAbbreviation()
    {
        return this.abbreviation;
    }
    public twitter4j.GeoLocation getCenter()
    {
        return this.center;
    }
        public double getArea()
    {
        return this.area;
    }
        public double getSentiment()
    {
        return this.sentiment;
    }
    
    public double getRadius()
    {
        double rad = Math.sqrt(area/3.14);
        return rad;
    }
    
    public String toString()
    {
        String val = "The State abbreviation is " + abbreviation + ". The center is " + center
        + ". The area is " + area + ". The sentiment is " + sentiment;
        return val;
    }
}