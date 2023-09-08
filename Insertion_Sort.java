import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={1,3,45,66,33,55,88,45,32,41};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
    }
}
