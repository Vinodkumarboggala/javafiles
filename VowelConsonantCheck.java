import java.util.Scanner;

public class VowelConsonantCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        
        String vowels = "aeiouAEIOU";
        
        if (vowels.indexOf(ch) != -1) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }

}
