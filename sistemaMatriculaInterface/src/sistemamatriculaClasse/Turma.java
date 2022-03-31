/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamatriculaClasse;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import sistemamatriculaClasse.interfaces.TurmaInterface;

/**
 *
 * @author renner
 */
public class Turma implements TurmaInterface {
    private ArrayList<Matricula> matriculas = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private String nome;
    private String periodo;
    private Date dataInicio;
    private Date dataFim;

    public Turma(String nome, String periodo, Date dataInicio, Date dataFim) {
        this.nome = nome;
        this.periodo = periodo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    private Matricula getMatricula(String cpf){
        for(Matricula matricula : this.matriculas){
            if(matricula.getAluno().getCpf().equals(cpf)){ 
                return matricula;
            }
        }
        return null;
    }
    
    @Override
    public Disciplina getDisciplina(String nome){
        for(Disciplina disciplina : this.disciplinas){
            if(disciplina.getNome().equals(nome)){ 
                return disciplina;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Matricula> getMatriculas() {
        return this.matriculas;
    }

    @Override
    public void addMatricula(Matricula matricula) {
        if(getMatricula(matricula.getAluno().getCpf()) != null){
            throw new RuntimeException("O aluno já está nessa turma");
        }
        
        this.matriculas.add(matricula);
    }
    
    public void createMatricula(Aluno aluno, String codigo){
        if(getMatricula(aluno.getCpf()) != null){
            throw new RuntimeException("O aluno já está nessa turma");
        }
        
        Matricula matricula = new Matricula(aluno, codigo);
        
        matriculas.add(matricula);
    }

    @Override
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public void addDisciplinas(Disciplina disciplina) {
        if(getDisciplina(disciplina.getNome()) != null){
            throw new RuntimeException("A disciplina já está nessa turma");
        }
        this.disciplinas.add(disciplina);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getPeriodo() {
        return periodo;
    }

    @Override
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public Date getDataInicio() {
        return dataInicio;
    }

    @Override
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    @Override
    public String print(){
        return this.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.matriculas);
        hash = 47 * hash + Objects.hashCode(this.disciplinas);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.periodo);
        hash = 47 * hash + Objects.hashCode(this.dataInicio);
        hash = 47 * hash + Objects.hashCode(this.dataFim);
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
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.periodo, other.periodo)) {
            return false;
        }
        if (!Objects.equals(this.matriculas, other.matriculas)) {
            return false;
        }
        if (!Objects.equals(this.disciplinas, other.disciplinas)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        return Objects.equals(this.dataFim, other.dataFim);
    }

    @Override
    public String toString() {
        return "Turma{" + "matriculas=" + matriculas + ", disciplinas=" + disciplinas + ", nome=" + nome + ", periodo=" + periodo + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + '}';
    }

    
}
