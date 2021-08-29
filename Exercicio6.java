package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio;
        double area;

        System.out.println(" Digite o raio de um circulo:");
        raio = scan.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));

        System.out.println(" resultado " + area + " metros");
    }

}