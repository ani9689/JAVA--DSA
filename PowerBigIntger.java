import java.math.BigInteger;
import java.util.Scanner;

public class PowerBigIntger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b =");
        BigInteger a =sc.nextBigInteger();
        int b =sc.nextInt();
        BigInteger result = powerBig(a,b);
        System.out.println("the power a^b="+result);
    }

    private static BigInteger powerBig(BigInteger a, int b) {
        BigInteger result,finalresult;
        if (b==1){
            return a;
        }
        else{
            result=powerBig(a,b/2);
            finalresult=result.multiply(result);
            if (b%2==0){
                return finalresult;
            }
            else {
                return a.multiply(finalresult);
            }

        }
    }
}
