class Queue {
    int front = -1;
    int rear=-1;
    int length = 7;
    int[] arr = new int[length];

    boolean isEmpty() {
        if(front == length-1) {
            front = -1;
        }
        if(rear == -1 && front == -1) {
            return false;
        }
        return true;
    }

    boolean isFull() {
        if(rear == length-1 && front!=-1) {
            rear = -1;
        }
        
        if(rear == length-1 || (rear==front && rear!=-1)) {
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
            front = front +1;
            if(front == rear) {
                front = rear = -1;
            }
            System.out.println("First Element Deleted Successfully");
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(isEmpty()) {
            System.out.println(arr[front+1]); 
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(isEmpty()) {
            if(rear>front) {
                for(int i=rear;i>front;i--) {
                    System.out.print(arr[i] + " ");
                }
            }
            if(front>=rear) {
                for(int i=length-1;i>front;i--) {
                    System.out.print(arr[i] + " ");
                }
                for(int i=rear;i>=0;i--) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Underflow");
        }
    }
}