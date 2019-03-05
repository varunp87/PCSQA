package Practise;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RearrangePositiveNegative {

    public static void arrange(int[] arr) {
        ArrayList<Integer> arrPositive = new ArrayList<>();
        ArrayList<Integer> arrNegative = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) {

                arrNegative.add(num);

            } else {
                arrPositive.add(num);


            }
        }

        int n = arrPositive.size();
        int m = arrNegative.size();

        System.out.println("n"+n);
        System.out.println("m"+m);


        int i = 0;
        int j = 0;
        while (i<arr.length) {

            if(n>0) {
                System.out.print(arrPositive.get(i) + " ");

            }
            if(m>0) {
                System.out.print(arrNegative.get(i) + " ");
            }
            i++;
            n--;
            m--;
        }


    }


    public static void main(String[] args) throws java.lang.Exception {
        int[] arrA = {1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14};
        arrange(arrA);


    }
}