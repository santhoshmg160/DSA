import java.util.*;
class Main1 {
    static Scanner sc = new Scanner(System.in);
    static Queue1 queue = new Queue1();

    public static void main(String[] args) {
        getChoice();
    }

    static void getChoice() {
        System.out.println("1. ENQUEUE OPERATION");
        System.out.println("2. DEQUEUE OPERATION");
        System.out.println("3. PEEK OPERATION");
        System.out.println("4. DISPLAY");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        // System.out.println();
        switch(choice) {
            case 1:
                System.out.print("Enter Data: ");
                int data = sc.nextInt();
                System.out.println();
                queue.enqueue(data);
                queue.display();
                break;

            case 2:
                queue.dequeue();
                queue.display();
                break;

            case 3:
                queue.peek();
                break;

            case 4:
                queue.display();
                break;
        }
        getChoice();
    }
}