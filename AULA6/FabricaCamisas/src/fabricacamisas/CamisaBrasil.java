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
public class CamisaBrasil extends Camisa{

    public CamisaBrasil(    ) {
        this.marca = "Nike";
        
        ArrayList<String> tamanhos = new ArrayList<>();
        
        tamanhos.add("M");
        tamanhos.add("G");

        
        this.tamanhos = tamanhos;
        this.tecido = "Algodão";
        this.time = "Brasil";
        this.nome = "Camisa 1";
        this.preco = 320;
        
        System.out.println("\nVai Brasilllll!");
        System.out.println("--------------------------");
        super.print();
    }
    
}
