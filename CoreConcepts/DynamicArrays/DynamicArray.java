
import java.util.Arrays;

public class DynamicArray {
    private int[] da;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 10; // default capacity
        size = 0;
        da = new int[capacity];
    }

    public void setElem(int index, int elem) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        da[index] = elem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        capacity *= 2;
        int[] newDyArray = Arrays.copyOf(da, capacity);
        da = newDyArray;
    }

    public void popElement() {
        if (size > 0) {
            size -= 1;
        }
    }

    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        da[size++] = element;
    }

    public int get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        return da[index];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DynamicArray dyarr = new DynamicArray();
        for (int i = 0; i < dyarr.getCapacity(); ++i) {
            dyarr.add(i);
        }

        dyarr.popElement();
        dyarr.popElement();
        dyarr.popElement();
        dyarr.popElement();

        for (int i = 0; i < dyarr.getSize(); ++i) {
            System.out.println(dyarr.get(i));
        }
    }
}