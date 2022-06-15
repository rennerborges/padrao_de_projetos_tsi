/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class AssinaturaDecorator implements Assinatura {

    public Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void montar() {
        this.assinatura.montar();
    }
}
