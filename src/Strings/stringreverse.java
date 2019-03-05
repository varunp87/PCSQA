package Strings;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by vkittala on 7/8/2018.
 */
public class stringreverse {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String reverseStr= "";
       // String str = "Sony is going to introduce Internet TV soon";
        String str = "abcd";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
       //  reverseStr = new StringBuffer(str).reverse().toString();
      //  System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
       // reverseStr = reverse(str);
       // System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        System.out.println("lenght is "+str.length());
        if (str.length() < 2) {
            return str;
        }

        System.out.println("value:"+str.substring(1)+str.charAt(0));

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }



}
