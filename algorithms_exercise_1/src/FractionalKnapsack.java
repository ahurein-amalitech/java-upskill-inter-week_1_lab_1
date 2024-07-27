import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static double getMaxValue(int capacity, Item[] items) {
        Arrays.sort(items, Comparator.comparingDouble(item -> -item.valuePerWeight));

        double totalValue = 0;

        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.valuePerWeight * capacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;

        double maxValue = getMaxValue(capacity, items);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
