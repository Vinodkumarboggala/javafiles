public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Take input string and index value from user
    System.out.println("Enter a string:");
    String inputString = sc.nextLine();
    
    System.out.println("Enter an index value (0-" + (inputString.length() - 1) + "):");
    int index = sc.nextInt();
    
    try {
        // Try to get character at specified index
        char c = inputString.charAt(index);
        System.out.println("Character at index " + index + " is " + c);
    } catch (StringIndexOutOfBoundsException e) {
        // Handle StringIndexOutOfBoundsException
        System.out.println("Error");
    }
    
    sc.close();
}
