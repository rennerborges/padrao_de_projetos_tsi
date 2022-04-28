/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violao;

/**
 *
 * @author renner
 */
public class Violao extends ViolaoPrototype{

    protected Violao(ViolaoPrototype violao) {
        this.valor = violao.getValor();
        this.nome = violao.getNome();
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
        this.acordoamento = violao.getAcordoamento();
        this.numeroCordas = violao.getNumeroCordas();
    }

    public Violao(double valor, String nome, String tipo, String descricao, String acordoamento, int numeroCordas) {
        this.valor = valor;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.acordoamento = acordoamento;
        this.numeroCordas = numeroCordas;
    }
    
    @Override
    public void setAllAttributes(double valor, String nome, String tipo, String descricao, String acordoamento, int numeroCordas){
        this.valor = valor;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.acordoamento = acordoamento;
        this.numeroCordas = numeroCordas;
    }
    
    @Override
    public String exibirInfo(){
        return "----- " +nome+ " -----\n"
                + "\nTipo: " + tipo
                + "\nAcordoamento: " + acordoamento
                + "\nN° de cordas: " + numeroCordas
                + "\nDescrição: " + descricao
                + "\n\nPreço: R$" + valor;
    }
    
    @Override
    public ViolaoPrototype clonar(){
        return (new Violao(this));
    };
}
