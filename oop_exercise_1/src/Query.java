public class Query {
    public String name = null;
    public String description = null;
    public Integer price = null;
    public Integer amountLeft = null;

    public Query() {
    }

    public Query(String name, String description, int price, int amountLeft) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountLeft = amountLeft;
    }
}
