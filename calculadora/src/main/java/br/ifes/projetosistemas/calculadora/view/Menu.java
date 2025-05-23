package br.ifes.projetosistemas.calculadora.view;

import br.ifes.projetosistemas.calculadora.controller.ControladorCalculadora;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public void mostrarMenu() {
        int op;
        do {
            System.out.println("********Menu********");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("0. Sair");
            System.out.println("*********************");
            System.out.print("Escolha uma opção: ");

            ControladorCalculadora calculadora = new ControladorCalculadora();

            double resultado, num1, num2;
            Scanner sc = new Scanner(System.in);
            op = sc.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.print("Digite o valor 1: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o valor 2: ");
                num2 = sc.nextDouble();

                switch (op) {
                    case 1:
                        resultado = calculadora.soma(num1, num2);
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;
                    case 2:
                        resultado = calculadora.subtracao(num1, num2);
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;
                    case 3:
                        resultado = calculadora.multiplicacao(num1, num2);
                        System.out.printf("Resultado: %.2f%n", resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = calculadora.divisao(num1, num2);
                            System.out.printf("Resultado: %.2f%n", resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;
                }
                System.out.println();
            } else if (op != 0) {
                System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (op != 0);
    }
}
