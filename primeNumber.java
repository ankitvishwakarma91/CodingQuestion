import java.math.*;
public class primeNumber {
    public static boolean CheckPrime(int n ){
        if(n <=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 5;
        if (CheckPrime(num)== true) {
            System.out.println("This is a prime no");
        }else{
            System.out.println("this is not a prime number");
        }
    }
}
