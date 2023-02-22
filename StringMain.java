import java.util.Scanner;
class StringMain
{
  public static void main(String[] args)
 {
   String s1=new String();
   String s2="HELLO";
   s1="I am good";
   
char arr[] = {'a','b','c','d'};
String s3=new String(arr);
byte value[] = {65,66,67,68};
String s4=new String(value);
String s5=new String(arr,1,2);
String s6=new String(value,1,2);
System.out.println(s1+s2+s3+s4+s5+s6);
}
}

