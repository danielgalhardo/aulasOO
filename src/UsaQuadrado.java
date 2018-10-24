/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author econs
 */
public class UsaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Quadrado q2 = new Quadrado(6.3);

        System.out.println("Area: " + q1.calcularArea());
        System.out.println("Perimetro " + q1.perimetro());

        System.out.println("Area: " + q2.calcularArea());
        System.out.println("Perimetro " + q2.perimetro());
    }

}
