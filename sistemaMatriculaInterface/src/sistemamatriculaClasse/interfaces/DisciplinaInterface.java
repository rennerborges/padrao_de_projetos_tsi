/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse.interfaces;

import sistemamatriculaClasse.Professor;

/**
 *
 * @author renner
 */
public interface DisciplinaInterface {
    public Professor getProfessor();
            
    public void setProfessor(Professor professor);

    public String getNome();

    public void setNome(String nome);
    
    public String print();
}
