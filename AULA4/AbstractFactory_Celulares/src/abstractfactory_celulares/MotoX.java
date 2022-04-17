/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_celulares;

/**
 *
 * @author renner
 */
public class MotoX implements ITelefoneTop{
    @Override
    public void exibirInfoTelefoneTop(){
        System.out.println("Modelo: Moto X\n Fabrica: Motorola\n Categoria: Top de linha");
    }
}
