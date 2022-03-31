/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamatriculaClasse;

import java.util.Date;

/**
 *
 * @author renner
 */
public class SistemaMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Professor profFernando = new Professor("Arduino", "Fernando", "Matos", new Date(), "111.111.111-11");
        Professor profCinara = new Professor("Engenharia de software", "Cinara", "Melo", new Date(), "222.222.222-22");
        Professor profNeco = new Professor("Redes", "Antônio", "Neco", new Date(), "333.333.333-33");

        Aluno renner = new Aluno("Renner", "Borges", new Date(), "444.444.444-44", "01234");
        Aluno rafael = new Aluno("Rafael", "Alexandre", new Date(), "555.555.555-55", "57469");
    
        Disciplina padraoProjetos = new Disciplina(profFernando, "Padrão de projetos");
        Disciplina redes = new Disciplina(profNeco, "Redes I");
        Disciplina gerenciaConfiguracao = new Disciplina(profCinara, "Gerencia de configuração");
    
        Turma turma1 = new Turma("TSI", "1", new Date(), new Date());
        
        turma1.addDisciplinas(padraoProjetos);
        turma1.addDisciplinas(redes);
//        turma1.addDisciplinas(redes);

        turma1.createMatricula(renner, "123");
        
        renner.acao();
        profFernando.acao();
        
        System.out.println("turma1: "+ turma1.print());
        System.out.println("padraoProjetos1: "+ padraoProjetos.print()); 
        System.out.println("Alunos da turma1: "+ turma1.getMatriculas()); 

    }
    
}
