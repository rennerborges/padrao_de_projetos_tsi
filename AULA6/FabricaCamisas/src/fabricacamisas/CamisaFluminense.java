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
public class CamisaFluminense extends Camisa{

    public CamisaFluminense() {
        this.marca = "Umbro";
        
        ArrayList<String> tamanhos = new ArrayList<>();
        
        tamanhos.add("PP");
        
        this.tamanhos = tamanhos;
        this.tecido = "Malha";
        this.time = "Fluminense";
        this.nome = "Camisa de treino";
        this.preco = 99.75;
        
        System.out.println("\nSou Tricolor de coração\n"
                + "Sou do clube tantas vezes campeão...");
        System.out.println("--------------------------");
        super.print();
    }
    
}
