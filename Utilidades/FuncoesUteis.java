package Utilidades;

import java.util.regex.Pattern;

public class FuncoesUteis {

    // Método para verificar se um CPF é válido (exemplo básico)
    public static boolean verificarCpf(String cpf) {
        return Pattern.matches("\\d{11}", cpf); // Verifica se o CPF tem 11 dígitos
    }

    // Método para calcular o IMC (Índice de Massa Corporal)
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura); // Fórmula do IMC
    }

    // Método para avaliar o aluno
    public static String avaliarAluno(double nota, double percentualPresenca) {
        if (nota >= 5 && percentualPresenca >= 75) {
            return "Aprovado"; // Aluno aprovado
        } else {
            return "Reprovado"; // Aluno reprovado
        }
    }
}
