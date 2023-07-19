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


    /*
    *   1. Start
        2. Set J = K
        3. Repeat steps 4 and 5 while J < N
        4. Set LA[J] = LA[J + 1]
        5. Set J = J+1
        6. Set N = N-1
        7. Stop
    * */
    public void deleteFromArray(){
        int LA[] = new int[3];
        int n = LA.length;

        System.out.println("Array Before Deletion:");

        for(int i = 0; i < n; i++) {
            LA[i] = i + 3;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        // i is the index of the element to be deleted.
        for(int i = 1; i<n-1; i++) {
            LA[i] = LA[i+1];
            n = n - 1;
        }

        System.out.println("Array After Deletion:");

        for(int i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
    }

    /*
    *   1. Start
        2. Set J = 0
        3. Repeat steps 4 and 5 while J < N
        4. IF LA[J] is equal ITEM THEN GOTO STEP 6
        5. Set J = J +1
        6. PRINT J, ITEM
        7. Stop
    * */
    public void searchElements(){
        int LA[] = new int[5];

        System.out.println("Array:");

        for(int i = 0; i < LA.length; i++) {
            LA[i] = i + 3;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        for(int i = 0; i < 5; i++) {
            if(LA[i] == 6)
                System.out.println("Element " + 6 + " is found at index " + i);
        }
    }

    /*
    *   1 Start
        2. Initialize an Array of certain size and datatype.
        3. Initialize another variable ‘i’ with 0.
        4. Print the ith value in the array and increment i.
        5. Repeat Step 4 until the end of the array is reached.
        6. End
    * */
    public void traverseArray(){
        int LA[] = new int[5];

        System.out.println("The array elements are: ");

        for(int i = 0; i < LA.length; i++) {
            LA[i] = i + 2;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
    }
}
