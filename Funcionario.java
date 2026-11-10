package com.mycompany.funcionario;

public abstract class Funcionario {
    private String nome;
    private static int totalFuncionarios;
    public Funcionario(String nome){
        this.nome = nome;
        this.totalFuncionarios += 1;
    }
    
    public abstract double calcularSalario();
    public static int funcionariosRegistrados(){
        return totalFuncionarios;
    }
    public String getNome(){
        return this.nome;
    }
}
