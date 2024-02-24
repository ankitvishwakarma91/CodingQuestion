public class Palindrome {
    public static boolean reversed(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "AmanaplanacanalPanama";
        if (reversed(name.toLowerCase())) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " Not a palindrome");
        }
    }
}
