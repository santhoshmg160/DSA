import java.util.*;

public class Main1 {
    static Scanner sc = new Scanner(System.in);
    static Clist cList = new Clist();

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
                    cList.length = cList.length + 1;
                    Insertion(data);
                    cList.print();
                    break;
                case 1:
                    cList.deletion(data);
                    cList.print();
                    break;
                case 2:
                    cList.search(data);
                    break;
            }
            getChoice();

        } else {
            cList.print();
        }
    }

    static void Insertion(int data) {
        System.out.print("To insert start As '0' middle as '1' end as '2':");
        int insertChoice = sc.nextInt();
        sc.nextLine();
        if(insertChoice == 0) {
            cList.insertStart(data);
        } else if (insertChoice == 1) {
            System.out.print("Insert Position Location:");
            int insertPos = sc.nextInt();
            sc.nextLine();
            cList.insertMiddle(data,insertPos);
        } else {
            cList.insertEnd(data);
        }
    }

    static int getDatas() {
        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        return data;
    }
}