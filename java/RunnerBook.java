package asm2_1649;


import java.util.Scanner;

public class RunnerBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        OrderingSystem orderingSystem = new OrderingSystem();

        int choice;
        do {
            System.out.println("Book Management and Ordering System");
            System.out.println("1. Book Management");
            System.out.println("2. Ordering System");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    handleBookManagement(bookManager, scanner);
                    break;
                case 2:
                    handleOrderingSystem(orderingSystem, scanner);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void handleBookManagement(BookManager bookManager, Scanner scanner) {
        int choice;
        do {
            System.out.println("Book Management");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter book details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    bookManager.addBook(name, title, author, price);
                    break;
                case 2:
                    bookManager.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    // Search books and display results
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
    }

    private static void handleOrderingSystem(OrderingSystem orderingSystem, Scanner scanner) {
        int choice;
        do {
            System.out.println("Ordering System");
            System.out.println("1. Place an order");
            System.out.println("2. Process next order");
            System.out.println("3. Display all orders");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter order details:");
                    System.out.print("Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Shipping Address: ");
                    String shippingAddress = scanner.nextLine();
                    // Add code to input products if needed
                    // Then create an order object and place the order
                    Order order = new Order(customerName, shippingAddress, null); // Replace null with products
                    orderingSystem.placeOrder(order);
                    break;
                case 2:
                    orderingSystem.processNextOrder();
                    break;
                case 3:
                    orderingSystem.displayOrders();
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
    }
}
