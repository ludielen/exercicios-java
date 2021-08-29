package br.com.ludielen.exercicioaula11a13;


import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tamanhoMB;
        double velocidadeMbps;
        double tamanhoKb;
        double velocidadeKbps;
        double tempoSegundos;

        System.out.println(" Tamanho do arquivo MB:");
        tamanhoMB = scanner.nextDouble();

        System.out.println(" velocidade em Mbps");
        velocidadeMbps = scanner.nextDouble();

        velocidadeKbps = (velocidadeMbps * 1024) / 8;

        tamanhoKb = tamanhoMB * 1024;

        tempoSegundos = tamanhoKb / velocidadeKbps;
        System.out.println(" o tempo de download em minutos é " + tempoSegundos / 60);
    }
}
