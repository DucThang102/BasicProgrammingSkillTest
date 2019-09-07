package com.example;

import java.util.Scanner;

public class MultipleMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trân");
        int matrixLength = scanner.nextInt();

        int[][] matrix1 = new int[matrixLength][matrixLength];
        int[][] matrix2 = new int[matrixLength][matrixLength];
        System.out.println("Nhập ma trận 1");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("matrix1[%d][%d] = ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập ma trận 2");
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.printf("matrix2[%d][%d] = ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận 1");
        displayMatrix(matrix1, matrixLength);

        System.out.println("Ma trận 2");
        displayMatrix(matrix2, matrixLength);


        System.out.println("Tích 2 ma trận là");
        displayMatrix(multipleMatrix(matrix1, matrix2, matrixLength), matrixLength);

    }

    private static int[][] multipleMatrix(int[][] matrix1, int[][] matrix2, int matrixLength) {
        int[][] resultMatrix = new int[matrixLength][matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < matrixLength; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void displayMatrix(int[][] matrix, int matrixLength) {
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
