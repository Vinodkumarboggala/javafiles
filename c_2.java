import java.util.Scanner;
class cal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("1.multiplication\n2.division\n 3.addition\n 4.subtraction");
String c=sc.next();
switch(c){
case "M":
	System.out.println(a*b);
break;
case "D":
    System.out.println(a/b);
break;
case "A":
    System.out.println(a+b);
break;
case "S":
    System.out.println(a-b);
break;
default:
	System.out.print("Nill");
}
}
}