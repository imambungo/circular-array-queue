class Main {
    public static void main(String[] args) {
        CircularArrayQueue Q = new CircularArrayQueue(7);
        // Q.print2();
        for (int i = 0; i < 4; i++) {
            Q.enqueue(i);
        }
        // Q.print2();
        Q.dequeue();
        Q.dequeue();
        // Q.print2();
        for (int i = 0; i < 6; i++) {
            Q.enqueue(i);
        }
        // Q.print2();
        for (int i = 0; i < 8; i++) {
            Q.dequeue();
            Q.print();
            Q.print2();
            System.out.println();
        }
        // Q.print2();
        for (int i = 0; i < 7; i++) {
            Q.enqueue(i);
        }
        // Q.print2();
    }
}