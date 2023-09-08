public class Duplicate_num_Array1 {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,6,0,4,2};
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j])
                    System.out.println(arr[i]);
            }

        }
    }
}
