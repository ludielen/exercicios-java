package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;
        double numero3;

        System.out.println(" Digite um numero inteiro:");
        numero1 = scan.nextInt();

        System.out.println(" Digite outro numero inteiro:");
        numero2 = scan.nextInt();

        System.out.println("Digite um numero Real:");
        numero3 = scan.nextDouble();

        int resultado1 = (numero1 * 2) * (numero2 / 2);
        double resultado2 = (numero1 * 3) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.println(" resultado1 : " + resultado1);
        System.out.println(" resultado2 : " + resultado2);
        System.out.println(" resultado3 : " + resultado3);
    }
}
