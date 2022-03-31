/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse.interfaces;

import java.util.ArrayList;
import java.util.Date;
import sistemamatriculaClasse.Aluno;
import sistemamatriculaClasse.Disciplina;
import sistemamatriculaClasse.Matricula;

/**
 *
 * @author renner
 */
public interface TurmaInterface{
    
    public Disciplina getDisciplina(String nome);

    public ArrayList<Matricula> getMatriculas();

    public void addMatricula(Matricula matricula);

    public ArrayList<Disciplina> getDisciplinas();

    public void addDisciplinas(Disciplina disciplina);

    public String getNome();

    public void setNome(String nome);

    public String getPeriodo();

    public void setPeriodo(String periodo);

    public Date getDataInicio();

    public void setDataInicio(Date dataInicio);

    public String print();
}
