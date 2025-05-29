package testeia;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private String sexo;
    private String bairro;
    private List<String> cursos;

    public Pessoa(String nome, int idade, double salario, String sexo, String bairro, List<String> cursos) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.bairro = bairro;
        this.cursos = cursos;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getSexo() {
        return sexo;
    }

    public String getBairro() {
        return bairro;
    }

    public List<String> getCursos() {
        return cursos;
    }
}
