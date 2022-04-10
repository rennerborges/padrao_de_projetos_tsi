/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.Correct;

/**
 *
 * @author renner
 */
public class Lampada extends Botao {
      
    @Override
    public void ligar(){
        this.status = LIGADA; 
    }
    
    @Override
    public void desligar(){
        this.status = DESLIGADA;
    }
    
}
