/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixasecreta;

import java.util.ArrayList;

/**
 *
 * @author renner
 */
public class ProductComposit extends ProductComponent {

    private ArrayList<ProductComponent> produtos = new ArrayList<>();

    @Override
    public float getPreco() {
        float soma = 0;
        for (int i = 0; i < this.produtos.size(); i++) {
            ProductComponent product = this.produtos.get(i);

            System.out.println(product.nome + ": R$ "+ product.preco
            );
            
            soma += product.getPreco();
        }

        return (soma);

    }

    @Override
    public void add(ProductComponent produto) {
        this.produtos.add(produto);

    }

    @Override
    public void remove(ProductComponent produto) {
        int index = this.produtos.indexOf(produto);

        if (index != -1) {
            this.produtos.get(index).remove(produto);
        }

    }

    @Override
    public String toString() {
        return "ProductComposit{" + "produtos=" + produtos + '}';
    }

}
