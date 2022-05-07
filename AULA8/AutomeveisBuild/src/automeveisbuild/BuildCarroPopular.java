/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class BuildCarroPopular implements IBuilderProtocolo {
    public Veiculo veiculo = new Veiculo();
     
    @Override
    public Veiculo configuracao(String roda, String numeroPortas, String volumeMotor, String tipoCombustivel){
        Componente tamanhoRoda = new Roda13("Roda 13 da Goodware", 3000);
        this.veiculo.adicionaComponente(tamanhoRoda);
        
        Componente portas = new Portas3("Duas portas com acabamento de plastico", 6500);
        this.veiculo.adicionaComponente(portas);
        
        Componente motor = new Motor1000("Motor 1000m³ da Volksvagem", 15000);
        this.veiculo.adicionaComponente(motor);
        
        Componente combustivel = new CombustivelGasolina("Central de combustível que aceita gasolina", 4000);
        this.veiculo.adicionaComponente(combustivel);

        
        return(this.veiculo);
    }
}
