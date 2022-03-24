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
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String sobrenome, Date dataNacimento, String cpf, String matricula) {
        super(nome, sobrenome, dataNacimento, cpf);
        this.matricula = matricula;
    }

    @Override
    public void acao(){
        System.out.println("Estudar!");
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.matricula);
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
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + '}';
    }
    
}
