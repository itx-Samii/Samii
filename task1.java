import java.util.*;

// Book class
class Book {
    int id;
    String title;
    String author;
    String status = "Available"; // or "Borrowed"

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(id + ": " + title + " by " + author + " (" + status + ")");
    }
}

// Member class
class Member {
    String name;

    Member(String name) {
        this.name = name;
    }

    void borrowBook(Book book) {
        if (book.status.equals("Available")) {
            book.status = "Borrowed";
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    void returnBook(Book book) {
        book.status = "Available";
        System.out.println(name + " returned " + book.title);
    }
}

// Main library class
public class task1 {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Show Books");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                books.add(new Book(id, title, author));
                System.out.println("Book added.");
            }

            else if (choice == 2) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                members.add(new Member(name));
                System.out.println("Member registered.");
            }

            else if (choice == 3) {
                for (Book b : books) b.display();
            }

            else if (choice == 4) {
                System.out.print("Member name: ");
                String name = sc.nextLine();
                Member m = null;
                for (Member mem : members) {
                    if (mem.name.equalsIgnoreCase(name)) m = mem;
                }
                if (m == null) {
                    System.out.println("Member not found.");
                    continue;
                }

                System.out.print("Book ID: ");
                int id = sc.nextInt();
                Book book = null;
                for (Book b : books) {
                    if (b.id == id) book = b;
                }
                if (book != null) m.borrowBook(book);
                else System.out.println("Book not found.");
            }

            else if (choice == 5) {
                System.out.print("Member name: ");
                String name = sc.nextLine();
                Member m = null;
                for (Member mem : members) {
                    if (mem.name.equalsIgnoreCase(name)) m = mem;
                }
                if (m == null) {
                    System.out.println("Member not found.");
                    continue;
                }

                System.out.print("Book ID: ");
                int id = sc.nextInt();
                Book book = null;
                for (Book b : books) {
                    if (b.id == id) book = b;
                }
                if (book != null) m.returnBook(book);
                else System.out.println("Book not found.");
            }

        } while (choice != 0);

        sc.close();
        System.out.println("Goodbye!");
    }
}
