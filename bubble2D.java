public class bubble2D {
    
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        bub2D(numbers, true);
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void bub2D (int [][] numbers, boolean asc) {
        if (numbers == null || numbers.length == 0 || numbers[0].length == 0) {
            return;
        }

        int rows = numbers.length;
        int cols = numbers[0].length;
        int totalElements = rows * cols;

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

            int currentRow = j / cols;
            int currentColumn = j % cols;
            int nextRow = (j + 1) / cols;
            int nextColumn = (j + 1) % cols;


                if (asc) {
                    if (numbers[currentRow][currentColumn] > numbers[nextRow][nextColumn]) {
                        int tmp = numbers[currentRow][currentColumn];
                        numbers[currentRow][currentColumn] = numbers[nextRow][nextColumn];
                        numbers[nextRow][nextColumn] = tmp;
                    }
                } else {
                    if (numbers[currentRow][currentColumn] < numbers[nextRow][nextColumn]) {
                        int tmp = numbers[currentRow][currentColumn];
                        numbers[currentRow][currentColumn] = numbers[nextRow][nextColumn];
                        numbers[nextRow][nextColumn] = tmp;
                    }
                }
            }
        }
    }
}
