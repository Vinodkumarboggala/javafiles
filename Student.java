import java.util.Scanner;
public class Student {
   private String name;
   private int reg_no;
   private float marks_1,marks_2,marks_3;
   public Student(){
      
   }
   public Student(String name, int reg_no,float marks_1,float marks_2,float marks_3){
      this.name = Obj2.name;
      this.reg_no = Obj2.reg_no;
      this.marks_1=Obj2.marks_1;
      this.marks_2=Obj2.marks_2;
      this.marks_2=Obj2.marks_3;
      return Obj2;
   }
   public Student Obj(Student Obj2){
      this.name = Obj2.name;
      this.reg_no = Obj2.reg_no;
      this.marks_1=Obj2.marks_1;
      this.marks_2=Obj2.marks_2;
      this.marks_2=Obj2.marks_3;
      return Obj2;
   }
   public void display(){
      System.out.println("Name : "+this.name);
      System.out.println("Registration number: "+this.reg_no);
      System.out.println("Marks 1 : "+this.marks_1);
      System.out.println("Marks 2 : "+this.marks_2);
      System.out.println("Marks 3 : "+this.marks_3);
   }
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter your name ");
      String name = sc.next();
      System.out.println("Enter your registration number ");
      int age = sc.nextInt();
        System.out.println("Enter marks_1 ");
      float marks_1 = sc.nextFloat();
       System.out.println("Enter marks_2 ");
      float marks_2 = sc.nextFloat();
       System.out.println("Enter marks_3 ");
      float marks_3 = sc.nextFloat();
      System.out.println("Contents from the 1st constuctor");
      Student Obj1=new Student();
      Obj1.display();
      System.out.println("Contents from the 2nd constructor");
      Student Obj2=new Student(name,reg_no,marks_1,marks_2,marks_3);
      Obj2.display();
      System.out.println("Contents from the 3rd constructor");
      Student Obj3 = new Student().Obj(std);
      Obj3.display();
   }
}