package summerpep;

public class Book {
    private String id;
    private String title;
    private boolean isBorrowed;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }   

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + " (ID: " + id + ", " + (isBorrowed ? "Borrowed" : "Available") + ")";
    }
}
