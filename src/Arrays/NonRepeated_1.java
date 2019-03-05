package Arrays;

public class NonRepeated_1 {


    public static void findNonrepeated(int arr[]){


        for (int i=0;i<arr.length;i++){



                while (i<arr.length){

                    if(arr[i]!=arr[i+1]){

                        System.out.println(arr[i]+" ");
                    }

                   i= i+2;
                }

            /*if(count==0){

                System.out.println(arr[i]+" ");
            }*/
            }

    }

    public static void main(String args[]){
        int[] nums = {5,2,7,2,4,7,8,2,3};
        findNonrepeated(nums);
    }


}
