import java.util.*;
class Main1 {
    static Scanner sc = new Scanner(System.in);
    static Stack stack = new Stack();

    public static void main(String[] args) {
        getChoice();
    }

    static void getChoice() {
        System.out.println("1. PUSH OPERATION");
        System.out.println("2. POP OPERATION");
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
                stack.push(data);
                stack.display();
                break;

            case 2:
                stack.pop();
                stack.display();
                break;

            case 3:
                stack.peek();
                break;

            case 4:
                stack.display();
                break;
        }
        getChoice();
    }
}