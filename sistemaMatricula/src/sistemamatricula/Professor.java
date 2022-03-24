/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatricula;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author renner
 */
public class Professor extends Pessoa {
    private String especializacao;

    public Professor(String especializacao, String nome, String sobrenome, Date dataNacimento, String cpf) {
        super(nome, sobrenome, dataNacimento, cpf);
        this.especializacao = especializacao;
    }

    @Override
    public void acao(){
        System.out.println("Ministrar aula!");
    }
    
    
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.especializacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        return Objects.equals(this.especializacao, other.especializacao);
    }

    @Override
    public String toString() {
        return "Professor{" + "especializacao=" + especializacao + '}';
    }
    
}
