package com.example;

import java.util.Scanner;

public class DetMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trân");
        int matrixLength = scanner.nextInt();

        int matrix[][] = new int[matrixLength][matrixLength];

        System.out.println("Nhập ma trận");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("matrix1[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int detMatrix(int[][] matrix, int matrixLength) {
        return 0;
    }
}
