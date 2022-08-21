package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = scan.nextInt();

        int quantPar = 0, quantImpar = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            int numero = scan.nextInt(); // informe numero

            if (numero % 2 == 0) quantPar++; // conte par ou ímpar
            else quantImpar++;

            count++;
        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade números pares: " + quantPar + " / Quantidade números ímpares: " + quantImpar); // imprimindo quantidade de pares e de ímpares
    }
}
