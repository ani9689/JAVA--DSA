public class fibonacci {
    public static int fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        int n = 9;
        System.out.print("The nth fibonacci number is : " + fibonacci(n));
    }
}
