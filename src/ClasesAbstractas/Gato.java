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
public class Gato extends Animal{

    public Gato(String nombre, String raza) {
        super(nombre, raza);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miauu...");
    }
    
}
