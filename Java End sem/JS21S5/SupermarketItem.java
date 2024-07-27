import java.io.Serializable;

class SupermarketItem implements Serializable {
    private String description;
    private int stock;
    private double price;

    // Constructor, getters, setters, and toString method
    public SupermarketItem(String description, int stock, double price) {
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SupermarketItem{" +
                "description='" + description + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}

