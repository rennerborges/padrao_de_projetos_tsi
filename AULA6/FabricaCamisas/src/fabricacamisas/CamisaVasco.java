/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricacamisas;

import java.util.ArrayList;

/**
 *
 * @author renner
 */
public class CamisaVasco extends Camisa{

    public CamisaVasco() {
         this.marca = "Kappa";
        
        ArrayList<String> tamanhos = new ArrayList<>();
        
        tamanhos.add("PP");
        tamanhos.add("P");
        tamanhos.add("M");
        
        this.tamanhos = tamanhos;
        this.tecido = "Malha";
        this.time = "Vasco";
        this.nome = "Camisa 1";
        this.preco = 55;
        
        System.out.println("\nVamos todos cantar de coração\n"
                + "A Cruz de Malta é o meu pendão... ");
        System.out.println("--------------------------");
        super.print();
    }
    
}
