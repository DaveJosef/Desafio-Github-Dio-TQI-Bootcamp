package br.com.dio.exercicios.arrays.comentado;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6]; // iniciando um array vazio de 6 posições

        int count = 0;
        int quantidadeDeConsoantes = 0;

        do { // loop do{} while();
            System.out.print("Letra ");
            String letra = scan.next(); // atribuindo letra informada

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) { // se a letra informada não for vogal
                consoantes[count] = letra; // atribuir a consoante a consoantes[count]
                quantidadeDeConsoantes++;
            }
            count++; // acrescente 1 a count
        } while (count < consoantes.length);

        System.out.println("Consoantes: "); // iterar o array de consoantes
        for (String consoante :
                consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " "); // imprimir a consoante
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }
}
