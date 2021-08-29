package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura;
        double pesoIdeal;

        System.out.println("Qual sua altura:");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é:" + pesoIdeal);
    }
}
