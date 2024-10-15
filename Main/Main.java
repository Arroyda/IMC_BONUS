package Main;

import Modelo.Aluno;
import Utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Aluno
        Aluno aluno = new Aluno("João Silva", "12345678901", 70.0, 1.75, 8.5, 80.0);

        // Verificando o CPF
        boolean cpfValido = FuncoesUteis.verificarCpf(aluno.getCpf());
        System.out.println("CPF Válido: " + cpfValido);

        // Calculando o IMC
        double imc = FuncoesUteis.calcularIMC(aluno.getPeso(), aluno.getAltura());
        System.out.printf("IMC: %.2f%n", imc);

        // Avaliando o aluno
        String resultado = FuncoesUteis.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Resultado do aluno: " + resultado);
    }
}
