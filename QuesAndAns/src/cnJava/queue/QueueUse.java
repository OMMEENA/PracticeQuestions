package cnJava.queue;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArrays queue = new QueueUsingArrays();

        for (int i = 1; i <= 5; i++) {
            try {
                queue.enqueue(i);
            } catch (QueueFullException e) {

            }
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.deqeue());
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}