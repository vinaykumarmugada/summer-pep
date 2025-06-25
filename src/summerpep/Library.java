package summerpep;
import java.util.*;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    public void addBook(String id, String title) {
        books.put(id, new Book(id, title)  );
        System.out.println("Book added: " + title);
    }

    public void removeBook(String id) {
        if (books.remove(id) != null) {
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        books.values().forEach(System.out::println);
    }

    public void registerUser(String name) {
        if (!users.containsKey(name)) {
            users.put(name, new User(name));
            System.out.println("User registered: " + name);
        } else {
            System.out.println("User already exists.");
        }
    }

    public void borrowBook(String userName, String bookId) {
        User user = users.get(userName);
        Book book = books.get(bookId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("Book already borrowed.");
            return;
        }

        user.borrowBook(book);
        System.out.println(userName + " borrowed " + book.getTitle());
    }

    public void returnBook(String userName, String bookId) {
        User user = users.get(userName);
        Book book = books.get(bookId);

        if (user == null || book == null) {
            System.out.println("User or Book not found.");
            return;
        }

        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            System.out.println(userName + " returned " + book.getTitle());
        } else {
            System.out.println("Book not borrowed by " + userName);
        }
    }
}
