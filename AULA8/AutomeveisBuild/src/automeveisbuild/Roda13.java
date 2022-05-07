/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class Roda13 extends Componente implements IProtocolo {
    
    public Roda13(String tipo, double price){
        this.marca = tipo;
        this.preco = price;
    }
    
    @Override
    public double getPrice(){
        return(this.preco);
    }
}
