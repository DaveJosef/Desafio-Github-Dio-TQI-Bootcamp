package br.com.dio.exercicios.arrays.comentado;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero; // atribua valor aleatório ao elemento de posição i do array
        }

        System.out.println("Numeros: ");
        for (int numero :
                numeros) { // iterando
            System.out.print(
                    numero + " " // imprimindo o número
            );
        }

        System.out.println("\n--------------");

        System.out.println("Sucessores: ");
        for (int numero :
                numeros) { // iterando e adicionando 1 a cada elemento de numeros
            System.out.print((numero + 1) + " ");
        }
    }
}
