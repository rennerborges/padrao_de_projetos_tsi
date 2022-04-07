/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse;

import java.util.Objects;

/**
 *
 * @author renner
 */
public class Matricula extends RegrasInstituicao{
    private Aluno aluno;
    private String numero;

    public Matricula(Aluno aluno, String numero) {
        this.aluno = aluno;
        this.numero = numero;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String print(){
        return this.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.aluno);
        hash = 59 * hash + Objects.hashCode(this.numero);
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
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Matricula{" + "aluno=" + aluno + ", numero=" + numero + '}';
    }
    
    
}
