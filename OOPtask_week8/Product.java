public class Product {
    private String productName;
    private String productID;
    private double price;
    private int stockQuantity;
    public Product(String productName, String productID, double price, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        setPrice(price); 
        this.stockQuantity = stockQuantity;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " units restocked.");
        } else {
            System.out.println("Invalid restock quantity.");
        }
    }
    public void purchase(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid purchase quantity.");
        } else if (quantity > stockQuantity) {
            System.out.println("Not enough stock available.");
        } else {
            stockQuantity -= quantity;
            System.out.println(quantity + " units purchased.");
        }
    }
    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Stock Available: " + stockQuantity);
    }
    public static void main(String[] args) {
        Product product = new Product("Wireless Mouse", "M123", 29.99, 50);
        product.displayProductInfo();
        product.purchase(5);
        product.restock(10);
        product.setPrice(-15);
        System.out.println("\nUpdated Product Info:");
        product.displayProductInfo();
    }
}
