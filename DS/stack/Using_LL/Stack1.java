class Stack1 {
    Node top = null;
    boolean isEmpty() {
        if(top==null) {
            return false;
        }
        return true;
    }

    void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top=newNode;
            System.out.println("Element insert Successfully");
        }
    } 

    void pop() {
        if(isEmpty()) {
            top = top.next;
            System.out.println("Last Element Deleted Successfully");
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(isEmpty()) {
            System.out.println(top.data);
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(isEmpty()) {
            Node i;
            for(i=top;i.next!=null;i=i.next) {
                System.out.print(i.data + "->");
            }
            System.out.print(i.data);
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