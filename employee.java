import java.util.Scanner;
class employee
{
 int e_id;
 char e_rank;
 void get_details()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter employee id ");
   e_id=sc.nextLine();
   System.out.println("enter employee rank ");
   e_rank=sc.next().charAt(0);5
   
 }
 void print_employeedetails()
 {
 System.out.println("employee id="+e_id);
 System.out.println("employee rank="+e_rank);
 }
 }
 class Mainemployee
 {
 public static void main(String[] args)
 {
   employee  arr[]= new employee[5];
   
   arr[0]= new employee();
   arr[1]=new employee();
   arr[2]=new employee();
   arr[3]=new employee();
   arr[4]=new employee();
   System.out.println("employee details no.1\n ");
   arr[0].get_details();
   arr[0].print_employeedetails();
   System.out.println("employee details no.2\n ");
   arr[1].get_details();
   arr[1].print_employeedetails();
   System.out.println("employee details no.3\n ");
   arr[2].get_details();
   arr[2].print_employeedetails();
   System.out.println("employee details no.4\n ");
   arr[3].get_details();
   arr[3].print_employeedetails();
   System.out.println("employee details no.5\n ");
   arr[4].get_details();
   arr[4].print_employeedetails();
   
 }
 }