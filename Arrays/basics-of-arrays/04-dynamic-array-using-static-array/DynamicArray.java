class Array {
    private int[] arr;
    private int count;

    public Array(int length){
        arr = new int[length];
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertElement(int element) {
        if (arr.length == count) {
            int newArr[] = new int[2*count];

            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;

        }
        arr[count++] = element;
    }
}


public class DynamicArray {
    public static void main(String[] args) {
        Array nums = new Array(3);

        nums.insertElement(10);
        nums.insertElement(20);
        nums.insertElement(30);
        nums.insertElement(40);
        nums.insertElement(50); 

        nums.printArray();
    }
}