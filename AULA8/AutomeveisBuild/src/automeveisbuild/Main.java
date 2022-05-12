/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automeveisbuild;

import javax.swing.JOptionPane;

/**
 *
 * @author renner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String roda = "1";
        String numeroPortas = "1";
        String volumeMotor= "1";
        String tipoCombustivel = "1";
        String tipo = "1";

        Veiculo veiculo = new Veiculo();
        
        tipo = JOptionPane.showInputDialog("Informe o tipo de Veiculo: 1 - Popular, 2 - Top ou 3 - Personalizado");
        
        if(tipo.equals("1")){
            IBuilderProtocolo carro = new BuilderCarroPopular();
            veiculo = carro.configuracao(roda, numeroPortas, volumeMotor, tipoCombustivel);  
        }
               
        if(tipo.equals("2")){
            IBuilderProtocolo carro = new BuilderCarroTop();
            veiculo = carro.configuracao(roda, numeroPortas, volumeMotor, tipoCombustivel);  
        }
        
        if(tipo.equals("3")){
            roda = JOptionPane.showInputDialog("Informe o tipo de roda: 1 - Tamanho 13, 2 - Tamanho 14 ou 3 - Tamanho 15");
            numeroPortas = JOptionPane.showInputDialog("Informe a quantidade de portas: 1 - Três portas ou 2 - Cinco portas");
            volumeMotor = JOptionPane.showInputDialog("Informe o volume m³ do motor: 1 - 1000m³, 2 - 1600m³ ou 3 - 2000m³");
            tipoCombustivel = JOptionPane.showInputDialog("Informe o tipo de combustivel: 1 - Gasolina ou  2 - Flex");
          
            IBuilderProtocolo carro = new BuilderCarroPersonalizado();
            veiculo = carro.configuracao(roda, numeroPortas, volumeMotor, tipoCombustivel);  
        }
        
        
        veiculo.configuracao_final();
        System.out.println("\nO preço da configuração do veiculo é: R$" + veiculo.getPrice());
    }
    
}
