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
        int[] intArray = new int[5];

        System.out.println("Array before initialization: " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 3;
        }

        System.out.println("Array after initialization: " + Arrays.toString(intArray));
    }
}
