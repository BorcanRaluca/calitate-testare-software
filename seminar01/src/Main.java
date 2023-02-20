import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop onlineShop = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product laptop = new Product("Laptop", 3200.5, 1, Product.Category.IT, 1123, null);
        Product fridge = new Product("Frigider", 207.95, 1, Product.Category.Applicances, 1245, null);

        Product product = new Product(laptop);

        product.setQty(5);
        product.setName("Paine");

        onlineShop.addProduct(laptop);
        onlineShop.addProduct(fridge);

        onlineShop.removeProduct(laptop);
        System.out.println(laptop.isEqual(fridge));
    }
}

class OnlineShop {
    private String name;
    private String logo;
    private ArrayList<Product> products;

    OnlineShop(String name, String logo, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        if(products != null && products.size() > 0) {
            for(Product product : products) {
                addProduct(product);
            }
        }

        this.logo = logo;
        this.name = name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    public enum Category { IT, Applicances, Clothing, Foods, Cosmetics, Other };
    private Category category;
    private int qty;
    private Date expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, Category category, int id, Date expiryDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public Product(Product copy)
    {
        this.name = copy.name;
        this.price = copy.price;
        this.type = copy.type;
        this.category = copy.category;
        this.id = copy.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // Returns true if the two products have the same id, name, price, type and category; otherwise returns false.
    public boolean isEqual(Product otherProduct)
    {
        if(otherProduct.id != this.id)
            return false;
        if(!otherProduct.name.equals(this.name))
            return false;
        if(otherProduct.price != this.price)
            return false;
        // aici explodeaza calculatorul
        if(otherProduct.type != this.type)
            return false;
        if(otherProduct.category != this.category)
            return false;

        return true;
    }

    public void increasePriceByPercentage(double percentage) {
        this.price += this.price * percentage / 100;
    }

    public void reducePriceByPercentage(double percentage) {
        this.price -= this.price * percentage / 100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String name;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Product> cart;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
        this.orders = new ArrayList<Order>();
        this.cart = new ArrayList<Product>();
    }

    public void addOrder(Order order)
    {
        this.orders.add(order);
    }

    public void addToCart(Product product)
    {
        this.cart.add(product);
    }
}

class Order
{
    private static final int MAX_NO_PRODUCTS = 99;
    private ArrayList<Product> products;
    private String address;

    public Order()
    {
        this.products = new ArrayList<Product>();
    }
    public void addProduct(Product product)
    {
        if (products.size() > MAX_NO_PRODUCTS)
            return;

        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class ProductInventory
{
    private Product product;
    private int qty;

    public ProductInventory(Product product, int qty)
    {
        this.product = new Product(product);
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}