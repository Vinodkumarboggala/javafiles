import java.util.Scanner;

class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Hindi \n2.English \n3.Maths");
        int a = sc.nextInt();
        int x = 1; // Hindi
        int z = 2; // English
        int y = 3; // Maths
        
        System.out.println("Enter marks for Hindi, English, and Maths:");
        passedthemarks marks = new passedthemarks();
        marks.Hindi = sc.nextInt();
        marks.English = sc.nextInt();
        marks.Maths = sc.nextInt();
        
        displaymarks display = new displaymarks();
        display.display(marks);
    }
}

class passedthemarks {
    int Hindi;
    int English;
    int Maths;
}

class displaymarks {
    public void display(passedthemarks marks) {
        System.out.println(marks.Hindi);
        System.out.println(marks.English);
        System.out.println(marks.Maths);
    }
}
