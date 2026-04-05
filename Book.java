public class Book{
    private final String title;
    private boolean avail;
    Book(String t){
        title=t;
        avail=true;
    }
    public String getTitle(){
        return title;
    }public boolean isAvail(){
        return avail;
    }public void borrow(){
        avail=false;
    }public void returnn(){
        avail=true;
    }
}