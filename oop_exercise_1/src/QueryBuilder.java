import javax.swing.plaf.ProgressBarUI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QueryBuilder implements Builder {

    private Query query = new Query();

    @Override
    public void reset() {
        query = new Query();
    }

    @Override
    public void buildPrice(Query query) {
        this.query.price = query.price;
    }

    @Override
    public void buildDescription(Query query) {
        this.query.description = query.description;
    }

    @Override
    public void buildAmountLeft(Query query) {
        this.query.amountLeft = query.amountLeft;
    }

    @Override
    public void buildName(Query query) {
        this.query.name = query.name;
    }

    List<Product> getResults(List<Product> AllProducts){
        List<Product> products = List.copyOf(AllProducts);
        Stream<Product> productStream = products.stream();
        if (query.price != null) {
            productStream = productStream.filter(p -> p.getPrice() == query.price);
        }

        if (query.description != null) {
            productStream = productStream.filter(p -> p.getDescription().contains(query.description));
        }

        if (query.name != null) {
            productStream = productStream.filter(p -> p.getName().contains(query.name));
        }

        if (query.amountLeft != null) {
            productStream = productStream.filter(p -> p.getAmountLeft() == query.amountLeft);
        }

        return productStream.collect(Collectors.toList());
    }
}
