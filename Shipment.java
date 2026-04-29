public class Shipment {
    private String trackingId;
    private String sender;
    private String receiver;
    private String currentLocation;
    private String status;
    public Shipment(String trackingId, String sender, String receiver) {
        this.trackingId = trackingId;
        this.sender = sender;
        this.receiver = receiver;
        this.currentLocation = "Warehouse";
        this.status = "Order Placed";
    }
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
    public void updateStatus(String status) {
        this.status = status;
    }
    public void displayDetails() {
        System.out.println("\n--- Shipment Details ---");
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Current Location: " + currentLocation);
        System.out.println("Status: " + status);
    }

    public String getTrackingId() {
        return trackingId;
    }
}