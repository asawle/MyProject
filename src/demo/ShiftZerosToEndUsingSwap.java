package demo;
import java.util.Arrays;

public class ShiftZerosToEndUsingSwap {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 4, 3, 0, 5, 0, 7};
        shiftZerosTofirst(array);
        System.out.println("Array after shifting zeros to the right: " + Arrays.toString(array));
    }

    public static void shiftZerosToEnd(int[] arr) {
        int lastNonZeroFoundAt = 0; // Position of the last non-zero element found

        for (int i = 0; i < arr.length; i++) {
        	int a=arr[i];
        	System.out.println(a);
        	
            if (a != 0) {
                // Swap the current element with the element at lastNonZeroFoundAt
                int temp = arr[i];
                arr[i] = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = temp;

                // Move the pointer to the next position
                lastNonZeroFoundAt++;
            }
        }
    }
    
    public static void shiftZerosTofirst(int[] arr) {
        int lastNonZeroFoundAt = arr.length-1; // Position of the last non-zero element found

        for (int i = arr.length-1; i >=0; i--) {
        	int a=arr[i];
        	System.out.println(a);
        	boolean v=(a!=0);
        	System.out.println(v);
            if (a != 0) {
                // Swap the current element with the element at lastNonZeroFoundAt
                int temp = arr[i];
                arr[i] = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = temp;

                // Move the pointer to the next position
                lastNonZeroFoundAt--;
            }
        }
    }
}