package Arrays;

/**
 * Created by vkittala on 6/3/2018.
 */
public class findRepeatElement {

    void printRepeating(int arr[], int size)
    {
        int i, j;
        System.out.println("Repeated Elements are :");
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");

            }
            /*Below break is to find the first repeating element */
            //break;
        }
    }

    public static void main(String[] args)
    {
        findRepeatElement repeat = new findRepeatElement();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}
