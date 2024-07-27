class MinHeap {
    private Task[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new Task[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        Task temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapify(int i) {
        int smallest = i;
        int left = left(i);
        int right = right(i);

        if (left < size && heap[left].priority < heap[smallest].priority) {
            smallest = left;
        }

        if (right < size && heap[right].priority < heap[smallest].priority) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public void insert(Task task) {
        if (size == capacity) {
            throw new RuntimeException("Heap is full");
        }

        int i = size;
        heap[size++] = task;

        while (i != 0 && heap[parent(i)].priority > heap[i].priority) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public Task extractMin() {
        if (size <= 0) {
            throw new RuntimeException("Heap is empty");
        }

        if (size == 1) {
            return heap[--size];
        }

        Task root = heap[0];
        heap[0] = heap[--size];
        heapify(0);

        return root;
    }

    public Task getMin() {
        if (size <= 0) {
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
