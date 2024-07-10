/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.TrabalhoGit_LPOO.Alunos;
import br.edu.ifsul.cc.lpoo.TrabalhoGit_LPOO.Disciplinas;
import br.edu.ifsul.cc.lpoo.TrabalhoGit_LPOO.Professores;
import br.edu.ifsul.cc.lpoo.trabalhogit.dao.PersistenciaJPA;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 20221PF.CC0003
 */
public class TesteTodasPersistencia {
    
    PersistenciaJPA jpa = new PersistenciaJPA();

    public TesteTodasPersistencia() {
    }

    @Before // o que fazer antes da persistencia
    public void setUp() {

        jpa.conexaoAberta();

    }

    @After // o que fazer depois da persistencia
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void TesteTrabalho() throws Exception{
        
        List<Disciplinas> disPor = new ArrayList<>();
        List<Alunos> alunosLista1 = new ArrayList<>();
        
        Professores prof1 = new Professores();
        
        prof1.setNomeProfessor("Prof Portugues");
        
        
        Disciplinas disc = new Disciplinas();
        disc.setProfessor(prof1);
        disc.setNomeDisciplina("Portugues");
       
        disPor.add(disc);
        prof1.setDisciplina(disPor);
        
        jpa.persist(prof1);
        jpa.persist(disc);
                
        Alunos a1 = new Alunos();
        a1.setNome("Aluno 1");
        alunosLista1.add(a1);
        jpa.persist(a1);
        Alunos a2 = new Alunos();
        a2.setNome("Aluno 2");
        alunosLista1.add(a2);
        jpa.persist(a2);
        Alunos a3 = new Alunos();
        a3.setNome("Aluno 3");
        alunosLista1.add(a3);
        jpa.persist(a3);
        Alunos a4 = new Alunos();
        a4.setNome("Aluno 4");
        alunosLista1.add(a4);
        jpa.persist(a4);
        Alunos a5 = new Alunos();
        a5.setNome("Aluno 5");
        alunosLista1.add(a5);
        jpa.persist(a5);
        disc.setAluno(alunosLista1);
        
        
        
        
        
        
        
        
    }
    
}
