/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISP.Error;

/**
 *
 * @author renner
 */
public class Pinguim {
    public void setLocalizacao(int longitude, int latitude){
        //Faz alguma coisa
    }
    
    // A Interface Aves está forçando a Classe Pinguim a implementar esse método.
    // Isso viola o príncipio ISP
    public void setAltitude(int altitude){
        //Não faz nada...  Pinguins são aves que não voam!
    }
    
    public void renderizar(){
        //Faz alguma coisa
    }
}
