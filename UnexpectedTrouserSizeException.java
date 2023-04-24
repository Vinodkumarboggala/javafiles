import java.util.Scanner;

class UnexpectedTrouserSizeException extends Exception {
    public UnexpectedTrouserSizeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter waist size of the trouser: ");
        int size = scanner.nextInt();

        try {
            if (size < 18 || size > 40) {
                throw new UnexpectedTrouserSizeException("The demanded size is out of stock");
            } else {
                System.out.println("You have selected waist size " + size);
                // rest of the code for shopping
            }
        } catch (UnexpectedTrouserSizeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again with a different size.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
