/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author renner
 */
public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataNacimento;
    private String cpf;

    public Pessoa(String nome, String sobrenome, Date dataNacimento, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNacimento = dataNacimento;
        this.cpf = cpf;
    }

    public abstract void acao();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", dataNacimento=" + dataNacimento + ", cpf=" + cpf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.sobrenome);
        hash = 37 * hash + Objects.hashCode(this.dataNacimento);
        hash = 37 * hash + Objects.hashCode(this.cpf);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
        }
        if (!Objects.equals(this.dataNacimento, other.dataNacimento)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
}
