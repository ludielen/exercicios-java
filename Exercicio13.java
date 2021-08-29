package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        1 - descobrir quanto o cliente cobra por hora
        2 - descobrir quantas horas por mes ele trabalha
        3 - descobrir o valor total do salario
        4 - desconto 11% imposto renda
        5 - desconto 8% INSS
        6 - desconto 5% para sindicato
        7 - salario liquido.
         */

        Scanner scan = new Scanner(System.in);

        double ganhosPorHora;
        double horasTrabalhadas;
        double salarioBruto;
        double salarioLiquido;
        double impostoRenda = 0.11;
        double inss = 0.08;
        double sindicato = 0.05;
        double totalDescontosEmPorcentagem;

        System.out.println(" Quanto voce ganha por hora:");
        ganhosPorHora = scan.nextDouble();

        System.out.println("Quantas horas por mes voce trabalha:");
        horasTrabalhadas = scan.nextDouble();

        salarioBruto = ganhosPorHora * horasTrabalhadas;

        totalDescontosEmPorcentagem = impostoRenda + inss + sindicato;

        salarioLiquido = salarioBruto - (salarioBruto * totalDescontosEmPorcentagem);

        System.out.println("Seu salario bruto é R$" + salarioBruto);

        System.out.println(" seu imposto de renda é R$" + salarioBruto * impostoRenda);

        System.out.println(" seu INSS é R$" + salarioBruto * inss);
        System.out.println(" seu sindicato é R$" + salarioBruto * sindicato);
        System.out.println(" Salario liquido é R$" + salarioLiquido);
    }
}
