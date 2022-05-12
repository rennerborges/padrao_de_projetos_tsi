/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automeveisbuild;

/**
 *
 * @author renner
 */
public class BuilderCarroPersonalizado implements IBuilderProtocolo{
     public Veiculo veiculo = new Veiculo();
     
    @Override
    public Veiculo configuracao(String roda, String numeroPortas, String volumeMotor, String tipoCombustivel){
        Componente tamanhoRoda;
        Componente portas;
        Componente motor;
        Componente combustivel;
        
         switch (roda) {
             case "1":
                 tamanhoRoda = new Roda13("Roda 13 da Goodware", 3500);
                 break;
             case "2":
                 tamanhoRoda = new Roda14("Roda 14 da Goodware", 5000);
                 break;
             case "3":
                 tamanhoRoda = new Roda15("Roda 15 da Goodware", 6500);
                 break;
             default:
                 throw new RuntimeException("Essa opção de roda não existe");
         }
        
         switch (numeroPortas) {
             case "1":
                 portas = new Portas3("Duas portas com acabamento de plastico", 6000);
                 break;
             case "2":
                 portas = new Portas5("Quatro portas com acabamento de couro", 15000);
                 break;
             default:
                 throw new RuntimeException("Essa opção de portas não existe");
         }
         
         switch (volumeMotor) {
             case "1":
                 motor = new Motor1000("Motor 1000m³ da Volksvagem", 18000);
                 break;
             case "2":
                 motor = new Motor1600("Motor 1600m³ da Chevrolet", 18000);
                 break;
             case "3":
                 motor = new Motor2000("Motor 2000m³ da Audi", 25000);
                 break;
             default:
                 throw new RuntimeException("Essa opção de motor não existe");
         }
         
         
         switch (tipoCombustivel) {
             case "1":
                 combustivel = new CombustivelGasolina("Central de combustível que aceita gasolina", 4000);
                 break;
             case "2":
                 combustivel = new CombustivelFlex("Central de combustível que aceita gasolina e etanol", 9000);
                 break;
             default:
                 throw new RuntimeException("Essa opção de combustivel não existe");
         }
         
         
        this.veiculo.adicionaComponente(tamanhoRoda);
        this.veiculo.adicionaComponente(portas);
        this.veiculo.adicionaComponente(motor);
        this.veiculo.adicionaComponente(combustivel);

        
        return(this.veiculo);
    }
}
