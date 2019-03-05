package Arrays;

/**
 * Created by vkittala on 6/3/2018.
 */
public class MyDisticntElements {

    public static void printDistinctElements(int[] arr){

       /* for(int i=0;i<arr.length;i++) {
            boolean isDistinct = false;
            //for(int j=0;j<i;j++)
            for (int j = 0; j < arr.length; j++) {

                if (i != j) {
                    if (arr[i] == arr[j]) {
                        isDistinct = true;
                        break;
                    }

                    if (!isDistinct) {
                        System.out.print(arr[i] + " ");
                    }

                }
            }
        }*/


        for (int i = 0; i < arr.length; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
                // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print( arr[i] + " ");
        }

    }

    public static void main(String a[]){
        int[] nums = {5,2,7,2,4,7,8,2,3};
        MyDisticntElements.printDistinctElements(nums);
    }
}
