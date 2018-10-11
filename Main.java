class Main {
    public static void main(String[] args) {
        CircularArrayQueue Q = new CircularArrayQueue(7);
        Q.print();
        for (int i = 0; i < 4; i++) {
            Q.enqueue(i);
        }
        Q.print();
        
    }
}