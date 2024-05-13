package Assignment5ArraysandStrings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Reviver";

        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        String reversedString = new String(chars);
        System.out.println("Reversed string: " + reversedString);
    }
}
