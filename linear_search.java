public class linear_search {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,6,0};
        int target=5;
        int idx=-1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==target) {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            System.out.println("Not found an elemnt");
        }
        else{
            System.out.println("Elemnt found at index :"+idx);
        }

    }
}
