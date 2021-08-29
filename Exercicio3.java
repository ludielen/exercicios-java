package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;
        int soma;

        System.out.println("Digite um valor:");
        valor1 = scan.nextInt();

        System.out.println("Digite outro valor:");
        valor2 = scan.nextInt();

        soma = valor1 + valor2;

        System.out.println("A soma é:" + soma);
    }
}
