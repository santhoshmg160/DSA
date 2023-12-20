import java.util.*;
public class Main3 {

    static Scanner sc = new Scanner(System.in);
    static Cdlist cdList = new Cdlist();
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
                    cdList.length = cdList.length + 1;
                    Insertion(data);
                    cdList.print();
                    break;
                case 1:
                    cdList.deletion(data);
                    cdList.print();
                    break;
                case 2:
                    cdList.search(data);
                    break;
            }
            getChoice();

        } else {
            cdList.print();
        }
    }

    static void Insertion(int data) {
        System.out.print("To insert start As '0' middle as '1' end as '2':");
        int insertChoice = sc.nextInt();
        sc.nextLine();
        if(insertChoice == 0) {
            cdList.insertStart(data);
        } else if (insertChoice == 1) {
            System.out.print("Insert Position Location:");
            int insertPos = sc.nextInt();
            sc.nextLine();
            cdList.insertMiddle(data,insertPos);
        } else {
            cdList.insertEnd(data);
        }
    }

    static int getDatas() {
        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        return data;
    }
}