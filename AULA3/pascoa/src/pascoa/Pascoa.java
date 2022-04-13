/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pascoa;

import fabricas.Garoto;
import fabricas.IFabricaOvosPascoa;
import fabricas.Lacta;
import fabricas.Nestle;
import java.util.Scanner;
import produtos.OvoPascoa;

/**
 *
 * @author renner
 */
public class Pascoa {

    /**
     * @param args the command line arguments
     */
    
//    Nestle: 1) Alpino 337g 2) Classic 185g 3) Kit Kat 227g
//
//    Garoto: 1) Crocante 215g 2) Talento 350g 3) Baton ao leite 172g
//
//    Lacta: 1) A leite 170g 2) Oreo 257g 3) Sonho de Valsa 277g
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Informe o nome da empresa:");

        Scanner scan = new Scanner(System.in);
        String empresa = scan.nextLine().toLowerCase();

        IFabricaOvosPascoa fabrica;
        
        switch (empresa) {
            case "nestle":
                fabrica = new Nestle();
                break;
            case "lacta":
                fabrica = new Lacta();
                break;
            case "garoto":
                fabrica = new Garoto();
                break;
            default:
                throw new RuntimeException("Informe uma empresa válida");
        }
        
        System.out.println("Informe o código do ovo:");
        String codigoOvo = scan.nextLine().toUpperCase();
        
        OvoPascoa ovo = fabrica.criarOvo(codigoOvo);
        ovo.getInfo();
        
    }
    
}
