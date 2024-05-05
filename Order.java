package asm2_1649;

public class Order {
    private String customerName;
    private String shippingAddress;
    private String[] products;

    public Order(String customerName, String shippingAddress, String[] products) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.products = products;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
