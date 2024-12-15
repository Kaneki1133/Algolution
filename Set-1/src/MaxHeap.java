public class MaxHeap {

    private final int[] heap;  // Array to store the heap
    private int size;    // Current size of the heap
    private final int maxSize; // Maximum size of the heap

    // Constructor to initialize the heap with a given maximum size
    public MaxHeap(int maxSize)
    {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize];
    }

    // Function to insert a new element into the max heap
    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap overflow, cannot insert.");
            return;
        }

        // Step 1: Insert the new element at the end of the heapś
        heap[size] = element;
        int currentIndex = size;
        size++;  // Increase the size of the heap

        // Step 2: Perform "heapify-up" to maintain the max-heap property
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            // If the current element is greater than its parent, swap them
            if (heap[currentIndex] > heap[parentIndex]) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex;
            } else {
                break; // Max-heap property is satisfied, break the loop
            }
        }
    }

    // Function to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Function to print the heap array
    public void printHeap() {
        System.out.print("Heap array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main function to demonstrate heap insertion
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10); // Create a max heap with a capacity of 10

        // Insert elements into the max heap
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(5);
        maxHeap.insert(25);

        // Print the heap after insertions
        maxHeap.printHeap();
    }
}
