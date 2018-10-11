class Main {
    public static void main(String[] args) {
        CircularArrayQueue Q = new CircularArrayQueue(7);
        Q.print();
        for (int i = 0; i < 4; i++) {
            Q.enqueue(i);
        }
        Q.print();
        Q.dequeue();
        Q.dequeue();
        Q.print();
        for (int i = 0; i < 6; i++) {
            Q.enqueue(i);
        }
        Q.print();
        for (int i = 0; i < 8; i++) {
            Q.dequeue();
        }
        Q.print();
        for (int i = 0; i < 7; i++) {
            Q.enqueue(i);
        }
        Q.print();
    }
}