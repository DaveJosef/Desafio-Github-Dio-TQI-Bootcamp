package br.com.dio.collection.list;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        // Adicionando temperaturas à lista:
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Informe a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;

        }
        System.out.println("----------------");

        // Exibindo a lista de temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        // Calculando e exibindo a média:
        double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        // Exibindo as temperaturas acima da média:
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

        // Exibindo por extenso o mês correspondente às temperaturas acima da média:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case 0:
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case 1:
                        System.out.printf("2 - fevereiro: %.1f\n ", temp);
                        break;
                    case 2:
                        System.out.printf("3 - março: %.1f\n ", temp);
                        break;
                    case 3:
                        System.out.printf("4 - abril: %.1f\n ", temp);
                        break;
                    case 4:
                        System.out.printf("5 - maio: %.1f\n ", temp);
                        break;
                    case 5:
                        System.out.printf("6 - junho: %.1f\n ", temp);
                        break;
                    default:
                        System.out.printf("Não houve temperatura acima da média.");
                }
            }
            count++;
        }

    }
}

//public class ExercicioProposto01 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        List<Double> temperaturas = new ArrayList<Double>();
//
//        // Adicionando temperaturas à lista:
//        double soma = 0.0;
//        for (int i = 1; i <= 6; i++) {
//            System.out.print("Informe a temperatura: ");
//            double temp = scan.nextDouble();
//            temperaturas.add(temp);
//            soma += temp;
//        }
//
//        System.out.println("----------------");
//
//        // Exibindo a lista de temperaturas:
//        System.out.print("Todas as temperaturas: " + temperaturas);
//
//        // Calculando e exibindo a média:
//        double media = soma / temperaturas.size();
//        System.out.printf("\nMédia das temperaturas: %.1foC\n", media);
//
//        // Exibindo por extenso o mês correspondente às temperaturas acima da média:
//        System.out.println("\n\nMeses das temperaturas acima da média: ");
//
//        for (Double temp :
//                temperaturas) {
//            if (temp > media) {
//                int index = temperaturas.indexOf(temp);
//                switch (index) {
//                    case 0:
//                        System.out.printf("1 - JANEIRO: %.1f\n ", temp);
//                        break;
//                    case 1:
//                        System.out.printf("2 - FEVEREIRO: %.1f\n ", temp);
//                        break;
//                    case 2:
//                        System.out.printf("3 - MARÇO: %.1f\n ", temp);
//                        break;
//                    case 3:
//                        System.out.printf("4 - ABRIL: %.1f\n ", temp);
//                        break;
//                    case 4:
//                        System.out.printf("5 - MAIO: %.1f\n ", temp);
//                        break;
//                    case 5:
//                        System.out.printf("6 - JUNHO: %.1f\n ", temp);
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
//
//
//    }
//}
