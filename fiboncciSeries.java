public class fiboncciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 9;
        int c = 0;
        System.out.print(a);
        System.out.print(b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
