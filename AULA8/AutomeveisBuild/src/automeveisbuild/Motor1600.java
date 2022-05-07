/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class Motor1600 extends Componente implements IProtocolo {
    
    public Motor1600(String tipo, double price){
        this.marca = tipo;
        this.preco = price;
    }
    
    @Override
    public double getPrice(){
        return(this.preco);
    }
}
