package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double metros;

        System.out.println("Digite quantos metros voce quer converter:");
        metros = scan.nextDouble();

        System.out.println(" resultado " + metros * 100 + " centimetros");
    }
}
