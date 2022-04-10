/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIP.Error;

/**
 *
 * @author renner
 */
public class Lampada {
    public static final String LIGADA = "LIGADA";
    public static final String DESLIGADA = "DESLIGADA";
    
    private String status;
    
    public void ligar(){
        this.status = LIGADA; 
    }
    
    public void desligar(){
        this.status = DESLIGADA;
    }
    
    public String getStatus(){
        return this.status;
    }
    
}
