/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        float tax = 0;
        System.out.print("What is the order amount? ");
        float order = s.nextFloat();
        System.out.print("What state do you live in? ");
        String state = s.next();
        if(state.equals("Wisconsin") == true){
            System.out.print("What county do you live in? ");
            String county = s.next();
            if(county.equals("Dunn") == true){
                tax = (float)(.055*order);
            }
            if(county.equals("Eau Claire") == true){
                tax = (float)(.054*order);
            }
            else{
                tax = (float)(order*.05);
            }
        }
        if(state.equals("Illinois") == true){
            tax = (float) (.08 * order);
        }
        if(state.equals("Illinois") == true || state.equals("Wisconsin") == true){
            System.out.println("The tax is $" + tax);
        }
        System.out.println("The total is $" + (tax+order));

    }
}
