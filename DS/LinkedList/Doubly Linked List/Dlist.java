
public class Dlist {
    Nodes head;

    void insertStart(int data) {
        Nodes newNode = new Nodes();
        newNode.data = data;
        if(head == null) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    void insertMiddle(int data, int pos) {
        Nodes newNode = new Nodes();
        newNode.data = data;
        Nodes temp = head;
        Nodes temp1 = null;
        int index =0;
        while(temp!=null) {
            if(index == pos) {
                break;
            }
            temp1 = temp;
            temp= temp.next;
            index++;
        }
        temp1.next = newNode;
        temp.prev = newNode;
        newNode.next = temp;
        newNode.prev = temp1; 
    }

    void insertEnd(int data) {
        Nodes newNode  = new Nodes();
        newNode.data = data;
        Nodes temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deletion(int data) {
        Nodes temp = head;
        int index = 0;
        Nodes temp1 = null;
        while(temp!=null) {
            if(temp.data == data) {
                break;
            }
            temp1 = temp;
            temp = temp.next;
            index++;
        }
        if(temp==null) {
            System.out.println("The given element not exists");
        } else {
            if(index==0) {
                head = head.next;
                head.prev = null;
            } else if (temp.next == null) {
                temp1.next = null;
            } else {
                temp = temp.next;
                temp1.next = temp;
                temp.prev = temp1;
            }
        }
    }

    void search(int data) {
        Nodes temp = head;
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
        Nodes temp  = head;
        while(temp.next!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
        while(temp.prev!=null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.print(temp.data);
        System.out.println();
    }
}
