/*
 * Projeto: Calculadora feita em Java.
 * Aluno: João Pedro Blagitz Ravache.
 * Professor: Edson Murakami.
 * Curso: Engenharia de Controle e Automação - 3º Semestre.
 */

//Bibliotecas para o funcionamento do programa.
import java.lang.*;
import java.util.Scanner;

public class Calculadora{

    //Função principal do programa.
    public static void main(String[] args){

        double num1, num2;

        //Pega informações do usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");

        //Armazena valor informado para o número.
        num1 = sc.nextDouble();

        System.out.println("Informe o segundo50 numero");
        num2 = sc.nextDouble();

        System.out.println("Informe a operação desejada: +, -, x, /, encerrar");

        //Função que realiza operações matemáticas.

        char operacoes = sc.next().charAt(0);
        double resultado = 0;

        try {
            switch (operacoes) {
                case '+':
                    resultado = Operações.adicao(num1, num2);
                    break;
                case '-':
                    resultado = Operações.subtracao(num1, num2);
                    break;
                case 'x':
                    resultado = Operações.multiplicacao(num1, num2);
                    break;
                case '/':
                    resultado = Operações.divisao(num1, num2);
                    break;
                case 'e':
                    System.out.println("Encerrando...");
                    sc.close();
                    return;
                default:
                    System.out.println("Operação inválida!");
                    sc.close();
                    return;
            }
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}