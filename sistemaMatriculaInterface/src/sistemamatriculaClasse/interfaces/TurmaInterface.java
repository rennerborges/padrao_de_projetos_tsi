/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse.interfaces;

import java.util.ArrayList;
import java.util.Date;
import sistemamatriculaClasse.Aluno;
import sistemamatriculaClasse.Disciplina;

/**
 *
 * @author renner
 */
public interface TurmaInterface{
    public Aluno getAluno(String cpf);
    
    public Disciplina getDisciplina(String nome);

    public ArrayList<Aluno> getAlunos();

    public void addAlunos(Aluno aluno);

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
