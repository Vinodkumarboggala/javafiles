import java.util.Scanner;

class employee
{
 int x;  //non-static variable
 String y;
 class inner
{
 void get()
{

 Scanner obj=new Scanner(System.in);
 System.out.println("Enter Emp_id Emp Name= ");
  x= obj.nextInt();
  y=obj.nextLine();
}
void disp(){
System.out.println("emp id is: " + x);
System.out.println("emp name is: " + y);
}
}}
class C
{
 public static void main(String [] args)
{
employee obj=new employee();
employee.inner obj1=obj.new inner();
obj1.get();
obj1.disp();
}}