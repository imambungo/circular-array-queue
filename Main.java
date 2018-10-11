class Main {
    public static void main(String[] args) {
        CircularArrayQueue Q = new CircularArrayQueue(7);
        System.out.println();
        for (int i = 0; i < 4; i++) {
            Q.enqueue(i);
            System.out.println();
        }
        Q.dequeue();
        System.out.println();
        Q.dequeue();
        System.out.println();
        for (int i = 0; i < 6; i++) {
            Q.enqueue(i);
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            Q.dequeue();
            System.out.println();
        }
        for (int i = 0; i < 7; i++) {
            Q.enqueue(i);
            System.out.println();
        }
    }
}