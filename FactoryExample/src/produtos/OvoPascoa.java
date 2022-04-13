/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;

/**
 *
 * @author renner
 */
public class OvoPascoa {
    private String nome;
    private String codigo;
    private String medida;
    private String corChocolate;
    private int peso;
    private double preco;


    public OvoPascoa(String nome, String codigo, String medida, String corChocolate, int peso, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.medida = medida;
        this.corChocolate = corChocolate;
        this.peso = peso;
        this.preco = preco;
    }
    
    
    public void getInfo(){
        System.out.println("---- Descrição do ovo ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("Cor do chocolate: " + this.corChocolate);
        System.out.println("Medida: " + this.getMedida());
        System.out.println("Peso: " + this.peso + this.medida);
        System.out.println("Preço: R$" + this.preco);
    }
    
    private String getMedida(){
        switch (this.medida) {
            case "g":
                return "Gramas";
            case "kg":
                return "Kilogramas";
            default:
                return this.medida;
        }
    }


    
    
    
    
    
}
