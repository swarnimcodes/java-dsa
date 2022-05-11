public class Multidim {
    // Multidimensional arrays are arrays of arrays with each 
    //element of the array holding the reference of other arrays.
    // Also known as jagged arrays

    public static void main(String[] args) {
        // declaring and initialising a 2d array
        int[][] arr = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        //printing 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
