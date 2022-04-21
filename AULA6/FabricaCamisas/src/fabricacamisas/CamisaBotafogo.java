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
public class CamisaBotafogo extends Camisa{

    public CamisaBotafogo() {
        this.marca = "Puma";
        
        ArrayList<String> tamanhos = new ArrayList<>();
        
        tamanhos.add("PP");
        tamanhos.add("M");
        tamanhos.add("G");

        
        this.tamanhos = tamanhos;
        this.tecido = "Microfibra";
        this.time = "Botafogo";
        this.nome = "Camisa 2";
        this.preco = 158;
        
        
        System.out.println("\nOlha o fogão aí!");
        System.out.println("--------------------------");
        
        super.print();
    }
}
