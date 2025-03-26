package br.ifes.projetosistemas.calculadora.view;

import java.util.Scanner;

public class Menu {
    public void show(){
    System.out.println("********Menu********");
    System.out.println("1. Soma");
    System.out.println("2. Subtracao");
    System.out.println("3. Multiplicacao");
    System.out.println("4. Divisao");
    System.out.println("*********************");

    Scanner sc = new Scanner(System.in);
    int op = sc.nextInt();
    System.out.println("Digite o valor 1: ");
    double num1 = sc.nextDouble();
    System.out.println("Digite o valor 2: ");
    double num2 = sc.nextDouble();

    System.out.println("Resultado: " + resultado);
    }
}
