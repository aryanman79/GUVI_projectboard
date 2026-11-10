public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Library System ---");

        // Test OOP
        Librarian admin = new Librarian("Admin One", "admin@library.com");
        Member student = new Member("Student One", "student@university.edu");
        
        admin.displayDashboard();
        student.displayDashboard();

        // Test Collections
        student.addTransaction("Java Programming 101");
        
        // Test Multithreading
        NotificationService alert = new NotificationService("Your book is due tomorrow!");
        alert.start(); // Using start() triggers the background thread

        System.out.println("--- Main process finished, waiting for background notifications... ---");
    }
}
