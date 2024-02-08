// 1. Classe abstraite Product
abstract class Product {
    protected String name;
    protected double price;
    protected String reference;

    public Product(String name, double price, String reference) {
        this.name = name;
        this.price = price;
        this.reference = reference;
    }

    // Getters et Setters
    // ...

    // Méthode abstraite getDescription()
    public abstract String getDescription();
}

// 2.a Classe ElectronicProduct
class ElectronicProduct extends Product {
    private double power;

    public ElectronicProduct(String name, double price, String reference, double power) {
        super(name, price, reference);
        this.power = power;
    }

    // Getter et Setter pour power
    // ...

    @Override
    public String getDescription() {
        return "Electronic Product: " + name + ", Price: " + price + ", Reference: " + reference + ", Power: " + power;
    }
}

// 2.b Classe ClothingProduct
class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String reference, String size) {
        super(name, price, reference);
        this.size = size;
    }

    // Getter et Setter pour size
    // ...

    @Override
    public String getDescription() {
        return "Clothing Product: " + name + ", Price: " + price + ", Reference: " + reference + ", Size: " + size;
    }
}

// 2.c Classe BookProduct
class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String reference, String author) {
        super(name, price, reference);
        this.author = author;
    }

    // Getter et Setter pour author
    // ...

    @Override
    public String getDescription() {
        return "Book Product: " + name + ", Price: " + price + ", Reference: " + reference + ", Author: " + author;
    }
}

// 3. Interface Cart
interface Cart {
    void addProduct(Product product);

    boolean removeProduct(Product product);

    void displayProducts();

    double total();
}

// 4. Classe Order
class Order implements Cart {
    private Product[] products;
    private int size;
    private static final int MAX_PRODUCTS = 10; // Capacité maximale du tableau de produits

    public Order() {
        this.products = new Product[MAX_PRODUCTS];
        this.size = 0;
    }

    @Override
    public void addProduct(Product product) {
        if (size < MAX_PRODUCTS) {
            products[size++] = product;
            System.out.println(product.getDescription() + " added to the order.");
        } else {
            System.out.println("Order is full. Cannot add more products.");
        }
    }

    @Override
    public boolean removeProduct(Product product) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(product)) {
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[size - 1] = null;
                size--;
                System.out.println(product.getDescription() + " removed from the order.");
                return true;
            }
        }
        System.out.println("Product not found in the order.");
        return false;
    }

    @Override
    public void displayProducts() {
        System.out.println("Products in the order:");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getDescription());
        }
    }

    @Override
    public double total() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].price;
        }
        return total;
    }
}

