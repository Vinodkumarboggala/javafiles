import java.util.Scanner;
class Evensum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
for(int i=0;i<a;i++)
{
  if(i%2==0)
//System.out.println("sum of:"+ i);
 sum=sum+i;
}
System.out.println(sum);
 
  }
}