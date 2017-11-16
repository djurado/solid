/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.mal;

/**
 *
 * @author Palacios
 */
public class ManejadorAtaque {
    private final Pokemon pokemon;

    public ManejadorAtaque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void manejarAtaque(final Ataque ataque){
        switch(ataque){
            case ATAQUE_AGUA:
                this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.70);
            case ATAQUE_FUEGO:
                this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.50);
            case ATAQUE_AIRE:
                this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.80);
            case ATAQUE_PLANTA:
                this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.60);
               
            /*Cuando queremos agregar otro ataque (ej: ATAQUE_ROCA), tenemos que cambiar dos clases
              ManejadorAtaque y Ataque y esto viola el Principio Open Close
            */
        }
    }
}
