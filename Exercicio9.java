package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temperaturaGrausFarenheit;
        double temperaturaGrausCelsius;

        System.out.println(" Qual a temperatura em graus Farenheit:");
        temperaturaGrausFarenheit = scan.nextDouble();

        temperaturaGrausCelsius = (5 * (temperaturaGrausFarenheit - 32) / 9);

        System.out.println(" A temperatura em graus celsius é " + temperaturaGrausCelsius + " C ");
    }
}
