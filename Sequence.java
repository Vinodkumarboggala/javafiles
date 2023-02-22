import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Sequence seq = new Sequence(20, 1, 3); // create a new sequence object
        int[] arr = seq.getSequence(); // initialize a new array with the sequence

        // print the values of the array
        System.out.println("Values of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Sequence {
    private int[] sequence; // the array to store the sequence

    // constructor to create a new sequence object
    public Sequence(int size, int first, int diff) {
        this.sequence = new int[size];
        for (int i = 0; i < size; i++) {
            this.sequence[i] = first + i * diff;
        }
    }

    // method to get the sequence array
    public int[] getSequence() {
        return this.sequence;
    }
}
