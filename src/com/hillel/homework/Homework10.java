package com.hillel.homework;

import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number (M): ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        int M = input.nextInt();

        System.out.print("Enter the number (N): ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number");
            input.next();
        }
        int N = input.nextInt();

        int[][] matrix = new int[M][N];
        int[][] transposedMatrix = new int[N][M];

        // Transpose the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Matrix M x N:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrix2 = new int[N][M];
        int[][] transposedMatrix2 = new int[M][N];

        // Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix2[j][i] = matrix2[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Matrix N x M:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(transposedMatrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}