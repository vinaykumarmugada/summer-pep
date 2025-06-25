package summerpep;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Register User");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Book Title: ");
                    String title = scanner.nextLine();
                    library.addBook(id, title);
                    break;
                case "2":
                    System.out.print("Book ID: ");
                    library.removeBook(scanner.nextLine());
                    break;
                case "3":
                    library.viewBooks();
                    break;
                case "4":
                    System.out.print("User Name: ");
                    library.registerUser(scanner.nextLine()); 
                    break;
                case "5":
                    System.out.print("User Name: ");
                    String uname = scanner.nextLine();
                    System.out.print("Book ID: ");
                    String bid = scanner.nextLine();
                    library.borrowBook(uname, bid);
                    break;
                case "6":
                    System.out.print("User Name: ");
                    String unameR = scanner.nextLine();
                    System.out.print("Book ID: ");
                    String bidR = scanner.nextLine();
                    library.returnBook(unameR, bidR);
                    break;
                case "0":
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (!choice.equals("0"));

        scanner.close();
    }
    }

