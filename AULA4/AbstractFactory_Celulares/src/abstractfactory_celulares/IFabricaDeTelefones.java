/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory_celulares;

/**
 *
 * @author renner
 */
public interface IFabricaDeTelefones {
    ITelefoneIntermediario criarTelefoneIntermediario();
    
    ITelefoneTop criarTelefoneTop();
}
