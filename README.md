# Examen
Examen

Arrays ---> clásicos (tamaño fijos)
ArrayList
Hashmap/Hashset ok ContarDuplicadas  bookseller
Matrices
BinnarySearch ok Busacr un elemento
LinkedList (nodos) ok  Verificación diagonales
bubble sort y 2d ok  productMax


Secuencias String



1. Convertir una matriz 2D en un arreglo 1D
Cuando trabajamos con una matriz 2D, podemos "aplanarla" en un arreglo 1D para facilitar ciertas operaciones, como el ordenamiento. La idea es tratar la matriz como si fuera un solo arreglo lineal, donde cada elemento de la matriz se coloca uno después del otro.

Ejemplo:
Supongamos que tenemos la siguiente matriz 2D:

Copy
int[][] matriz = {
    {5, 3, 1},
    {8, 6, 7},
    {4, 2, 9}
};
Si la convertimos en un arreglo 1D, quedaría así:

Copy
int[] arreglo1D = {5, 3, 1, 8, 6, 7, 4, 2, 9};
2. Cómo se hace la conversión en el código
En el código que proporcionaste, no se convierte explícitamente la matriz en un arreglo 1D, sino que se trata la matriz como si fuera un arreglo 1D utilizando índices lineales. Esto se logra calculando las filas y columnas correspondientes a partir del índice lineal j.

3. Explicación del bucle for y las operaciones
El bucle for que mencionas es el núcleo del algoritmo de Bubble Sort aplicado a la matriz tratada como un arreglo 1D. Vamos a desglosarlo paso a paso:

Bucle for:
java
Copy
for (int j = 0; j < totalElements - i - 1; j++) {
    // Calcular fila y columna actual
    int currentRow = j / cols;
    int currentColumn = j % cols;

    // Calcular fila y columna siguiente
    int nextRow = (j + 1) / cols;
    int nextColumn = (j + 1) % cols;
}
Paso 1: Índice lineal j
El índice j representa la posición actual en el arreglo 1D imaginario.

Por ejemplo, si j = 2, estamos en el tercer elemento del arreglo 1D.

Paso 2: Calcular fila y columna actual
java
Copy
int currentRow = j / cols;
int currentColumn = j % cols;
División (/): j / cols calcula la fila correspondiente al índice j.

Ejemplo: Si j = 2 y cols = 3, entonces 2 / 3 = 0. Esto significa que el elemento está en la fila 0.

Módulo (%): j % cols calcula la columna correspondiente al índice j.

Ejemplo: Si j = 2 y cols = 3, entonces 2 % 3 = 2. Esto significa que el elemento está en la columna 2.

Paso 3: Calcular fila y columna siguiente
java
Copy
int nextRow = (j + 1) / cols;
int nextColumn = (j + 1) % cols;
Aquí se calcula la fila y columna del siguiente elemento en el arreglo 1D imaginario.

División (/): (j + 1) / cols calcula la fila del siguiente elemento.

Ejemplo: Si j = 2 y cols = 3, entonces (2 + 1) / 3 = 1. Esto significa que el siguiente elemento está en la fila 1.

Módulo (%): (j + 1) % cols calcula la columna del siguiente elemento.

Ejemplo: Si j = 2 y cols = 3, entonces (2 + 1) % 3 = 0. Esto significa que el siguiente elemento está en la columna 0.

4. Ejemplo completo
Supongamos que tenemos la siguiente matriz:

Copy
int[][] matriz = {
    {5, 3, 1},
    {8, 6, 7},
    {4, 2, 9}
};
rows = 3 (filas)

cols = 3 (columnas)

totalElements = 9 (total de elementos)

Iteración 1: j = 0
currentRow = 0 / 3 = 0

currentColumn = 0 % 3 = 0

Elemento actual: matriz[0][0] = 5

nextRow = (0 + 1) / 3 = 0

nextColumn = (0 + 1) % 3 = 1

Elemento siguiente: matriz[0][1] = 3

Comparar 5 y 3. Si 5 > 3, se intercambian.

Iteración 2: j = 1
currentRow = 1 / 3 = 0

currentColumn = 1 % 3 = 1

Elemento actual: matriz[0][1] = 5 (después del intercambio)

nextRow = (1 + 1) / 3 = 0

nextColumn = (1 + 1) % 3 = 2

Elemento siguiente: matriz[0][2] = 1

Comparar 5 y 1. Si 5 > 1, se intercambian.

Iteración 3: j = 2
currentRow = 2 / 3 = 0

currentColumn = 2 % 3 = 2

Elemento actual: matriz[0][2] = 5 (después del intercambio)

nextRow = (2 + 1) / 3 = 1

nextColumn = (2 + 1) % 3 = 0

Elemento siguiente: matriz[1][0] = 8

Comparar 5 y 8. No se intercambian.

5. ¿Por qué funciona esto?
División (/): Nos da la fila correspondiente al índice lineal.

Módulo (%): Nos da la columna correspondiente al índice lineal.

Al tratar la matriz como un arreglo 1D, podemos aplicar algoritmos de ordenamiento como Bubble Sort de manera sencilla.

6. Ejemplo de código completo
Aquí te dejo el código completo con comentarios para que veas cómo funciona en la práctica:

java
Copy
public static void bub2D(int[][] numbers, boolean asc) {
    // Validar la matriz
    if (numbers == null || numbers.length == 0 || numbers[0].length == 0) {
        return;
    }

    int rows = numbers.length;
    int cols = numbers[0].length;
    int totalElements = rows * cols;

    // Bubble Sort
    for (int i = 0; i < totalElements - 1; i++) {
        for (int j = 0; j < totalElements - i - 1; j++) {
            // Calcular fila y columna actual
            int currentRow = j / cols;
            int currentColumn = j % cols;

            // Calcular fila y columna siguiente
            int nextRow = (j + 1) / cols;
            int nextColumn = (j + 1) % cols;

            // Obtener valores actual y siguiente
            int current = numbers[currentRow][currentColumn];
            int next = numbers[nextRow][nextColumn];

            // Comparar e intercambiar (ascendente o descendente)
            if ((asc && current > next) || (!asc && current < next)) {
                // Intercambiar valores
                numbers[currentRow][currentColumn] = next;
                numbers[nextRow][nextColumn] = current;
            }
        }
    }
}
7. Ejemplo de uso
java
Copy
public static void main(String[] args) {
    int[][] matriz = {
        {5, 3, 1},
        {8, 6, 7},
        {4, 2, 9}
    };

    System.out.println("Matriz original:");
    imprimirMatriz(matriz);

    // Ordenar ascendente
    bub2D(matriz, true);
    System.out.println("\nMatriz ordenada (ascendente):");
    imprimirMatriz(matriz);

    // Ordenar descendente
    bub2D(matriz, false);
    System.out.println("\nMatriz ordenada (descendente):");
    imprimirMatriz(matriz);
}

public static void imprimirMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
        for (int valor : fila) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
Salida esperada:
Copy
Matriz original:
5 3 1 
8 6 7 
4 2 9 

Matriz ordenada (ascendente):
1 2 3 
4 5 6 
7 8 9 

Matriz ordenada (descendente):
9 8 7 
6 5 4 
3 2 1 


