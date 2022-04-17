/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_carros;

/**
 *
 * @author renner
 */
public class Etios implements ICarroFlex{
    @Override
    public void exibirInfoCarroFlex(){
        System.out.println("Modelo: Etios\n Marca: Toyota\n Categoria: Flex");
    }
}
