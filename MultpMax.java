public class MultpMax {

    public static long maxProduct(int[] numbers, int sub_size) {
        int n = numbers.length;

        // Implementación correcta de Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    // Intercambiar elementos
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

        // Calcular el producto máximo
        long max = 1;
        for (int i = 0; i < sub_size; i++) {
            max *= numbers[i];
        }

        // for (int i = n - 1; i >= n - sub_size; i--) {
        //     max *= numbers[i];
        // }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int sub_size = 3;
        System.out.println(maxProduct(numbers, sub_size)); // Salida: 336 (7 * 8 * 6)
    }
}
