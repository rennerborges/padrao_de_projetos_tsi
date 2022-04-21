/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricacamisas;

/**
 *
 * @author renner
 */
public class FabricaCamisas implements IFabricaCamisa{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public Camisa getCamisa(String time){
        switch (time) {
            case "brasil":
                return new CamisaBrasil();
            case "flamengo":
                return new CamisaFlamengo();
            case "botafogo":
                return new CamisaBotafogo();
            case "vasco":
                return new CamisaVasco();
            case "fluminense":
                return new CamisaFluminense();
            default:
                System.out.println(ANSI_RED + "\nNenhuma camisa encontrada desse time" + ANSI_RESET);
                return null;
        }
    }
}
