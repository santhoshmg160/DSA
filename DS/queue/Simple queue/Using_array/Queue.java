class Queue {
    int front = -1;
    int rear = -1;
    int length = 7;
    int arr[] = new int[length];

    boolean isFull() {
        if(rear == length-1) {
            return false;
        }
        return true;
    }

    boolean isEmpty() {
        if(rear == -1) {
            return false;
        }
        return true;
    }

    void enqueue(int data) {
        if(isFull()) {
            rear = rear + 1;
            arr[rear] = data;
            System.out.println("Element Inserted Successfully");
        } else {
            System.out.println("Overflow");
        }
    }

    void dequeue() {
        if(isEmpty()) {
            if(front != rear) {
                front = front+1;
                if(front == rear) {
                    front = rear = -1;
                }
                System.out.println("First Element Deleted Successfully");
            } 
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(isEmpty()) {
            if(front != rear) {
                System.out.println(arr[front+1]);
            }
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(isEmpty()) {
            for(int i=rear;i>front;i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Underflow");
        }
    }
}
