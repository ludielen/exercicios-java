package br.com.ludielen;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        String operador;

        System.out.println("Digite um valor:");
        primeiroNumero = scan.nextInt();

        System.out.println("digite um operador + para somar, - para subtrair, * para multiplicar ou / para dividir.");
        operador = scan.next();

        System.out.println("Digite segundo valor:");
        segundoNumero = scan.nextInt();

        if (operador.equals("/") && segundoNumero == 0) {
            System.out.println(" o numero nao pode ser dividido por 0");
        } else if (operador.equals("+")) {
            System.out.println("a soma e: " + (primeiroNumero + segundoNumero));
        } else if (operador.equals("-")) {
            System.out.println("A subtraçao e: " + (primeiroNumero - segundoNumero));
        } else if (operador.equals("*")) {
            System.out.println("A multiplicaçao e :" + (primeiroNumero * segundoNumero));
        } else if (operador.equals("/")) {
            System.out.println("A divisao e: " + (primeiroNumero / segundoNumero));
        } else {
            System.out.println("operador nao reconhecido");
        }
    }
}
