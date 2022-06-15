/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class Pacote2 extends AssinaturaDecorator {
    static final String DESCRICAO = "Frete Grátis em produtos R$9,99";
    
    public Pacote2(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(DESCRICAO);
    }

}
