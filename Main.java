import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrackingService service = new TrackingService();

        while (true) {
            System.out.println("\n=== Delivery Tracking System ===");
            System.out.println("1. Add Shipment");
            System.out.println("2. Update Shipment");
            System.out.println("3. View Shipment");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Tracking ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Sender Name: ");
                    String sender = sc.nextLine();
                    System.out.print("Enter Receiver Name: ");
                    String receiver = sc.nextLine();

                    Shipment shipment = new Shipment(id, sender, receiver);
                    service.addShipment(shipment);
                    break;

                case 2:
                    System.out.print("Enter Tracking ID: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter New Location: ");
                    String location = sc.nextLine();
                    System.out.print("Enter New Status: ");
                    String status = sc.nextLine();

                    service.updateShipment(uid, location, status);
                    break;

                case 3:
                    System.out.print("Enter Tracking ID: ");
                    String vid = sc.nextLine();
                    service.viewShipment(vid);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}