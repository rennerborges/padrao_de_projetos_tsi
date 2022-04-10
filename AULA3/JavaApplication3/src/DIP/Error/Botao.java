/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.Error;

/**
 *
 * @author renner
 */
public class Botao {
    private Lampada lampada;
    
    public void Acionar(){
        if(lampada.getStatus().equals(Lampada.DESLIGADA)){
            lampada.ligar();
        }
    }
}
