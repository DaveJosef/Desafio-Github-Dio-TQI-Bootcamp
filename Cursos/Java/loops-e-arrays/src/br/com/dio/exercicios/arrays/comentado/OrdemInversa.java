package br.com.dio.exercicios.arrays.comentado;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {

    public static void main(String[] args) {
        int[] vetor = {5, 8, 9, 6, 11, -1}; // inicializando um vetor de cinco posições não vazias

        int count = vetor.length - 1; // contador na última posição
        System.out.print("Vetor inverso: ");
        while (count >= 0) { // iterando de modo reverso
            System.out.print(vetor[count] + " ");
            count--;
        }

        System.out.println("\n---------------");
        for (int elemento :
                vetor) { // iterando
            System.out.print(elemento + " ");
        }
    }
}
