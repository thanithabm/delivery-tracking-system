import java.util.HashMap;
public class TrackingService {
    private HashMap<String, Shipment> shipments = new HashMap<>();
    public void addShipment(Shipment shipment) {
        shipments.put(shipment.getTrackingId(), shipment);
        System.out.println("Shipment added successfully!");
    }
    public void updateShipment(String trackingId, String location, String status) {
        Shipment shipment = shipments.get(trackingId);
        if (shipment != null) {
            shipment.updateLocation(location);
            shipment.updateStatus(status);
            System.out.println("Shipment updated!");
        } else {
            System.out.println("Shipment not found!");
        }
    }
    public void viewShipment(String trackingId) {
        Shipment shipment = shipments.get(trackingId);
        if (shipment != null) {
            shipment.displayDetails();
        } else {
            System.out.println("Shipment not found!");
        }
    }
}