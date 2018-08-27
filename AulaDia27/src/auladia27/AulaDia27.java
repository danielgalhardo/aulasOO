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
public class AulaDia27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Joao", 17, "basset");
        Cachorro dog2 = new Cachorro("JoaoMonstrao", 18, "vira-lata");
        Petshop loja = new Petshop(0);
        loja.compra(dog1);
        loja.compra(dog2);
        loja.imprime();
        loja.venda(dog2);
        loja.imprime();
        
        
    }
    
}
