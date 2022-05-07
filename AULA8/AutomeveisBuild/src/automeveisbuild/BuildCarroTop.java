/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class BuildCarroTop implements IBuilderProtocolo{
     public Veiculo veiculo = new Veiculo();
     
     @Override
    public Veiculo configuracao(String roda, String numeroPortas, String volumeMotor, String tipoCombustivel){
        Componente tamanhoRoda = new Roda15("Roda 15 da Goodware", 6000);
        this.veiculo.adicionaComponente(tamanhoRoda);
        
        Componente portas = new Portas5("Quatro portas com acabamento de couro", 15000);
        this.veiculo.adicionaComponente(portas);
        
        Componente motor = new Motor2000("Motor 2000m³ da Audi", 25000);
        this.veiculo.adicionaComponente(motor);
        
        Componente combustivel = new CombustivelFlex("Central de combustível que aceita gasolina e etanol", 9000);
        this.veiculo.adicionaComponente(combustivel);

        
        return(this.veiculo);
    }
}
