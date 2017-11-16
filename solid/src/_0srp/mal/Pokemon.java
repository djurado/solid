/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _0srp.mal;

/**
 *
 * @author Palacios
 */
public  class Pokemon {
    private String nombre;
    private String tipo;
    private String habilidad;
    private int porcentajeVida;

    public Pokemon() {
        
    }

    public Pokemon(String nombre, String tipo, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida=100;
    }
    
    /* Esta no es una responsabilidad de un pokemon*/
    public void curar(){
        this.porcentajeVida=100;
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

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }
    
    
    
    
    
    
    
}
