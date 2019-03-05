package Strings;

public class LongestWordLength {


    static int LongestWordLength(String str)
    {
        String[] words = str.split(" ");
        int length = 0;

        for(String word:words){
            if(length < word.length()){
                length = word.length();
            }
        }
        return length;
    }

    // Driver code
    public static void main(String args[])
    {
        String str = "I am an intern at geeksforgeeks";

        System.out.println(LongestWordLength(str));
    }
}
