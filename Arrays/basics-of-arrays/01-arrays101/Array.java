import java.util.*;

import javax.swing.text.html.FormView;

public class Array {
    public static void main(String[] args) {
        // Array Declaration
        int[] nameOfArray;
        // or can be initialised as
        int secondArray[]; // both these are array of integers of undefined length but the first one is
                           // preferred

        // we can create arrays of various data types

        /*byte byteArray[]; // Array of byte numbers
        short shortsArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[]; */
        // // an array can reference to objects in a class created by us

        // MyClass myClassArray[];

        // Object ao, // Array of objects
        // Collection[] ca; // Array of collection of unknown type

        // Up until now no array actually exists yet. only it is told to the compiler
        // that the
        // variable will contain an array of integers
        // to link variable to an actual array:

        // int[] intArray;
        // intArray = new int[20]; // instantiation of an array (this is giving some
        // error for me)

        // this can be done in one line as follows:

        int[] intArray = new int[20];

        // Obtaining an array is a two-step process. First, you must declare
        // a variable of the desired array type. Second, you must allocate the memory
        // to hold the array, using new, and assign it to the array variable.
        // Thus, in Java, all arrays are dynamically allocated. ~ GfG

        // array literal:
        // created when all the elements are known beforehand
        int[] literalArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < literalArr.length; i++) {
            System.out.println(literalArr[i]);
        }
        // the length is already implied by the number of elements

        // For 2d arrays
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        



    }

}