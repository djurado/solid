/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.mal;

/**
 *
 * @author Palacios
 */
public class Programador {
    
    private ComputadoraWindows computadora;
    
    /*
        Se está limitando a que el programador solo pueda utilziar 
        una computadora Windows, el programador debe tener total independencia
        para elegir su computadora
    */
    public Programador() {
        this.computadora = new ComputadoraWindows();
    }

    public ComputadoraWindows getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraWindows computadora) {
        this.computadora = computadora;
    }

    
    
    
    
}
