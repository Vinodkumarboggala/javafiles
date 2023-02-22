import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PayrollManagementSystemGUI extends JFrame implements ActionListener {

    // Define the employee data structure
    static class Employee {
        String name;
        String designation;
        int payScale;
        int basicSalary;
        int hra;
        int da;
        int tax;
        int netSalary;
    }

    // Initialize the employee array
    Employee[] employees = new Employee[10];
    int count = 0;

    // GUI components
    JLabel nameLabel, designationLabel, payScaleLabel, basicSalaryLabel;
    JTextField nameField, designationField, payScaleField, basicSalaryField;
    JButton addButton, calculateButton, exitButton;

    public PayrollManagementSystemGUI() {
        // Set up the GUI components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        designationLabel = new JLabel("Designation:");
        designationField = new JTextField(20);
        payScaleLabel = new JLabel("Pay Scale:");
        payScaleField = new JTextField(5);
        basicSalaryLabel = new JLabel("Basic Salary:");
        basicSalaryField = new JTextField(10);
        addButton = new JButton("Add Employee");
        calculateButton = new JButton("Calculate Salary");
        exitButton = new JButton("Exit");
        // Set up the layout
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(designationLabel);
        panel.add(designationField);
        panel.add(payScaleLabel);
        panel.add(payScaleField);
        panel.add(basicSalaryLabel);
        panel.add(basicSalaryField);
        panel.add(addButton);
        panel.add(calculateButton);
        panel.add(exitButton);
        add(panel, BorderLayout.CENTER);
        // Add the action listeners
        addButton.addActionListener(this);
        calculateButton.addActionListener(this);
        exitButton.addActionListener(this);
        // Set up the window
        setTitle("Payroll Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PayrollManagementSystemGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addEmployee();
        } else if (e.getSource() == calculateButton) {
            calculateSalary();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private void addEmployee() {
        if (count < employees.length) {
            employees[count] = new Employee();
            employees[count].name = nameField.getText();
            employees[count].designation = designationField.getText();
            employees[count].payScale = Integer.parseInt(payScaleField.getText());
            employees[count].basicSalary = Integer.parseInt(basicSalaryField.getText());
            count++;
            JOptionPane.showMessageDialog(this, "Employee added successfully.");
            // Clear the input fields
            nameField.setText("");
            designationField.setText("");
            payScaleField.setText("");
            basicSalaryField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Employee list is full.");
        }
    }

    private void calculateSalary() {
        for (int i = 0; i < count; i++) {
            employees[i].hra = employees[i].basicSalary / 2;
            employees[i].da = employees[i].basicSalary / 3;
            int grossSalary = employees[i].basicSalary + employees[i].hra + employees[i].da;
            if (grossSalary < 20000)
}
}