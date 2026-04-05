import java.util.*;

public class User {
    private final String name;
    private ArrayList<String>bb=new ArrayList<>();

    User(String name){
        this.name=name;
    }
    public boolean canBorrow(){
        return bb.size()<3;
    }
    public boolean canReturn(){
        return !bb.isEmpty();
    }
    public void borrowing(String t){
        bb.add(t);
    }
    public void returning(String t){
        bb.remove(t);
    }
    public String getBook(){
        return bb.get(0); 
    }public void books(){
        int c=1;
        System.out.println();
        for(String book:bb)  System.out.println(c++ + ". "+book);
        System.out.println();
    }
    public int moreBook(){
        return 3-bb.size();
    }
}
