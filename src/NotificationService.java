public class NotificationService extends Thread {
    private String message;

    public NotificationService(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            // Simulating background network delay for notifications
            Thread.sleep(2000); 
            System.out.println("Notification sent asynchronously: " + message);
        } catch (InterruptedException e) {
            System.out.println("Notification thread interrupted.");
        }
    }
}
