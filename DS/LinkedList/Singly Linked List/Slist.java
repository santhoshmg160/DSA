
public class Slist {
    Node head;

    void insertStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(head == null)  {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertMiddle(int data, int pos) {
        int index = 0;
        int count = 0;
        Node temp = head;
        Node prev = null; 
        while(temp!=null) {
            if(count == pos) {
                index = 1;
                break;
            } 
            count++;
            prev = temp;
            temp = temp.next;
        }
        if(index == 0) {
            System.out.println("The given position is greater than the LL length");
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = temp;
            prev.next = newNode;
        }
    }

    void insertEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void deletion(int data) {
        Node temp = head;
        Node prev = temp;
        int index = 0;
        while(temp!=null) {
            if(temp.data == data) {
                break;   
            }
            prev = temp;
            temp = temp.next;
            index++;
        }
        if(temp==null) {
            System.out.println("The given element not exists");
        } else {
            if(index == 0) {
                head = head.next;
            } else if(temp.next!=null) {
                prev.next = temp.next;
            } else {
                prev.next = null;
            }
        }
    }

    void search(int data) {
        Node temp = head;
        int i=0;
        while(temp!=null) {
            if(temp.data == data) {
                System.out.println("The element " + data + " is found at " + i + "th index");
                break;
            }
            i++;
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println("The given element is not found in LL");
        }
    }

    void print() {
        Node temp  = head;
        while(temp.next!=null) {
            System.out.print(temp.data + "->"); 
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
}
