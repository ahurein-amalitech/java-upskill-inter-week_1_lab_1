public class GenericClassApp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(8);
        stack.push(4);
        stack.push(8);

        System.out.println(STR."size \{stack.size()}");
        System.out.println(stack.peep());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
