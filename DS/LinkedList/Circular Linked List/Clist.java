
public class Clist {
    Node head;
    int length = 0;
    void insertStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(head == null) {
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            Node temp = head;
            int index = 0;
            while(true) {
                if(length-1 == index) {
                    temp.next = head;
                    break;
                }
                temp = temp.next;
                index++;
            }
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
            head.next = head;
        } else {
            Node temp = head;
            int index = 0;
            while(true) {
                if(length-2 == index) {
                    temp.next = newNode;
                    newNode.next = head;
                    break;
                }
                temp = temp.next;
                index++;
            }
        }
    }

    void deletion(int data) {
        Node temp = head;
        Node prev = temp;
        int index = 0;
        while(index<length) {
            if(temp.data == data) {
                System.out.println(index);
                break;   
            }
            prev = temp;
            temp = temp.next;
            index++;
        }
        if(index>=length) {
            System.out.println("The given element not exists");
        } else {
            length = length - 1;
            if(length == 0) {
                head = null;
            } else if(index == 0) {
                head = head.next;
                Node temp1 = head;
                int flag = 0;
                while(true) {
                    if(flag == length -1) {
                        temp1.next = head;
                        break;
                    }
                    temp1 = temp1.next;
                    flag++;
                }
            } else if(index  != length) {
                prev.next = temp.next;
            } else {
                prev.next = head;
            }
        }
    }

    void search(int data) {
        Node temp = head;
        int i=0;
        while(i<length) {
            if(temp.data == data) {
                System.out.println("The element " + data + " is found at " + i + "th index");
                break;
            }
            i++;
            temp = temp.next;
        }
        if(i>=length) {
            System.out.println("The given element is not found in LL");
        }
    }

    void print() {
        Node temp  = head;
        int index=0;
        if(temp!=null) {
            while(true) {
                if(length == index) {
                    break;
                }
                System.out.print(temp.data + "->"); 
                temp = temp.next;
                index++;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }
}
