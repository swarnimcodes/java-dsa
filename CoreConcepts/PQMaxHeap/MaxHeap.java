import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class MaxHeap {
  public static void main(String[] args) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    ArrayList<Integer> arr = new ArrayList<>();
    maxHeap.add(3);
    maxHeap.add(10);
    maxHeap.add(5);
    maxHeap.add(1);
    System.out.println(maxHeap);
    System.out.println("Peek: " + maxHeap.peek());
    System.out.println(maxHeap);
    System.out.println("Poll: " + maxHeap.poll());
    System.out.println(maxHeap);
    maxHeap.add(90);
    System.out.println(maxHeap);
    maxHeap.add(0);
    System.out.println(maxHeap);
    maxHeap.add(-1);
    System.out.println(maxHeap);
    maxHeap.add(9999);
    System.out.println(maxHeap);
  }
}
