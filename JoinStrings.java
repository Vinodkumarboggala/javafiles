import java.util.Scanner;

public class JoinStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        char[] chars = new char[str1.length() + str2.length()];

        int i = 0;
        for (char c : str1.toCharArray()) {
            chars[i] = c;
            i++;
        }

        for (char c : str2.toCharArray()) {
            chars[i] = c;
            i++;
        }

        String newStr = new String(chars);

        System.out.println("Concatenated string: " + newStr);
    }
}
