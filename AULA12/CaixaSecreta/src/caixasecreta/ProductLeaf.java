/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixasecreta;

/**
 *
 * @author renner
 */
public class ProductLeaf extends ProductComponent {

    public ProductLeaf(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return (this.preco);
    }

    @Override
    public void add(ProductComponent produto) {
        System.out.println("Essa classe não deveria fazer esse método");
        System.out.println("Isso quebra o princípio da responsabilidade");
    }

    @Override
    public void remove(ProductComponent produto) {
        System.out.println("Essa classe não deveria fazer esse método");
        System.out.println("Isso quebra o princípio da responsabilidade");
    }
    
    

}
