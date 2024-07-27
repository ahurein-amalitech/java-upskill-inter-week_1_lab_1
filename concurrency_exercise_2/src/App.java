public class App {
    public static void main(String[] args) {
        CacheMap<String, String> cache = new CacheMap<>();
        cache.put("key1", "value1");
        cache.put("key2", "value2");

        System.out.println(STR."Cache contains key1: \{cache.containsKey("key1")}");

        cache.clear();
        System.out.println(STR."Cache size after clearing: \{cache.size()}");
    }
}
