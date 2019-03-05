package Strings;

/**
 * Created by vkittala on 7/28/2018.
 */
public class subString {


    public static int subString(String s1, String s2) {

        for (int i = 0; i < s2.length(); i++) {

            for(int j=0;j<s1.length();j++){

                if(s2.charAt(i)==s1.charAt(j))

                    return j;


            }

        }


        return -1;


    }

   public static void main(String args[]){


       String s2 = "for";
       String s1 = "geeksforgeeks";

       int res = subString(s1, s2);

       if (res == -1)
           System.out.println("Not present");
       else
           System.out.println("Present at index "
                   + res);

       System.out.println("Using indexOf "+s1.indexOf(s2));
       System.out.println("Using lastIndexOf "+s1.lastIndexOf(s2));

       boolean isFound = s1.contains(s2);

       if(isFound==true){

           System.out.println("Yes");
       }
       else
           System.out.println("Not found");




   }




}
