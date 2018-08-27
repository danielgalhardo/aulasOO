/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia27;

/**
 *
 * @author ice
 */
public class Cachorro {
                     private  String nome;
                     private  int idade;
                     private  String raça;
                     public static  int quantidadeCachorro = 0;

    public Cachorro(String nome, int idade, String raça) {
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
        quantidadeCachorro++;
    }
        public    void impriminome()
             {
                 System.out.println(" " +nome);
             }
        public    Cachorro venderCachorro()
             {
                 quantidadeCachorro--;
                 return null;
             }
                       
}
