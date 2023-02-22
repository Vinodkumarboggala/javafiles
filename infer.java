import java.util.Scanner;
class infer
{
 int num1;
 int num2;
infer
{

   Scanner sc=new Scanner(System.in);
   System.out.println("enter number1");
   num1=sc.nextLine();
   System.out.println("enter number2");
   num2=sc.nextInt();
   
 }
 void int calculate()
 {
   int multiply=num1*num2;
   return(multiply);
    }
}
 class MainInfer
 {
 public static void main(String[] args)
 {
     infer i=new infer();
     int result=i.calculate;
      System.out.println(result);
     }
}