package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maior = 0; // variáveis
        double soma = 0;
        double media;

        int count = 0;

        do { // loop do{} while();
            System.out.println("Número: ");
            double numero = scan.nextDouble(); // aguardar o usuário informar um número e atribuir a 'numero'

            if (numero > maior) { // caso o valor seja maior que a variável maior
                maior = numero; // atribuir a maior o valor
            }

            soma = soma + numero; // somar soma a numero

            count = count + 1;
        } while (count < 5);

        media = soma / 5; // calcular média

        System.out.println("Maior: " + maior + " - Média: " + media); // imprimindo maior e media
    }
}
