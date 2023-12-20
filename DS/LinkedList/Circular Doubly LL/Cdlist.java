
class Cdlist {
    Nodes head;
    int length = 0;

    void insertStart(int data) {
        Nodes newNode = new Nodes();
        newNode.data = data;
        if(head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            Nodes temp = head;
            int index = 0;
            while(true) {
                if(length-1 == index) {
                    temp.next = head;
                    head.prev = temp;
                    break;
                }
                temp = temp.next;
                index++;
            }
        }
    }

    void insertMiddle(int data, int pos) {
        Nodes newNode = new Nodes();
        newNode.data = data;
        Nodes temp = head;
        Nodes temp1 = null;
        int index = 0;
        while(true) {
            if(pos == index) {
                temp1.next = newNode;
                newNode.prev = temp1;
                newNode.next = temp;
                temp.prev = newNode;
                break;
            }
            temp1 = temp;
            temp = temp.next;
            index++;
        }
    }

    void insertEnd(int data) {
        Nodes newNode = new Nodes();
        newNode.data = data;
        Nodes temp = head;
        int index = 0;
        while(true) {
            if(length-2 == index) {
                temp.next = newNode;
                newNode.prev = temp;
                newNode.next = head;
                head.prev = newNode;
                break;
            }
            temp = temp.next;
            index++;
        }
    }

    void deletion(int data) {
        Nodes temp = head;
        int index = 0;
        while(index<length) {
            if(temp.data == data) {
                length = length -1;
                break;
            }
            temp = temp.next;
            index++;
        }
        if(length == 0 && head!=null) {
            head = null;
        } else if(index==length) {
            System.out.println("The given element not exists in LL");
        } else {
            if(index == 0) {
                head = temp.next;
                Nodes temp1 = head;
                index =0;
                while(true) {
                    if(index == length-1) {
                        head.prev = temp1;
                        temp1.next = head;
                        break;
                    }
                    temp1 = temp1.next;
                    index++;
                }
            } else if(index == length) {
                head.prev = temp.prev;
                Nodes temp1 = temp.prev;
                temp1.next = head;
            } else {
                Nodes temp1 = temp.prev;
                temp1.next = temp.next;
                temp = temp.next;
                temp.prev = temp1;
            }
        }

    } 

    void search(int data) {
        Nodes temp = head;
        int i=0;
        while(i<length) {
            if(temp.data == data) {
                System.out.println("The element " + data + " is found at " + i + "th index");
                break;
            }
            i++;
            temp = temp.next;
        }
        if(i==length) {
            System.out.println("The given element is not found in LL");
        }
    }

    void print() {
        Nodes temp  = head;
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

            index =0;
            while(true) {
                if(length == index) {
                    break;
                }
                System.out.print(temp.data + "->"); 
                temp = temp.prev;
                index++;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }
}
