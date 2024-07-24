public class Product {
    private int price;
    private String name;
    private String description;
    private int amountLeft;

    public Product() {
    }

    public Product(int price, String name, String description, int amountLeft) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.amountLeft = amountLeft;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmountLeft(int amountLeft) {
        this.amountLeft = amountLeft;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmountLeft() {
        return amountLeft;
    }
}
