import java.lang.invoke.StringConcatFactory;

public class CompresString {
    // public static String getCompressString(String str){
    // int count = 0;
    // char ch = str.charAt(0);
    // String answerString = " ";
    // for (int i = 0; i < str.length(); i++) {
    // if (ch == str.charAt(i)) {
    // count++;
    // }else{
    // answerString+=ch;
    // if(count>1){
    // answerString+=count;
    // count = 1;
    // }
    // ch = str.charAt(i);
    // }
    // if (i == str.length()-1) {
    // answerString += str.charAt(i);
    // if (count>1) {
    // answerString+=count;
    // count= 1;
    // }
    // }
    // }
    // return answerString;
    // }

    // using recursion
    public static String getCompressString(String str, int idx) {
        if (idx >= str.length()) {
            return "";
        }

        int count = 1;
        StringBuilder compressed = new StringBuilder();

        for (int i = idx + 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(idx)) {
                count++;
            } else {
                break;
            }
        }

        compressed.append(str.charAt(idx));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString() + getCompressString(str, idx + count);
    }

    public static void main(String[] args) {
        String str = "aaabbccdsaaa";
        // System.out.println(getCompressString(str));
        System.out.println(getCompressString(str, 0));

    }
}
