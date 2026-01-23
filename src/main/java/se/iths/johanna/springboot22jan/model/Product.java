package se.iths.johanna.springboot22jan.model;

public class Product {

    // Attribut
    private int id;
    private String category;
    private String name;
    private double price;
    private String description;

    // Constructor
    public Product(int id, String category, String name, double price, String description) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String category() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString-metod
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
