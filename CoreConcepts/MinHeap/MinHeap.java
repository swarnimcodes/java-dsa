import java.util.Arrays;

// ic = 2*ip + 1, 2*ip + 2  => ic = index of child, ip = index of parent
// ip = floor((ic - 1) / 2)

public class MinHeap {
  private int[] heap;
  private int size;
  private int capacity;

  public MinHeap(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.heap = new int[capacity];
  }

  private int getParentIndex(int index) {
    return (index - 1) / 2; // this will be floored automatically
  }

  private int getLeftChildIndex(int index) {
    return 2 * index + 1;
  }

  private int getRightChildIndex(int index) {
    return 2 * index + 2;
  }

  private boolean hasParent(int index) {
    return getParentIndex(index) >= 0;
  }

  private boolean hasLeftChild(int index) {
    return getLeftChildIndex(index) < size;
  }

  private boolean hasRightChild(int index) {
    return getRightChildIndex(index) < size;
  }

  private int parent(int index) {
    return heap[getParentIndex(index)];
  }

  private int leftChild(int index) {
    return heap[getLeftChildIndex(index)];
  }

  private int rightChild(int index) {
    return heap[getRightChildIndex(index)];
  }

  private void swap(int indexOne, int indexTwo) {
    int temp = heap[indexOne];
    heap[indexOne] = heap[indexTwo];
    heap[indexTwo] = temp;
  }

  private void ensureExtraCapacity() {
    if (size == capacity) {
      heap = Arrays.copyOf(heap, capacity * 2);
      capacity *= 2;
    }
  }

  private int peek() {
    if (size == 0) {
      throw new IllegalStateException();
    }
    return heap[0];
  }

  private int poll() {
    if (size == 0) {
      throw new IllegalStateException();
    }
    int item = heap[0];
    heap[0] = heap[size - 1];
    size--;
    heapifyDown();
    return item;
  }

  private void heapifyDown() {
    int index = 0;
    while (hasLeftChild(index)) {
      int smallerChildIndex = getLeftChildIndex(index);
      if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
        smallerChildIndex = getRightChildIndex(index);
      }

      if (heap[index] < heap[smallerChildIndex]) {
        break;
      } else {
        swap(index, smallerChildIndex);
      }
      index = smallerChildIndex;
    }
  }

  private void add(int item) {
    ensureExtraCapacity();
    heap[size] = item;
    size++;
    heapifyUp();
  }

  private void heapifyUp() {
    int index = size - 1;
    while (hasParent(index) && parent(index) > heap[index]) {
      swap(getParentIndex(index), index);
      index = getParentIndex(index);
    }
  }

  public static void main(String[] args) {
    MinHeap minHeap = new MinHeap(10);
    minHeap.add(2);
    minHeap.add(10);
    minHeap.add(5);
    minHeap.add(1);

    System.out.println(minHeap.peek());
    System.out.println(minHeap.poll());
    System.out.println(minHeap.peek());
  }
}
