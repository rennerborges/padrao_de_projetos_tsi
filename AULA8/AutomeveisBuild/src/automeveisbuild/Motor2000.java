/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class Motor2000 extends Componente implements IProtocolo {
    
    public Motor2000(String tipo, double price){
        this.marca = tipo;
        this.preco = price;
    }
    
    @Override
    public double getPrice(){
        return(this.preco);
    }
}
