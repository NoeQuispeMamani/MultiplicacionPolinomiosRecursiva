/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicaciondepolinomiosrecursivos;

/**
 *
 * @author hello
 */
public class MultiplicaciondePolinomiosRecursivos {

     public static int[] multiplicar(int[] A, int[] B) {
        int[] resultado = new int[A.length + B.length - 1];
        multiplicarRecursivo(A, B, resultado, 0, 0);
        return resultado;
    }

    private static void multiplicarRecursivo(int[] A, int[] B, int[] resultado, int i, int j) {
        if (i >= A.length) return;
        if (j >= B.length) {
            multiplicarRecursivo(A, B, resultado, i + 1, 0);
            return;
        }
        resultado[i + j] += A[i] * B[j];
        multiplicarRecursivo(A, B, resultado, i, j + 1);
    }

    public static void imprimirPolinomio(int[] poly) {
        for (int i = 0; i < poly.length; i++) {
            System.out.print(poly[i] + (i > 0 ? "x^" + i : ""));
            if (i < poly.length - 1) System.out.print(" + ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 5}; // 3 + 2x + 5x^2
        int[] B = {4, 1};    // 4 + x

        int[] resultado = multiplicar(A, B);

        System.out.print("Resultado: ");
        imprimirPolinomio(resultado);
    }
}
