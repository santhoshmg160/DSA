import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Slist sList = new Slist();

    public static void main(String[] args) {
        getChoice();
    }

    static void getChoice() {
        System.out.print("Insertion : 0, Deletion : 1, Search : 2, Print : 3 : ");
        int choice = sc.nextInt();
        if(choice != 3) {
            int data = getDatas();
            switch(choice) {
                case 0:
                    Insertion(data);
                    sList.print();
                    break;
                case 1:
                    sList.deletion(data);
                    sList.print();
                    break;
                case 2:
                    sList.search(data);
                    break;
            }
            getChoice();

        } else {
            sList.print();
        }
    }

    static void Insertion(int data) {
        System.out.print("To insert start As '0' middle as '1' end as '2':");
        int insertChoice = sc.nextInt();
        sc.nextLine();
        if(insertChoice == 0) {
            sList.insertStart(data);
        } else if (insertChoice == 1) {
            System.out.print("Insert Position Location:");
            int insertPos = sc.nextInt();
            sc.nextLine();
            sList.insertMiddle(data,insertPos);
        } else {
            sList.insertEnd(data);
        }
    }

    static int getDatas() {
        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        return data;
    }
}