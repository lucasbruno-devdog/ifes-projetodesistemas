package br.ifes.projetosistemas.calculadora.controller;

import br.ifes.projetosistemas.calculadora.model.Divisao;
import br.ifes.projetosistemas.calculadora.model.Multiplicacao;
import br.ifes.projetosistemas.calculadora.model.Soma;
import br.ifes.projetosistemas.calculadora.model.Subtracao;

public class ControladorCalculadora {

    public double soma(double num1, double num2) {
        Soma soma = new Soma();
        return soma.calcular(num1, num2);
    }
    public double subtracao(double num1, double num2) {
        Subtracao subtracao = new Subtracao();
        return subtracao.calcular(num1, num2);
    }
    public double multiplicacao(double num1, double num2) {
        Multiplicacao multiplicacao = new Multiplicacao();
        return multiplicacao.calcular(num1, num2);
    }
    public double divisao(double num1, double num2) {
        Divisao divisao = new Divisao();
        return divisao.calcular(num1, num2);
    }

    public ControladorCalculadora() {
        
    }
}
