package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/
public class NomeEIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next(); // armazene nome

            if (nome.equals("0")) { // caso nome seja 0
                break; // interrompe o programa
            }

            System.out.println("Idade: "); // armazene idade
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " - idade: " + idade); // imprimir nome seguido de idade
        }
    }
}
