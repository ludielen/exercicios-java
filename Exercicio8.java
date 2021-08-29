package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ganhosPorHora;
        double horasTrabalhadas;
        double salario;

        System.out.println(" Quanto voce ganha por hora:");
        ganhosPorHora = scan.nextDouble();

        System.out.println(" Numeros de horas trabalhadas no mes:");
        horasTrabalhadas = scan.nextDouble();

        salario = ganhosPorHora * horasTrabalhadas;

        System.out.println(" Total do seu salario é R$ " + salario);
    }
}
