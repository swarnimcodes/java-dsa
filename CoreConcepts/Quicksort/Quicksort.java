public class Quicksort {
    
    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }

    private static void quicksort(int[] arr, int l, int h) {
        if (l >= h) return; // base case

        int pivot = partition(arr, l, h);
        quicksort(arr, l, pivot - 1);
        quicksort(arr, pivot + 1, h);
    }


    public static void main(String[] args) {
        int[] arr = {9, 3, 2, 7, 8, 1, 6, 4, 5};
        for (int elem: arr) {
            System.out.print(elem + " ");
        }
        System.out.println();

        quicksort(arr, 0, arr.length - 1);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

}