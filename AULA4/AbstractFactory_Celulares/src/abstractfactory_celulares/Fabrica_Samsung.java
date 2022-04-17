/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_celulares;

/**
 *
 * @author renner
 */
public class Fabrica_Samsung implements IFabricaDeTelefones{
    @Override
    public ITelefoneIntermediario criarTelefoneIntermediario(){
        return new A52();
    }
    
    @Override
    public ITelefoneTop criarTelefoneTop(){
        return new S22();
    }
}
