package Strings;

/**
 * Created by vkittala on 7/21/2018.
 */
public class StringReverse1 {
    /* Function to print reverse of the passed string */
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
           System.out.print(str.charAt(str.length()-1));
           // System.out.println(str.length()-1);
           // System.out.println(str.substring(0,str.length()-1));
           // System.out.println(str.length()-1);
           // System.out.print("char"+ " " +str.length());
            System.out.print("char-1"+ " " +(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        //String str = "Geeks for Geeks";
        String str = "abcd";
        StringReverse1 obj = new StringReverse1();
        obj.reverse(str);


    }

}
