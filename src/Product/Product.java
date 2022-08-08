package Product;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private double price;
    private Integer stock;
    private Integer remainingstock;
    private UUID categoryID;


    public Product(UUID id, String name, double price, Integer stock, Integer remainingstock, UUID categoryID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingstock = remainingstock;
        this.categoryID = categoryID;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingstock() {
        return remainingstock;
    }

    public UUID getCategoryID() {
        return categoryID;
    }






}
