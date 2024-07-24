public class Director {
    void makeFullSearch(Builder builder, Query query){
        builder.reset();
        builder.buildAmountLeft(query);
        builder.buildDescription(query);
        builder.buildName(query);
        builder.buildPrice(query);
    }
}
