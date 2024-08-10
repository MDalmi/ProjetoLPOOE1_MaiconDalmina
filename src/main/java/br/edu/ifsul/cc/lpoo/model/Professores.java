/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 20221PF.CC0003
 */

@Entity
@Table(name = "tb_professores")
public class Professores implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, length = 120)
    private String nomeProfessor;
    
    @OneToMany(mappedBy = "professor")
    private Collection<Disciplinas> disciplina;

    public Professores() {
    }

    public Professores(Integer id, String nomeProfessor, Collection<Disciplinas> disciplina) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.disciplina = disciplina;
    }

    public void setDisciplina(Collection<Disciplinas> disciplina) {
        this.disciplina = disciplina;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Collection<Disciplinas> getDisciplina() {
        return disciplina;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    @Override
    public String toString() {
        return getNomeProfessor();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
