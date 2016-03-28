package edu.tomer.ness;

import java.util.Scanner;

/**
 * Created by Dev on 28/03/2016.
 */
public class IO {

     static Scanner scan = new Scanner(System.in);

     //
     /*
     * sdffsd
     * dffsd
     * */


    /**
     * prints an output to the console (prompt)
     * @param prompt the text to display to the user of the console
     * @return true if user enters y or yes or true (Ignores Case)
     */
    static boolean nextBoolean(String prompt){
          System.out.println(prompt);
          String input = scan.next();
          return  (input.equalsIgnoreCase("y") ||
                   input.equalsIgnoreCase("yes") ||
                   input.equalsIgnoreCase("true"));
     }
}
