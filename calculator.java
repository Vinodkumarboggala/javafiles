import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int a=sc.nextInt();
int b=sc.nextInt();
 System.out.println("1.multiplication \n 2.division\n 3.addition\n 4.subtraction");
int c=sc.nextInt();
switch(c){
case 1:
	System.out.println("multiplied value is"+(a*b));
break;
case 2:
  System.out.println(a/b);
break;
case 3:
  System.out.println(a+b);
break;
case 4:
System.out.println(a-b);
default:
	System.out.print("Nill");
}
}
}