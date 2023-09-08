public class Pallidrome_array {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,6,0,4,2};
        int m= arr.length;
        int flag=0;
        for(int i=0;i<m/2;i++)
        {
            if (arr[i] != arr[m - i - 1])
            {
                System.out.println("It is not a pallidrome");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("it is pallidrome array");
        }

    }
}
