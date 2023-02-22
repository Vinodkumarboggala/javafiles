import java.io.*;
 class StringBuilder{
 public static void main(String[] args){
 StringBuilder s1=new StringBuilder("Java a programming");
 System.out.println(s1);
 System.out.println(s1.capacity());
 System.out.println(s1.length());
 s1.append("language");
  System.out.println(s1);
 System.out.println(s1.capacity);
 System.out.println(s1.length());
s1.insert(1,"xyz");
 System.out.println(s1);
 System.out.println(s1.capacity());
 System.out.println(s1.length());
s1.delete(1);
 System.out.println(s1);
 System.out.println(s1.capacity());
 System.out.println(s1.length());
s1.reverse();
 System.out.println(s1);
 System.out.println(s1.capacity());
 System.out.println(s1.length());
 }
}