public class power {
    public static void main(String[] args) {
        int a=2,b=9;
        int answer=powerA(a,b);
        System.out.println(answer);
    }

    private static int powerA(int a, int b) {
        if (b==0)
            return 1;
        return a*powerA(a,(b-1));
    }
}
