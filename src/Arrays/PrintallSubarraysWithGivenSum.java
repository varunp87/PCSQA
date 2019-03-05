package Arrays;

/**
 * Created by vkittala on 6/8/2018.
 */
public class PrintallSubarraysWithGivenSum {




        // Function to print all sub-arrays with 0 sum present
        // in the given array
        public static void printallSubarrays(int[] A)
        {
            // consider all sub-arrays starting from i
            for (int i = 0; i < A.length; i++)
            {
                int sum = A[i];

                // consider all sub-arrays ending at j
                for (int j = i+1; j < A.length; j++)
                {
                    // sum of elements so far
                    sum += A[j];

                    // if sum is seen before, we have found a sub-array with 0 sum
                    if (sum == 23) {
                        System.out.println("Subarray [" + i + ".." + j + "]");
                    }
                }
            }
        }

        // main function
        public static void main (String[] args)
        {
          // int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
            int A[] = {15, 2, 4, 8, 9, 5, 10, 23};

            printallSubarrays(A);
        }
    }




