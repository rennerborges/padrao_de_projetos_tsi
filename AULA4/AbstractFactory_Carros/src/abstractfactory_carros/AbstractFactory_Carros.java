/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory_carros;

/**
 *
 * @author renner
 */
public class AbstractFactory_Carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IFabricaDeCarros volksvagem = new FabricaVolksvagen();
        
        ICarroFlex gol = volksvagem.criarCarroFlex();
        
        gol.exibirInfoCarroFlex();
        
        ICarroHibrid golf = volksvagem.criarCarroHibrid();
        
        golf.exibirInfoCarroHibrid();
        
        
        IFabricaDeCarros toyota = new FabricaToyota();
        
        ICarroFlex etios = toyota.criarCarroFlex();
        
        etios.exibirInfoCarroFlex();
        
        ICarroHibrid corolla = toyota.criarCarroHibrid();
        
        corolla.exibirInfoCarroHibrid();
    }
    
}
