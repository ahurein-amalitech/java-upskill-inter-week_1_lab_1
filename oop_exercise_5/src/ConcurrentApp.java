public class ConcurrentApp {
    public static void main(String[] args) {
        Cache<String, String> cache = new Cache<>();

        cache.put("key1", "3");
        cache.put("key2", "8");
        cache.put("key3", "6");

        System.out.println(STR."key 1: \{cache.get("key1")}");
        System.out.println(STR."key 2: \{cache.get("key2")}");

        cache.remove("key2");
        System.out.println(STR."key2 after removal: \{cache.get("key2")}");

        cache.clear();
        System.out.println(STR."removing everything, cache size \{cache.size()}");
    }
}
