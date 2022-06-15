/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class Pacote4 extends AssinaturaDecorator {
    static final String DESCRICAO = "Cartão de crédito Platinum R$49,99";
    
    public Pacote4(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(DESCRICAO);
    }

}
