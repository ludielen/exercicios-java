package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double area;
        double base;
        double altura;

        System.out.println(" Qual a base de um quadrado?");
        base = scan.nextDouble();

        System.out.println(" Qual a altura de um quadrado?");
        altura = scan.nextDouble();

        area = base * altura;

        System.out.println(" A area do quadrado é: " + area);
        System.out.println(" O dobro da area é " + (area * 2) + " metros");
    }
}