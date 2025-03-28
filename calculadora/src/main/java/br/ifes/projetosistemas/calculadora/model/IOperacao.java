package br.ifes.projetosistemas.calculadora.model;

public interface IOperacao {
    public double  calcular(double num1, double num2);
    public  double calcular(double [] numeros);
}
