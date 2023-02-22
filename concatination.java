import java.util.Scanner;
class concatination{
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
 System.out.println(String.join(" ","My","Name","Is",str));
}
}