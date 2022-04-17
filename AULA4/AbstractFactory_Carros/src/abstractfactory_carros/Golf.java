/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_carros;

/**
 *
 * @author renner
 */
public class Golf implements ICarroHibrid{
    @Override
    public void exibirInfoCarroHibrid(){
        System.out.println("Modelo: Golf\n Marca: Volkswagen\n Categoria: Hibrido");
    }
}
