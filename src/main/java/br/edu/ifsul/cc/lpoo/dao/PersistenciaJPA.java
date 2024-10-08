
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.ifsul.cc.lpoo.model.Alunos;
import br.edu.ifsul.cc.lpoo.model.Disciplinas;
import br.edu.ifsul.cc.lpoo.model.Professores;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author dalmi
 */
public class PersistenciaJPA implements InterfacePersistencia{
    
    public EntityManagerFactory factory;    //fabrica de gerenciadores de entidades
    public EntityManager entity;    //gerenciador de entidades JPA

    public PersistenciaJPA() {

        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory = Persistence.createEntityManagerFactory("br.edu.ifsul.cc.lpoo.lpoo_danca_LPOO_Danca_jar_1.0-SNAPSHOTPU");
        entity = factory.createEntityManager();

    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);//encontra um determinado registro 
    }

    @Override
    public void persist(Object o) throws Exception {
        entity.getTransaction().begin();// abrir a transacao.
        entity.persist(o); //realiza o insert ou update.
        entity.getTransaction().commit(); //comita a transacao (comando sql) 
    }

    @Override
    public void remover(Object obj) {
        EntityTransaction transaction = entity.getTransaction();
    try {
        transaction.begin();
        Object managedObj = entity.merge(obj); // Anexa o objeto ao contexto de persistência
        entity.remove(managedObj); // Remove o objeto gerenciado
        transaction.commit();
    } catch (Exception e) {
        if (transaction.isActive()) {
            transaction.rollback();
        }
        throw e;
    }
    }
    
    public List<Alunos> getAlunos() {
        return entity.createQuery("SELECT m FROM Alunos m", Alunos.class).getResultList();
}
    
    
    public List<Alunos> getAlunosDISC(Disciplinas disciplinaId) {
    return entity.createQuery(
            "SELECT a FROM Alunos a WHERE a.disciplina = :disciplinaId", 
            Alunos.class)
        .setParameter("disciplinaId", disciplinaId)
        .getResultList();
    }
    
    public List<Disciplinas> getDisciplinasPROF(Professores profID) {
    return entity.createQuery(
            "SELECT a FROM Disciplinas a WHERE a.professor = :profID", 
            Disciplinas.class)
        .setParameter("profID", profID)
        .getResultList();
}

    public List<Professores> getProfessores() {
        
      return entity.createQuery("SELECT m FROM Professores m", Professores.class).getResultList();

    }
    
    public List<Disciplinas> getDisciplinas() {
        
      return entity.createQuery("SELECT m FROM Disciplinas m", Disciplinas.class).getResultList();

    }
    
}


