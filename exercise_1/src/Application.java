import java.util.List;

public class Application {
    public static void main(String[] args) {
        Product p1 = new Product(2, "p 1", "p 1 description", 3);
        Product p2 = new Product(10, "p 2", "p 2 description", 8);
        Product p3 = new Product(22, "p 3", "p 3 description", 8);
        Product p4 = new Product(5, "p 4", "p 4 description", 0);
        List<Product> products = List.of(p1, p2, p3, p4);

        Query query = new Query();
//        query.price = 2;
//        query.name = "p 1";
//        query.amountLeft = 0;

        Director director = new Director();

        QueryBuilder queryBuilder = new QueryBuilder();
        director.makeFullSearch(queryBuilder, query);

        List<Product> filteredProducts = queryBuilder.getResults(products);

        for (Product p : filteredProducts) {
            System.out.println(p.getName());
        }
    }
}
