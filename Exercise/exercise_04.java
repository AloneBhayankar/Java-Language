// Ex-4. You have to implement a library using java class library
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books, Array to store the issued books

package Exercise;
class Library {                          // Class representing the Library
    int no_of_books;                     // Keeps count of the books in the library
    String[] books;                      // Array to store book names (max 100 books)
    Library() {                          // Constructor
        this.books = new String[100];    // Fixed size array
        this.no_of_books = 0;            // Initialize book count to 0
    }
    void addBook(String book) {          // Method to add a book 
        this.books[no_of_books] = book;  // Add book at current index
        no_of_books++;                   // Increment book count
        System.out.println(book + " book has been added successfully!");
    } 
    void showAvailableBooks() {          // Method to display all available  books
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;                // Skip null values
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) {        // Method to issue a book
        for (int i = 0; i < this.books.length; i++) {
            // Check if the book matches and is not already issued
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book \"" + book + "\" book has been issued!");
                this.books[i] = null;    // Mark as issued by setting to null
                return;
            }
        }
        System.out.println("This book is not available!"); // Book not found or already issued
    }
    void returnBook(String book) {       // Method to return a book
        this.books[no_of_books] = book;  // Add book back at next available index
        no_of_books++;                   // Update count
        System.out.println("The book \"" + book + "\" book has been returned!");
    }
}
public class exercise_04 {
    public static void main(String[] args) {
        Library central_library = new Library();
        // Add books to the library
        central_library.addBook("Java Programming");
        central_library.addBook("React Framework");
        central_library.addBook("HTML Language");
        System.out.println();
        // Display books before issuing
        central_library.showAvailableBooks();
        System.out.println();
        // Issue a book
        central_library.issueBook("React Framework");
        System.out.println();
        // Display books after issuing
        central_library.showAvailableBooks();
        System.out.println();
        // Return the issued book
        central_library.returnBook("React Framework");
        System.out.println();
        // Final list of available books
        central_library.showAvailableBooks();
    }
}
// Output:
// Java Programming book has been added successfully!
// React Framework book has been added successfully!
// HTML Language book has been added successfully!  

// Available books are:
// * Java Programming
// * React Framework
// * HTML Language

// The book "React Framework" book has been issued! 

// Available books are:
// * Java Programming
// * HTML Language

// The book "React Framework" book has been returned!

// Available books are:
// * Java Programming
// * HTML Language
// * React Framework