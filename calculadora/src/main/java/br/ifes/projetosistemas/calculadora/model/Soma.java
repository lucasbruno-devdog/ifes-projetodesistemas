package br.ifes.projetosistemas.calculadora.model;

public class Soma implements IOperacao {
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double calcular(double[] numeros) {
        return 0;
    }
}
