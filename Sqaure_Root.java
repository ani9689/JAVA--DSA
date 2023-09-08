import java.util.Scanner;

public class Sqaure_Root {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Find the Square root of :-");
        int num= sc.nextInt();
        int result =SqureRoot(num);
        System.out.println("Root of it="+result);
    }

    private static int SqureRoot(int num) {
        int low=0,high=num,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if (val==num){
                return mid;
            }
            else if (val<num) {
                result =mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return result;

    }
}
