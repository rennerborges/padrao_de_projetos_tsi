/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacamisas;

import java.util.Scanner;

/**
 *
 * @author renner
 */
public class App {
  
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CIANO = "\u001B[36m";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        IFabricaCamisa fabrica = new FabricaCamisas();
        String time;
        
        while(true){
            System.out.println("\nInforme o time que deseja buscar a camisa:");
            System.out.println(ANSI_CIANO + "Caso queira sair digite end" + ANSI_RESET);
            time = scan.nextLine().toLowerCase();
            
            if(time.equals("end")){
                break;
            }
            
            fabrica.getCamisa(time);
            

        }
        
    }
    
}
