import java.util.Scanner;
 
class ExceptionalDemo
{
public static void main(String[] args)
{
 try
  {
     int x=125/5;
     System.out.println(x);
  }
  catch(NullPointerException e)
  {
  System.out.println("Exception");
  }
  finally
  {
    System.out.println("Done");
  }
}
}