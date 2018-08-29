/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Principal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Funcionario func1 = new Funcionario();
         System.out.println("Nome do funcionario: " +func1.getNome());
         System.out.println("O cargo exercido pelo funcionario eh: " +func1.getCargo());
         System.out.println("A idade do funcionario eh: " +func1.getIdade());
         System.out.println("A matricula do funcionario eh: " +func1.getMatricula());
         System.out.println("O salario do funcionario eh: " +func1.getSalario());
         Funcionario func2 = new Funcionario("Joao", 18);
         System.out.println("Nome do funcionario: " +func2.getNome());
         System.out.println("O cargo exercido pelo funcionario eh: " +func2.getCargo());
         System.out.println("A idade do funcionario eh: " +func2.getIdade());
         System.out.println("A matricula do funcionario eh: " +func2.getMatricula());
         System.out.println("O salario do funcionario eh: " +func2.getSalario());
         Funcionario func3 = new Funcionario(201735022, "Daniel", 1200);
         System.out.println("Nome do funcionario: " +func3.getNome());
         System.out.println("O cargo exercido pelo funcionario eh: " +func3.getCargo());
         System.out.println("A idade do funcionario eh: " +func3.getIdade());
         System.out.println("A matricula do funcionario eh: " +func3.getMatricula());
         System.out.println("O salario do funcionario eh: " +func3.getSalario());
         func1.retornarQuantidade();
    }
    
}
