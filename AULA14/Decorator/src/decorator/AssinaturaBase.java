/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author renner
 */
public class AssinaturaBase implements Assinatura {

    @Override
    public void montar() {
        System.out.println("Assistir vídeos num único dispositivo R$9,99");
    }
}
