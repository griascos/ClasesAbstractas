/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAbstractas;

/**
 *
 * @author griascos
 */
public class Main {
    public static void main (String[]args){
        Animal animal = new Perro("Hashi","Border");
        animal.hacerSonido();
        animal.correr();
        
        Gato gato = new Gato("Kyara","Angora");
        gato.hacerSonido();
        gato.correr();
    }
}
