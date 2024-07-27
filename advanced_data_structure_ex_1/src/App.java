public class App {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Preorder traversal of the constructed AVL tree is:");
        tree.preOrder();
//        System.out.println();

        tree.delete(10);
        System.out.println("Preorder traversal after deletion of 10:");
        tree.preOrder();
//        System.out.println();

        Node result = tree.search(30);
        if (result != null) {
            System.out.println("Node with key 30 found.");
        } else {
            System.out.println("Node with key 30 not found.");
        }
    }
}
