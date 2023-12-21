class Stack {
    int top=-1;
    int length = 7;
    int arr[] = new int[length];

    boolean isEmpty() {
        if(top==-1) {
            return false;
        }
        return true;
    }

    boolean isFull() {
        if(top == length - 1) {
            return false;
        }
        return true;
    }

    void push(int data) {
        if(isFull()) {
            top = top+1;
            arr[top] = data;
            System.out.println("Element inserted Successfully");
        } else {
            System.out.println("Overflow");
        }
    }
    
    void pop() {
        if(isEmpty()) {
            top = top-1;
            System.out.println("Last Element Deleted Successfully");
        } else {
            System.out.println("Underflow");
        }
    }

    void peek() {
        if(isEmpty()) {
            System.out.println(arr[top]);
        } else {
            System.out.println("Underflow");
        }
    }

    void display() {
        if(isEmpty()) {
            for(int i=top;i>=0;i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Underflow");
        }
    }
}