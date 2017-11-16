/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3isp.mal;

import java.util.LinkedList;
import java.util.List;




/**
 *
 * @author Palacios
 */
public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private String habilidad;
    private double porcentajeVida;
    private List<String> movimientos;

    public Pokemon() {
        
    }

    public Pokemon(String nombre, String tipo, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida=100;
        this.movimientos = new LinkedList<>();
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public double getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(double porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    public List<String> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<String> movimientos) {
        this.movimientos = movimientos;
    }

    
    
 
    
    
}
