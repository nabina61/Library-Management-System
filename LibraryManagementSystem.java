import java.util.ArrayList;
import java.util.List;

class LibraryItem {
    private String title;
    private String author;
    private String isbn;

    
    public LibraryItem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}


class Book extends LibraryItem {
   private String genre;

   
    public Book(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

   
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Genre: " + genre);
    }
    

}

 class Magazine extends LibraryItem {

    private int issueNumber;


    public Magazine(String title, String author, String isbn, int issueNumber) {
        super(title, author, isbn);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Issue Number: " + issueNumber);
    }
}
class LibraryManager {

    private List<LibraryItem> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayInformation();
        
        }
    }
}


public class LibraryManagementSystem{
    public static void main(String[] args) {
        Book book = new Book("The hiden Hindu", "Akshat Gupta", "97801434555691", "Historical");
        Magazine magazine = new Magazine("WILDLIFE PHOTOGRAPHY WORLD", "National geographic", "9785263",2016 );
        System.out.println("Book Information:");
        book.displayInformation();
        System.out.println("\nMagazine Information");
        magazine.displayInformation();
        LibraryManager manager = new LibraryManager();
        manager.displayItems();
        ArrayList<String>arr=new ArrayList<>();
        
        
}}
