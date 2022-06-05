/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixasecreta;

import static java.lang.Float.max;
import static java.lang.Float.min;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author renner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ProductComponent> produtos = new ArrayList<>();

        ProductLeaf quadrinhos = new ProductLeaf("Quadrinhos", 15);
        produtos.add(quadrinhos);

        ProductLeaf chaveiros = new ProductLeaf("Chaveiros", 5);
        produtos.add(chaveiros);

        ProductLeaf bustos = new ProductLeaf("Bustos", 10);
        produtos.add(bustos);

        ProductLeaf adesivos = new ProductLeaf("Adesivos", 1);
        produtos.add(adesivos);

        ProductLeaf posters = new ProductLeaf("Posters", 25);
        produtos.add(posters);

        ProductLeaf camisetas = new ProductLeaf("Camisetas", 25);
        produtos.add(camisetas);

        ProductLeaf canetas = new ProductLeaf("Canetas", 3);
        produtos.add(canetas);

        ProductLeaf miniaturas = new ProductLeaf("Miniaturas", 20);
        produtos.add(miniaturas);

        int qtdItens;

        String typeUser = JOptionPane.showInputDialog("O tipo de usuário: 1 - Bronze, 2 - Prata, 3 - Ouro e 4 - Platina");

        switch (typeUser) {
            case "1":
                qtdItens = 3;
                break;
            case "2":
                qtdItens = 5;
                break;
            case "3":
                qtdItens = 7;
                break;
            case "4":
                qtdItens = 10;
                break;
            default:
                throw new AssertionError();
        }

        ProductComposit caixa = new ProductComposit();

        Random rand = new Random();

        int maxRandom = produtos.size() -1;

        for (int i = 0; i < qtdItens; i++) {
            int randomNum = rand.nextInt((maxRandom - 0) + 1) + 0;
            caixa.add(produtos.get(randomNum));
        }
        
        System.out.println("\nValor final caixa: R$ "+ caixa.getPreco());

    }

}
