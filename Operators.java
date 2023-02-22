class arithmetic
{
public static void main(String[] args)
{
int x=100, y=50;
int r1= x+y, r2=x-y, r3=x*y, r4=x/y;
float r5=x%y, r6=r5++, r7=--r6;
System.out.println(x+ "+"+y+ "=" +r1 );
System.out.println(x+ "-"+y+ "=" +r2 );
System.out.println(x+ "*"+y+ "=" +r3 );
System.out.println(x+ "/"+y+ "=" +r4 );
System.out.println(x+ "%"+y+ "=" +r5 );
System.out.println("Post increment of r5 =" +r6 );
System.out.println("Pre decrement of r6 =" +r7 );
}
}