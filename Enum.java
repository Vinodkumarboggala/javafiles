import java.util.Scanner;
public class Enum {
    enum Month {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }

        public int print_Days() {
            return days;
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        Month month = input.getMonth();
        System.out.println("The number of days in " + month + " is " + month.print_Days() + ".");
    }

    static class Input {
        public Month getMonth() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a month: ");
            String input = scanner.nextLine().toUpperCase();
            return Month.valueOf(input);
        }
    }
}
