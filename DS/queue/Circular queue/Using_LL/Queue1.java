
public class Queue1 {
    Node front;
    Node rear;
    
    boolean isEmpty() {
        return front == null || rear ==null;
    }

    void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(front == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            newNode.next = front;
            rear = newNode;
        }
        System.out.println("Element Inserted Successfully");
    }

    void dequeue() {
        if(!isEmpty()) {
            if(front == front.next) {
                front = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            System.out.println("First Element Deleted Successfully");
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(!isEmpty()) {
            System.out.println(front.data);
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(!isEmpty()) {
            Node temp = front;
            System.out.print(temp.data + "->");
            temp = temp.next;
            while(temp!=front) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        } else {
            System.out.println("Underflow");
        }
    }
}

class Node{
    int data;
    Node next;
}