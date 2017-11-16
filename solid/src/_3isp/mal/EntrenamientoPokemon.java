/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3isp.mal;

/**
 * 
 * @author Palacios
 */

/*
    Esta es una "interfaz gorda" ya que tiene muchas responsabilidades
*/
public interface EntrenamientoPokemon {
    
    void aprenderAtaqueAgua();
    void aprenderAtaqueFuego();
    void aprenderAtaqueCorte();   //todo pokemon tiene esta habilidad
    
    
}
