package com.mycompany.funcionario;

public class Pj extends Funcionario{
    public Pj(String nome){
        super(nome);
    }
    
    @Override
    public double calcularSalario(){
        return 2000.00;
    }
}
