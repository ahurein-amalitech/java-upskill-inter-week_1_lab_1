public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("apricot");
        trie.insert("banana");
        trie.insert("band");
        trie.insert("bandana");

        System.out.println("Search for 'app': " + trie.search("app")); // true
        System.out.println("Search for 'apple': " + trie.search("apple")); // true
        System.out.println("Search for 'apricot': " + trie.search("apricot")); // true
        System.out.println("Search for 'ban': " + trie.search("ban")); // false

        System.out.println("Starts with 'ap': " + trie.startsWith("ap")); // true
        System.out.println("Starts with 'ban': " + trie.startsWith("ban")); // true
        System.out.println("Starts with 'band': " + trie.startsWith("band")); // true
        System.out.println("Starts with 'bat': " + trie.startsWith("bat")); // false

        System.out.println("Words with prefix 'ap': " + trie.getWordsWithPrefix("ap"));
        System.out.println("Words with prefix 'ban': " + trie.getWordsWithPrefix("ban"));
    }
}
