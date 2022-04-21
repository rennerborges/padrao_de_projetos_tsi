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
public abstract class Camisa {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public String marca;
    public ArrayList<String> tamanhos;
    public String tecido;
    public String time;
    public String nome;
    public double preco;
    
    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Time: " + time);
        System.out.println("Marca: " + marca);
        System.out.println("Tamanhos: " + tamanhos);
        System.out.println("Tecido: " + tecido);
        System.out.println("Preço: " + ANSI_GREEN + "R$: " + preco + ANSI_RESET);

    }
 
    
}
