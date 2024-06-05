import java.util.PriorityQueue;

class MinHeap {
  public static void main(String[] args) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    minHeap.add(3);
    minHeap.add(10);
    minHeap.add(5);
    minHeap.add(1);
    System.out.println(minHeap);
    System.out.println("Peek: " + minHeap.peek());
    System.out.println(minHeap);
    System.out.println("Poll: " + minHeap.poll());
    System.out.println(minHeap);
    minHeap.add(2);
    System.out.println("Adding element 2: ");
    System.out.println(minHeap);
  }
}
