package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota de 0 a 10: ");
        int nota = scan.nextInt(); // entrada de um inteiro

        while (nota < 0 | nota > 10) { // enquanto a nota informada for inválida
            System.out.println("Nota inválida!");
            System.out.println("Tente novamente. Nota: ");
            nota = scan.nextInt(); // entrada de um inteiro
        }

        System.out.println("Nota: " + nota); // imprimindo a nota
    }
}
