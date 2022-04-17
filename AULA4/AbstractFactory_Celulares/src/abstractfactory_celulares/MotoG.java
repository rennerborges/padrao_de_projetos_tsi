/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_celulares;

/**
 *
 * @author renner
 */
public class MotoG implements ITelefoneIntermediario{
    @Override
    public void exibirInfoTelefoneIntermediario(){
        System.out.println("Modelo: Moto G\n Fabrica: Motorola\n Categoria: Intermediario");
    }
}
