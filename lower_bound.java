import java.util.Scanner;

public class lower_bound {
    public static void main(String args[]){
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements you want : ");
        m=sc.nextInt();

        int arr[] = new int[m];

        int i;

        System.out.println("enter the elements : ");
        for(i = 0 ; i < m ; i++){
            arr[i]=sc.nextInt();
        }

        int target;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("enter the target: ");
        target = sc1.nextInt();
        int result=-lower_bound(arr , target) ;
        if(result==-1)System.out.println("Element not found");
        else System.out.println("elemnt found at:"+result);
    }

    private static int lower_bound(int[] arr, int target) {
        int low=0, high= arr.length-1;
        int result=-1;
        while (low<=high)
        {
            int mid = low + (high - low) / 2;    // to avoid integer overflow

            if (arr[mid] == target) {
                result = mid;
                high=mid-1;
            }
            else if (arr[mid] > target)high = mid - 1;
            else low = mid + 1;
        }
        return result;
    }
}
