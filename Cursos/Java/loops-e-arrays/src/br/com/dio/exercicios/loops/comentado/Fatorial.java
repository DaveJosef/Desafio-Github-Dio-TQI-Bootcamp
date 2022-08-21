package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/
public class Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;
        System.out.print(numero + "!="); // frase para imprimir o fatorial

        for (int i = numero; i > 0; i--) {
            multiplicacao *= i;

            if (i != 1) { // se o i não for 1
                System.out.print(i + "."); // imprima 'i.'
            } else { // caso contrário
                System.out.print(i + "=" + (multiplicacao)); // imprimir 'i='
            }

        }
    }
}
