/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

import java.util.ArrayList;

/**
 *
 * @author renner
 */
public class Veiculo extends Componente implements IProtocolo {
    public ArrayList<Componente> componentes = new ArrayList<>();
    
    @Override
    public double getPrice(){
        this.preco = 0;
        
        for(int i = 0; i < componentes.size(); i++){
            this.preco += componentes.get(i).preco;
        }
              
        return(this.preco);
    }
    
    public void adicionaComponente(Componente component){
        componentes.add(component);
    }
    
    public void configuracao_final(){
        componentes.forEach(configuracao -> System.out.println("Item: "+ configuracao.marca +", preço: R$"+configuracao.preco));
    }
}
