/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author econs
 */
public class Quadrado {
        double lado;
        
        public Quadrado(double lado){
            this.lado = lado;
        }
        public double calcularArea(){
            double area = lado * lado;
            return area;
        }
        public double perimetro(){
            double perimetro = lado * 4;
            return perimetro;
        }
}
