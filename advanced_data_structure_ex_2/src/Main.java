public class Main {
    public static void main(String[] args) {
        MinHeap taskScheduler = new MinHeap(10);

        taskScheduler.insert(new Task(3, "Task 1"));
        taskScheduler.insert(new Task(2, "Task 2"));
        taskScheduler.insert(new Task(1, "Task 3"));
        taskScheduler.insert(new Task(5, "Task 4"));
        taskScheduler.insert(new Task(4, "Task 5"));

        System.out.println("Tasks in order of priority:");

        while (!taskScheduler.isEmpty()) {
            Task task = taskScheduler.extractMin();
            System.out.println(STR."Priority: \{task.priority}, Description: \{task.description}");
        }
    }
}
