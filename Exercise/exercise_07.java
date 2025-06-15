// Ex-7. Create a library management system which is capable of issuing books to students.
// Book should have information like: 1.Book Name 2.Book Author 3.Issued To 4.Issued Date
// User should be able to add books, return issued books, issue books and show available books.
// (Assume that all users are registered with their names in the central database.)

package Exercise;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Book {
    private String name, author, issuedTo;
    private Date issuedDate;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedDate = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public boolean isIssued() {
        return issuedTo != null;
    }

    public void issueTo(String studentName) {
        this.issuedTo = studentName;
        this.issuedDate = new Date(); // current date
    }

    public void returnBook() {
        this.issuedTo = null;
        this.issuedDate = null;
    }

    @Override
    public String toString() {
        if (isIssued()) {
            return name + " by " + author + " | Issued to: " + issuedTo + " on " + issuedDate;
        } else {
            return name + " by " + author + " | Available";
        }
    }
}

class Library2 {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String name, String author) {
        books.add(new Book(name, author));
        System.out.println("Book added: " + name + " by " + author);
    }

    public void issueBook(String bookName, String studentName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && !book.isIssued()) {
                book.issueTo(studentName);
                System.out.println("Book issued to " + studentName);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book was not issued or not found.");
    }

    public void showAvailableBooks() {
        System.out.println("Available books:");
        boolean anyAvailable = false;
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No books available.");
        }
    }

    public void showAllBooks() {
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library2 library = new Library2();
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Show All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addBook(name, author);
                    break;
                case 2:
                    System.out.print("Enter book name to issue: ");
                    String issueName = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String student = scanner.nextLine();
                    library.issueBook(issueName, student);
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    String returnName = scanner.nextLine();
                    library.returnBook(returnName);
                    break;
                case 4:
                    library.showAvailableBooks();
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
