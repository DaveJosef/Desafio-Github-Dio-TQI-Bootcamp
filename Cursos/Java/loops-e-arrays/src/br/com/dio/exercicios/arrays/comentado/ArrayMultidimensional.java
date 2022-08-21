package br.com.dio.exercicios.arrays.comentado;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/
public class ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; // declaração de uma matriz multidimensional

        int menor = Integer.MAX_VALUE; // guardar o menor valor
        int linha = 0, coluna = 0; // linha e coluna do menor valor

        // navegando matriz
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9); // atribuindo número aleatório a elemento

                if (M[i][j] < menor) { // se o  elemento é menor que o menor atual
                    menor = M[i][j]; // menor atual passa a ser este valor
                    linha = i; // linha será atribuída
                    coluna = j; // coluna será atribuída
                }
            }
        }
        System.out.println("Menor: " + menor); // imprimindo
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

        System.out.println("\nMatriz"); // imprimindo cada elemento da matriz
        for (int[] linhaM :
                M) {
            for (int colunaM :
                    linhaM) {
                System.out.print(colunaM + " ");
            }
            System.out.println();
        }
    }
}
