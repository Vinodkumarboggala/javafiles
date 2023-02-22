import java.util.Scanner;
class Volume
{
     int l;
     int w;
     int h=10;
  void get_data()
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the dimentions");
  l=sc.nextInt();
  w=sc.nextInt();
  h=sc.nextInt();
}
void print_data()
{
System.out.println(l);
System.out.println(w);
System.out.println(h);

}

class MainVolume
{
      public static void main(string[] args)
{
     
  Volume v=new Volume();
  Volume v1=new Volume();
v.get_data();
v.print_data();
}
}
}