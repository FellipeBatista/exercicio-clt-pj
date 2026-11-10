package com.mycompany.funcionario;
import java.util.ArrayList;

public class Clt extends Funcionario {
    public Clt(String nome){
        super(nome);
    }
    
    @Override
    public double calcularSalario(){
        return 2000.00 - 200.00;
    }
    
    public static void main(String[] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Clt("Marcos"));
        funcionarios.add(new Pj("João"));
        funcionarios.add(new Clt("Jorge"));
        funcionarios.add(new Pj("Matheus"));
        funcionarios.add(new Clt("Maria"));
        
        for(Funcionario f : funcionarios){
            System.out.println("Nome do funcionário é " + f.getNome() + " e seu salário é de R$" + f.calcularSalario());
        }
        int todosOsFuncionarios = Funcionario.funcionariosRegistrados();
        System.out.println("O número total de funcionários atualmente é: " + todosOsFuncionarios);
    }
}
