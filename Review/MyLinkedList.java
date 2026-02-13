package Java.Review;
public class MyLinkedList<T extends Checkpoint> {

    private Node<T> head;

    public void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void processRoute() {
        Node<T> temp = head;
        int count = 1;
        double totalPenalty = 0;
        double totalDistance = 0;

        boolean hasDelivery = false;
        boolean hasFuel = false;

        while (temp != null) {
            Checkpoint c = temp.data;
            double penalty = c.calculatePenalty();

            System.out.println(count + ". " + c.getType() + " - " +
                    c.getLocationName() +
                    " | Delay: " + c.getDelay() +
                    " | Penalty: " + penalty);

            totalPenalty += penalty;
            totalDistance += c.getDistanceFromLast();

            if (c instanceof DeliveryCheckpoint) hasDelivery = true;
            if (c instanceof FuelCheckpoint) hasFuel = true;

            count++;
            temp = temp.next;
        }

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + (100 - totalPenalty));

        if (hasDelivery && hasFuel)
            System.out.println("Critical Route Check: All required checkpoints present");
        else
            System.out.println("Critical Route Check: Missing mandatory checkpoints");
    }
}
