import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Sequence seq = new Sequence(20, 1, 4); 
        int[] arr = seq.getSequence(); 


        System.out.println("Values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Sequence {
    private int[] sequence; 

    
    public Sequence(int size, int first, int diff) {
        this.sequence = new int[size];
        for (int i = 0; i < size; i++) {
            this.sequence[i] = first + i * diff;
        }
    }

    
    public int[] getSequence() {
        return this.sequence;
    }
}
