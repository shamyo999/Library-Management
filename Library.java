import java.util.*;

public  class Library {

     private HashMap<String,Book> m =new HashMap<>();
     private HashMap<String,User> n =new HashMap<>();

     public void addBook(String t){
        if(m.containsKey(t)) System.out.println("Book Alredy Available\n");
        else m.put(t,new Book(t));
     }
     private void isUser(String name){
        if(!(n.containsKey(name))){
            User u=new User(name);
            n.put(name,u);
        }
     }
    
     public void borrowBook(String t,String name){
        Book b=m.get(t);
        if(b==null){
            System.out.println("Book not found\n");
        }else{
             isUser(name);
             if(b.isAvail()){
                User u=n.get(name);
                if(u.canBorrow()){
                    System.out.println("BORROWED SUCCESFULLY\n");
                    b.borrow();
                    u.borrowing(t);
                }else System.out.println("User cant borrow\n");
             }else System.out.println("Book is Alredy Borrowed\n");
        }
     }
     public void returnBook(String name){
        User u=n.get(name);
        if(u==null) System.out.println("There isn't any user as "+name+"\n");
        else{
            if(u.canReturn()){
                String title=u.getBook();
                Book b=m.get(title);
                b.returnn();
                u.returning(title);
                title=title.toUpperCase();
                System.out.println(title+" RETURNED SUCCESFULLY\n");
            }else System.out.println("This User Doesn't Doesn't Borrow any book\n");
        }
     }
     public void showAvailBook(){
        System.out.println("\nAvailable Books\n");
        int count=1;
        for(String key:m.keySet()){
            if(m.get(key).isAvail()) System.out.println(count++ +". "+ key);
        }System.out.println(); 
     }
     public void myStatus(String name){
        User u=n.get(name);
        if(u==null){
           u=new User(name);
           n.put(name,u);
        }
        System.out.println(u.canBorrow()?name+ " can Borrow "+u.moreBook()+" Book more\n": name+" Can't Borrow Book\n");
     }public void userBooks(String name){
         User u=n.get(name);
         if(u==null) System.out.println("User not found\n");
         else u.books();
     }
}
