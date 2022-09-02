package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);

    }

    private static double calculaMediaDaTurma(String[] alunos, Scanner scan) {
        double soma = 0;

        for (String aluno :
                alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scan.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
