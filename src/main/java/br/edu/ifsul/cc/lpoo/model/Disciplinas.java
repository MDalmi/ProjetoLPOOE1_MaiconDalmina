/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 20221PF.CC0003
 */

@Entity
@Table(name = "tb_disciplinas")
public class Disciplinas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 120)
    private String nomeDisciplina;
    
    @OneToMany
    private List<Alunos> aluno;

    @ManyToOne
    @JoinColumn
    private Professores professor;
    
    
    public Disciplinas() {
    }

    public Disciplinas(Integer id, String nomeDisciplina, List<Alunos> aluno, Professores professor) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Professores getProfessor() {
        return professor;
    }

    

    public void setAluno(List<Alunos> aluno) {
        this.aluno = aluno;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public List<Alunos> getAluno() {
        return aluno;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    @Override
    public String toString() {
        return getNomeDisciplina(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
    
    
}
