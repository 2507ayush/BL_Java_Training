package Java.Review;
public class Driver {
    public static void main(String[] args) {

        System.out.println("Driver: D1204 - Kavita Nair");
        System.out.println("Route Summary:\n");

        MyLinkedList<Checkpoint> route = new MyLinkedList<>();

        route.addCheckpoint(new DeliveryCheckpoint(
                "CP1", "Warehouse A", 20.0, 20, 30));

        route.addCheckpoint(new FuelCheckpoint(
                "CP2", "Pump 12", 5.0, 10, 10));

        route.addCheckpoint(new RestCheckpoint(
                "CP3", "Motel X", 2.5, 30, 45));

        route.addCheckpoint(new DeliveryCheckpoint(
                "CP4", "Client Hub", 10.0, 25, 40));

        route.processRoute();
    }
}
