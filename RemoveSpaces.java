import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int startIndex = 0;
        while (startIndex < chars.length && chars[startIndex] == ' ') {
            startIndex++;
        }

        int endIndex = chars.length - 1;
        while (endIndex >= 0 && chars[endIndex] == ' ') {
            endIndex--;
        }

        String newStr = new String(chars, startIndex, endIndex - startIndex + 1);

        System.out.println("New string without leading and trailing spaces: " + newStr);
    }
}
