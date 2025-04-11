public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        sortAscending(numbers);
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void sortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
