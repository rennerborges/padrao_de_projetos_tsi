/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class Pacote3 extends AssinaturaDecorator {
    static final String DESCRICAO = "Caixa surpresa com produtos relacionados a filmes e séries R$29,99";
    
    public Pacote3(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(DESCRICAO);
    }

}
