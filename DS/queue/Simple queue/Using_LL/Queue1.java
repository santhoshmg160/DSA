class Queue1 {
    Node front;
    Node rear;

    boolean isEmpty() {
        if(rear == null || front == null) {
            return false;
        }
        return true;
    }

    void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if(isEmpty()) {
            front = front.next;
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(isEmpty()) {
            System.out.println(front.data); 
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(isEmpty()) {
            Node temp;
            for(temp = front;temp.next!=null;temp=temp.next) {
                System.out.print(temp.data + "->");
            }
            System.out.print(temp.data);
            System.out.println();
        } else {
            System.out.println("Underflow");
        }
    }
}

class Node {
    int data;
    Node next;
}