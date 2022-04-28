/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package violao;

/**
 *
 * @author renner
 */
public abstract class ViolaoPrototype {
    protected double valor;
    protected String nome;
    protected String tipo;
    protected String descricao;
    protected String acordoamento;
    protected int numeroCordas;

    
    public abstract String exibirInfo();
    
    public abstract ViolaoPrototype clonar();
    
    public abstract void setAllAttributes(double valor, String nome, String tipo, String descricao, String acordoamento, int numeroCordas);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcordoamento() {
        return acordoamento;
    }

    public void setAcordoamento(String acordoamento) {
        this.acordoamento = acordoamento;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public void setNumeroCordas(int numeroCordas) {
        this.numeroCordas = numeroCordas;
    }
    
}
