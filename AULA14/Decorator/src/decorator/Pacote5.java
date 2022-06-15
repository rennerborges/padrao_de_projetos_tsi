/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class Pacote5 extends AssinaturaDecorator {
    static final String DESCRICAO = "Compra com Cash Back R$ 19,99";
    
    public Pacote5(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public void montar() {
        super.montar();
        System.out.println(DESCRICAO);
    }

}
