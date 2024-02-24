import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public static List<String> fizzbuzz(int n){
        List<String> answeStrings = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            if (i%3==0 && i%5==0) {
                answeStrings.add("FizzBuzz");
            }
            else if (i%3==0) {
                answeStrings.add("Fizz");
            } else if(i%5==0){
                answeStrings.add("Buzz");
            }else{
                answeStrings.add(Integer.toString(i));
            }
        }
        return answeStrings;
    }
    public static void main(String[] args) {
        int n = 30;
        List<String> answer = fizzbuzz(n);
        for (String s : answer) {
            System.out.print(s+" ");
        }
    }
}
