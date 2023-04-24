// inner class
class outer
{
 static int x;  //non-static variable
int y=5;
private static int z=20;
 
 class inner
{
 void disp()
{
 System.out.println(" x is" +x);
	inner i=new inner();
//System.out.println(" y is "+ i.y);
System.out.println(" y is" +y);
 System.out.println(" z is" +z);
}
}}
class B
{
 public static void main(String [] args)
{
outer obj=new outer();

outer.inner obj1=obj. new inner();
obj1.disp();
}}