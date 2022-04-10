/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DIP.Correct;

/**
 *
 * @author renner
 */
public abstract class Botao {
    public static final String LIGADA = "LIGADA";
    public static final String DESLIGADA = "DESLIGADA";
    
    protected String status;
    
    public abstract void ligar();
    public abstract void desligar();
}
