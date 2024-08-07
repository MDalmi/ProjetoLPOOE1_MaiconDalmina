/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.model.Alunos;
import br.edu.ifsul.cc.lpoo.model.Disciplinas;
import br.edu.ifsul.cc.lpoo.model.Professores;
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
    public void TesteTrabalho() throws Exception {
    List<Disciplinas> disPor = new ArrayList<>();
    List<Disciplinas> disMat = new ArrayList<>();
    List<Disciplinas> disHis = new ArrayList<>();
    List<Alunos> alunosLista1 = new ArrayList<>();
    List<Alunos> alunosLista2 = new ArrayList<>();
    List<Alunos> alunosLista3 = new ArrayList<>();
    
    Professores prof1 = new Professores();
    prof1.setNomeProfessor("Prof Portugues");
    
    Professores prof2 = new Professores();
    prof2.setNomeProfessor("Prof Matematica");
    
    Professores prof3 = new Professores();
    prof3.setNomeProfessor("Prof Historia");
    
    Disciplinas disc1 = new Disciplinas();
    disc1.setProfessor(prof1);
    disc1.setNomeDisciplina("Portugues");
    disPor.add(disc1);
    prof1.setDisciplina(disPor);
    jpa.persist(prof1);
    jpa.persist(disc1);
    
    Disciplinas disc2 = new Disciplinas();
    disc2.setProfessor(prof2);
    disc2.setNomeDisciplina("Matematica");
    disMat.add(disc2);
    prof2.setDisciplina(disMat);
    jpa.persist(prof2);
    jpa.persist(disc2);
    
    Disciplinas disc3 = new Disciplinas();
    disc3.setProfessor(prof3);
    disc3.setNomeDisciplina("Historia");
    disHis.add(disc3);
    prof3.setDisciplina(disHis);
    jpa.persist(prof3);
    jpa.persist(disc3);
    
    Alunos a1 = new Alunos();
    a1.setNome("Aluno 1");
    a1.setDisciplina(disc1);
    alunosLista1.add(a1);
    jpa.persist(a1);
    
    Alunos a2 = new Alunos();
    a2.setNome("Aluno 2");
    a2.setDisciplina(disc1);
    alunosLista1.add(a2);
    jpa.persist(a2);
    
    Alunos a3 = new Alunos();
    a3.setNome("Aluno 3");
    a3.setDisciplina(disc1);
    alunosLista1.add(a3);
    jpa.persist(a3);
    
    Alunos a4 = new Alunos();
    a4.setNome("Aluno 4");
    a4.setDisciplina(disc1);
    alunosLista1.add(a4);
    jpa.persist(a4);
    
    Alunos a5 = new Alunos();
    a5.setNome("Aluno 5");
    a5.setDisciplina(disc1);
    alunosLista1.add(a5);
    jpa.persist(a5);
    
    disc1.setAluno(alunosLista1);
    
    Alunos a6 = new Alunos();
    a6.setNome("Aluno 6");
    a6.setDisciplina(disc2);
    alunosLista2.add(a6);
    jpa.persist(a6);
    
    Alunos a7 = new Alunos();
    a7.setNome("Aluno 7");
    a7.setDisciplina(disc2);
    alunosLista2.add(a7);
    jpa.persist(a7);
    
    Alunos a8 = new Alunos();
    a8.setNome("Aluno 8");
    a8.setDisciplina(disc2);
    alunosLista2.add(a8);
    jpa.persist(a8);
    
    Alunos a9 = new Alunos();
    a9.setNome("Aluno 9");
    a9.setDisciplina(disc2);
    alunosLista2.add(a9);
    jpa.persist(a9);
    
    Alunos a10 = new Alunos();
    a10.setDisciplina(disc2);
    a10.setNome("Aluno 10");
    alunosLista2.add(a10);
    jpa.persist(a10);
    
    disc2.setAluno(alunosLista2);
    
    Alunos a11 = new Alunos();
    a11.setDisciplina(disc3);
    a11.setNome("Aluno 11");
    alunosLista3.add(a11);
    jpa.persist(a11);
    
    Alunos a12 = new Alunos();
    a12.setNome("Aluno 12");
    a12.setDisciplina(disc3);
    alunosLista3.add(a12);
    jpa.persist(a12);
    
    Alunos a13 = new Alunos();
    a13.setNome("Aluno 13");
    a13.setDisciplina(disc3);
    alunosLista3.add(a13);
    jpa.persist(a13);
    
    Alunos a14 = new Alunos();
    a14.setNome("Aluno 14");
    a14.setDisciplina(disc3);
    alunosLista3.add(a14);
    jpa.persist(a14);
    
    Alunos a15 = new Alunos();
    a15.setNome("Aluno 15");
    a15.setDisciplina(disc3);
    alunosLista3.add(a15);
    jpa.persist(a15);
    
    disc3.setAluno(alunosLista3);
}

    
}
