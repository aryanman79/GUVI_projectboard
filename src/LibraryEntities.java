import java.util.ArrayList;
import java.util.List;

// Interface implementation
interface LibraryOperations {
    void displayDashboard();
}

// Inheritance base class
abstract class User implements LibraryOperations {
    protected String name;
    protected String email;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

class Librarian extends User {
    public Librarian(String name, String email) { super(name, email); }
    
    @Override
    public void displayDashboard() {
        System.out.println("Loading Librarian Dashboard: Book, Member, and Transaction Management.");
    }
}

class Member extends User {
    // Collections & Generics implementation
    private List<String> borrowingHistory = new ArrayList<>();
    
    public Member(String name, String email) { super(name, email); }
    
    public void addTransaction(String bookTitle) {
        borrowingHistory.add(bookTitle);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Loading Member Dashboard: Book Search and Borrowing History.");
    }
}
