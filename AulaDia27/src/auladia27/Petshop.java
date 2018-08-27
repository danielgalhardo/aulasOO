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
public class Petshop {
                Cachorro dog1;
                int num;

                 public Petshop(int n) {
                 num = n;
    }
    
                
                void venda(Cachorro dog)
                {
                    dog1 = null;
                    num--;
                }
                void compra(Cachorro dog)
                {
                    dog1 = dog;
                    num++;
                }
                void imprime()
                {
                    System.out.println("A quantidade de cachorros eh:  " + num);
                }
}
