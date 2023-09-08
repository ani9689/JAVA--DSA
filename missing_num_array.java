public class missing_num_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        int n=arr.length;
        int sum=0;
        int SumOfArrayE=((n+1)*(n+2))/2;
        for (int i = 0; i <n ; i++) {
            sum=sum+arr[i];

        }
        System.out.println(SumOfArrayE-sum);
    }
}
