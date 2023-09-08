import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={20,55,2,7,9};
        bubblesort(arr);
        System.out.println("Array after sorting is:");
        //time complexity(n2)
        //it is stable sorting
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length-i-1; j++) {

                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }


            }
            if(!swapped){
                break;

            }


        }
    }
}
