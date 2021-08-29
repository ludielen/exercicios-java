package br.com.ludielen.exercicioaula11a13;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        boolean aprovado = false;

        System.out.println(" Digite a primeira nota do aluno:");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota do aluno:");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        String mensagem = "A media do aluno é: " + media;

        if (media >= 6.0) {
            aprovado = true;
        }

        if (aprovado) {
            System.out.println(" O aluno esta aprovado e " + mensagem);
        } else {
            System.out.println(" aluno reprovado, " + mensagem);
        }
    }
}
