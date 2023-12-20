import java.util.*;
public class Main2 {

    static Scanner sc = new Scanner(System.in);
    static Dlist dList = new Dlist();
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
                    dList.print();
                    break;
                case 1:
                    dList.deletion(data);
                    dList.print();
                    break;
                case 2:
                    dList.search(data);
                    break;
            }
            getChoice();

        } else {
            dList.print();
        }
    }

    static void Insertion(int data) {
        System.out.print("To insert start As '0' middle as '1' end as '2':");
        int insertChoice = sc.nextInt();
        sc.nextLine();
        if(insertChoice == 0) {
            dList.insertStart(data);
        } else if (insertChoice == 1) {
            System.out.print("Insert Position Location:");
            int insertPos = sc.nextInt();
            sc.nextLine();
            dList.insertMiddle(data,insertPos);
        } else {
            dList.insertEnd(data);
        }
    }

    static int getDatas() {
        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        return data;
    }
}