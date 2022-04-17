/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory_celulares;

/**
 *
 * @author renner
 */
public class AbstractFactory_Celulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IFabricaDeTelefones motorola = new Fabrica_Motorola();
        
        ITelefoneIntermediario motoG = motorola.criarTelefoneIntermediario();
        
        motoG.exibirInfoTelefoneIntermediario();
        
        ITelefoneTop motoX = motorola.criarTelefoneTop();
        
        motoX.exibirInfoTelefoneTop();
        
        IFabricaDeTelefones samsung = new Fabrica_Samsung();
        
        ITelefoneIntermediario A52 = samsung.criarTelefoneIntermediario();
        
        A52.exibirInfoTelefoneIntermediario();
        
        ITelefoneTop S22 = samsung.criarTelefoneTop();
        
        S22.exibirInfoTelefoneTop();
    }
    
}
