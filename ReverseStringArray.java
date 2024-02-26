public class ReverseStringArray {
    public static void reverseStringArray(char s[]) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char arr[] = {'h', 'e', 'l', 'l', 'o'};

        reverseStringArray(arr);

        // Print the reversed array
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
