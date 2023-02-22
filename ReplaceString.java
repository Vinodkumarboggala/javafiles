import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter a character to replace with: ");
        char newChar = sc.next().charAt(0);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }

        String newStr = new String(chars);
        System.out.println("New string: " + newStr);
    }
}
