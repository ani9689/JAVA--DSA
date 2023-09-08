import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={20,55,2,7,9};
        Selection(arr);
        System.out.println("Array after sorting is:");
        //time complexity(n2)
        //it is stable sorting
        System.out.println(Arrays.toString(arr));
    }

    private static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_dix=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_dix])
                    min_dix=j;
            }
            if (min_dix!=i){
                int temp=arr[min_dix];
                arr[min_dix]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
