class Item {
    int value;
    int weight;
    double valuePerWeight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.valuePerWeight = (double) value / weight;
    }
}
