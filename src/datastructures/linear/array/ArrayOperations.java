package datastructures.linear.array;

import java.util.Arrays;

public class ArrayOperations {

    /*
    *   1. Start
        2. Create an Array of a desired datatype and size.
        3. Initialize a variable ‘i’ as 0.
        4. Enter the element at ith index of the array.
        5. Increment i by 1.
        6. Repeat Steps 4 & 5 until the end of the array.
        7. Stop
    * */
    public void insertToArray() {
        int LA[] = new int[3];

        System.out.println("Array Before Insertion:");

        for(int i = 0; i < LA.length; i++)
            System.out.println("LA[" + i + "] = " + LA[i]); //prints empty array

        System.out.println("Inserting Elements..");

        // Printing Array after Insertion
        System.out.println("Array After Insertion:");

        for(int i = 0; i < LA.length; i++) {
            LA[i] = i+3;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
    }
}
