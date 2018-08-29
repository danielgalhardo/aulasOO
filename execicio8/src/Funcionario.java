/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Principal
 */
public class Funcionario {
    
             private   int matricula;
             private    String  nome;
             private    int idade;
             private    String cargo;
             private   int salario;
             private static int quantidadeFuncionarios = 0;

    public Funcionario(int matricula, String nome, int salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        quantidadeFuncionarios++;
    }
    public Funcionario()
    {
        
        
        salario = 1500;
        quantidadeFuncionarios++;
         
    }
    
     public Funcionario(String nome, int idade)
    {       
        this.nome = nome;
        this.idade = idade;   
        quantidadeFuncionarios++;        
         }
                
  public int getMatricula()
{
   return matricula;

}
  public String getNome()
  {
      return nome;
  }
  public int getIdade()
  {
      return idade;
  }
  public String getCargo()
  {
      return cargo;
  }
  public int getSalario()
  {
      return salario;
  }
  public void setSalario(int novoSalario)
  {
             
      salario = novoSalario;
               
  }
  public void setNome(String nome)
  {
      this.nome = nome;
  }
  public void setMatricula(int matricula)
  {
      this.matricula = matricula;
  }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }
  public void retornarQuantidade()
  {
      System.out.println("A quantidade de funcionarios eh: " +quantidadeFuncionarios);
  }

}

