import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bradth = sc.nextInt();
        int length = sc.nextInt();
        int area = 0;
        try {
            area = length*bradth;
            System.out.println(area);
        } catch (java.lang.Exception e) {
            if (bradth<=0 && length<=0) {
                System.out.println("Breadth and height must be positive");
            }
        }
    }
}
