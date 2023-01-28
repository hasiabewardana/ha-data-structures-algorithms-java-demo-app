package datastructures.linear.array;

import java.util.Arrays;

public class ArrayImpl {
    public void printNumbers() {
        // Declare an array of integers with a size of 5
        int[] numbers = new int[5];

        // Initialize the elements of the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 50;
        numbers[4] = 40;

        // Shorthand notation to initialize the array while declaring
        // int[] numbers = {10,20,30,40,50};

        // Access an element of the array by its index
        System.out.println("Second element of the array is: " + numbers[1]);
        // Output: The second element is: 20

        // Iterating over the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Output: 10
        // 20
        // 30
        // 50
        // 40

        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Searching
        System.out.println("The index of 50:" + Arrays.binarySearch(numbers, 50));

        // Filling with a number
        Arrays.fill(numbers,35);
        System.out.println("Array after filling 35: " + Arrays.toString(numbers));

        // Checking the equality
        int[] newNumbers = {35,35,35,35,35};
        System.out.println("Is numbers equal to newNumbers: " + Arrays.equals(numbers,newNumbers));
    }
}
