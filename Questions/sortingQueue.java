import java.util.LinkedList;
import java.util.Queue;

public class sortingQueue {
    private static void sortQueue(Queue<Integer> queue) {
        int n = queue.size();
        for (int i = 0; i < n; i++) {

            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                int currValue = queue.poll();

                if (currValue < minValue && j < (n - i)) {
                    minValue = currValue;
                    minIndex = j;
                }
                queue.add(currValue); //current val is the removed val from the starting index
            }

            for (int j = 0; j < n; j++) {
                int currValue = queue.poll(); //poll function removes the head of the queue
                if (j != minIndex) {
                    queue.add(currValue);
                }
            }

            queue.add(minValue);
        }

        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(20);
        q1.add(4);
        q1.add(5);
        q1.add(1);
        q1.add(3);
        q1.add(16);
        sortQueue(q1);


    }
}