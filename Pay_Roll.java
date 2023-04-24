import java.util.HashMap;
import java.util.Scanner;


public class Pay_Roll {
    static HashMap<String,Double> map = new HashMap<>();

    public static void main(String[] args) {
        try {


            Scanner in = new Scanner(System.in);

            System.out.print("Enter Employee details Name: ");



            String name = in.nextLine();


            double salary = 0;




            System.out.println("\nEmployee Types:\n  F - Full Time\n  P - Part Time");
            System.out.print("Enter Employee Type:");
            String type = in.nextLine();



            if (type.compareToIgnoreCase("F") == 0) {
                FullTimeEmployee employee = new FullTimeEmployee(name);

                System.out.print("\nEnter Monthly Salary: ");

                double sal = in.nextDouble();
                salary = sal;

                employee.setMonthlySalary(sal);

                System.out.println(employee);
            } else if (type.compareToIgnoreCase("P") == 0) {
                PartTimeEmployee employee = new PartTimeEmployee(name);

                System.out.print("\nEnter Rate Per Hour: ");
                double rate = in.nextDouble();

                System.out.print("\nEnter Number of Hours Worked: ");
                employee.setWage(rate, in.nextInt());
                salary = employee.getWage();
                System.out.println(employee);
            }
            double tax = findTax(salary);

            map.put(name,tax);

            System.out.println(name +" tax " + tax);
        }
        catch (Exception ex){
            System.out.println("Unknown exception occurred");
        }

        finally {
            System.out.println("Thanks for using our payroll management system");
        }
    }

    private static double findTax(double salary) {
        double k = (salary*(10.0f/100.0f));
        return k;
    }

    private static double findTax(double salary, int percent) {
        double k = (salary*(percent/100.0f));
        return k;
    }
}


abstract class Employee {
    private String name;

    public Employee(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

final class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name) {
        super(name);
    }

    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String toString() {
        return "\nEmployee Name: " + getName()  + "\nMonthly Salary: " + monthlySalary;
    }
}

final class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public PartTimeEmployee(String name) {
        super(name);
    }

    public void setWage(double rate, int hours) {
        ratePerHour = rate;
        hoursWorked = hours;
        wage = ratePerHour * hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public String toString() {
        return "\nEmployee Name: " + getName()  + "\nWage: " + wage;
    }
}