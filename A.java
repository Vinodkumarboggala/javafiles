// nested classes
// static  non-static
// 1.local  2. anonymous class

class outer
{
 static int x;  //non-static variable
int y=5;
private static int z=20;
 
static class inner
{
 void disp()
{
 System.out.print(" x is" +x);
 outer  o=new outer();
System.out.println(" y is "+ o.y);
 // System.out.println(" y is" +y);
 System.out.println(" z is" +z);
}
}}
class A
{
 public static void main(String [] args)
{
outer.inner obj= new outer.inner();
obj.disp();
}}