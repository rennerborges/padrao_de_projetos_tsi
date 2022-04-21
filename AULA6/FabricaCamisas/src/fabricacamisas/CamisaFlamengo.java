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
public class CamisaFlamengo extends Camisa{

    public CamisaFlamengo() {
        this.marca = "Adidas";
        
        ArrayList<String> tamanhos = new ArrayList<>();
        
        tamanhos.add("PP");
        tamanhos.add("P");
        tamanhos.add("M");
        tamanhos.add("G");
        tamanhos.add("GG");
        
        this.tamanhos = tamanhos;
        this.tecido = "Cetim";
        this.time = "Flamengo";
        this.nome = "Camisa goleiro";
        this.preco = 299.99;

        System.out.println("\nA maior nação do mundo!");
        System.out.println("--------------------------");

        super.print();
    }
    
}
