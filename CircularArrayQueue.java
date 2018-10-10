/**
 * CircularArrayQueue
 */
public class CircularArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public CircularArrayQueue() {
        this.size = 10;
        this.front = -1;
        this.rear = 0;
        this.array = new int[this.size];
    }
}