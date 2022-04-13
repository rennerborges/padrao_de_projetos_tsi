/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import produtos.Alpino;
import produtos.Classic;
import produtos.KitKat;
import produtos.OvoPascoa;

/**
 *
 * @author renner
 */
public class Nestle implements IFabricaOvosPascoa{

    @Override
    public OvoPascoa criarOvo(String cod){
        switch (cod) {
            case Alpino.COD:
                return new Alpino();
            case Classic.COD:
                return new Classic();
            case KitKat.COD:
                return new KitKat();
            default:
                throw new RuntimeException("Nenhum ovo da Nestle encontrado com o código: " + cod);
        }
    }
}
