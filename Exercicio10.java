package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double temperaturaGrausCelsius;
        double temperaturaGrausFarenheit;

        System.out.println(" Qual a temperatura em graus Celsius:");
        temperaturaGrausCelsius = scan.nextDouble();

        temperaturaGrausFarenheit = ((temperaturaGrausCelsius * 9 / 5) + 32);

        System.out.println(" A temperatura em graus Farenheit é: " + temperaturaGrausFarenheit);
    }
}
