import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----LIBRARY----\n");
        Library l=new Library();
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. See Available Books");
            System.out.println("5. User Status");
            System.out.println("6. User Books");
            System.out.println("7. Exit");
            System.out.print("Chose Option: ");
            int x=sc.nextInt();

            if(x==1){
                sc.nextLine();
                System.out.print("Enter Book title:");
                String s=sc.nextLine();
                l.addBook(s);
            }else if(x==2){
                sc.nextLine();
                System.out.print("Enter Book title:");
                String s=sc.nextLine();
                System.out.print("Enter user name:");
                String t=sc.nextLine();
                l.borrowBook(s, t);
            }else if(x==3){
                sc.nextLine();
                System.out.print("Enter User name:");
                String t=sc.nextLine();
                l.returnBook(t);
            }else if(x==4){
                l.showAvailBook();
            }else if(x==5){
                sc.nextLine();
                System.out.print("Enter User name:");
                String name=sc.nextLine();
                l.myStatus(name);
            }else if(x==6){
                sc.nextLine();
                System.out.print("Enter User name:");
                String name=sc.nextLine();
                l.userBooks(name);
            }else break;
        }sc.close();
    }
}
