/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_carros;

/**
 *
 * @author renner
 */
public class FabricaToyota implements IFabricaDeCarros{
    @Override
    public ICarroFlex criarCarroFlex(){
        return new Etios();
    }
    
    @Override
    public ICarroHibrid criarCarroHibrid(){
        return new Corolla();
    }
}
