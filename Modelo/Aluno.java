package Modelo;

public class Aluno extends Pessoa {
    private double nota;
    private double percentualPresenca;

    // Construtor
    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura); // Chama o construtor da classe Pai (Pessoa)
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    // Getters
    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }
}
