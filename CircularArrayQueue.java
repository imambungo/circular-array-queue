/**
 * CircularArrayQueue
 */
public class CircularArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public CircularArrayQueue() {
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.array = new int[10];
    }

    public CircularArrayQueue(int arrSize) {
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.array = new int[arrSize];
    }

    public boolean isFull() {
        return this.size == this.array.length;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int value) {
        System.out.println("enqueue(" + value + ")");
        if (isFull()) {
            System.out.println("Tidak muat lagi");
        } else {
            this.rear = ++this.rear % this.array.length;
            this.array[this.rear] = value;
            this.size++;
        }
        printChange();
    }

    public int dequeue() {
        System.out.println("dequeue()");
        int returnValue = 0;
        if (isEmpty()) {
            System.out.println("Antrian sudah habis.");
        } else {
            returnValue = this.array[this.front];
            this.front = ++this.front % this.array.length;
            this.size--;
        }
        printChange();
        return returnValue;
    }

    public void print() {
        // print queue
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = this.front; i != this.rear; i = ++i % this.array.length) {
                System.out.print(this.array[i] + ",");
            }
            System.out.println(this.array[this.rear] + "]");
        }
    }

    public void print2() {
        // print semua elemen array
        System.out.print("[");
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i]);
            if (i != this.array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("] (Semua elemen array");
    }

    public void print3() {
        // print posisi elemen queue didalam array
        System.out.print("[");
        for (int i = 0; i < this.array.length; i++) {
            if (this.rear < this.front && !isEmpty()) {
                if (i <= this.rear || i >= this.front) {
                    System.out.print(this.array[i]);
                } else {
                    System.out.print("-");
                }
            } else if (this.front <= this.rear && !isEmpty()) {
                if (i >= this.front && i <= this.rear) {
                    System.out.print(this.array[i]);
                } else {
                    System.out.print("-");
                }
            } else {
                System.out.print("-");
            }
            if (i != this.array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("] (Posisi elemen queue didalam array)\n ");
        for (int i = 0; i < this.array.length; i++) {
            if (i == this.front && i == this.rear) {
                System.out.print("*");
            } else if (i == this.front) {
                System.out.print("f");
            } else if (i == this.rear) {
                System.out.print("r");
            } else {
                System.out.print(" ");
            }
            if (i != this.array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("  (Posisi front dan rear)");
    }

    public void printChange() {
        print();
        print2();
        print3();
        System.out.println();
    }
}