package asm2_1649;
import java.util.LinkedList;
import java.util.Queue;


// Class to represent the Ordering System
public class OrderingSystem {
    private Queue<Order> orderQueue;

    public OrderingSystem() {
        orderQueue = new LinkedList<>();
    }

    // Method to add an order to the queue
    public void placeOrder(Order order) {
        orderQueue.add(order);
        System.out.println("Order placed successfully.");
    }

    // Method to process the next order in the queue
    public void processNextOrder() {
        if (!orderQueue.isEmpty()) {
            Order nextOrder = orderQueue.poll();
            System.out.println("Processing order: " + nextOrder);
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    // Method to display all orders in the queue
    public void displayOrders() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Orders in the queue:");
            for (Order order : orderQueue) {
                System.out.println(order);
            }
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    // Method to check if the order queue is empty
    public boolean isOrderQueueEmpty() {
        return orderQueue.isEmpty();
    }
}
