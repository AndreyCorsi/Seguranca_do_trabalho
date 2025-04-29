package com.example.AulaTeste.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity(name = "usuario")
public class Usuario {
    @Id()
    @GeneratedValue()
    private UUID codigo_usuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "setor")
    private String setor;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "ptp")
    private String ptp;
    @Column(name = "horaDeInicio")
    private float horaDeInicio;
    @Column(name = "previsaoDeTermino")
    private float previsaoDeTermino;
   
    public Usuario(){}
    public Usuario(String nome, String email, String senha, String setor, String empresa, String ptp, float horaDeInicio, float previsaoDeTermino){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.setor = setor;
        this.empresa = empresa;
        this.ptp = ptp;
        this.horaDeInicio = horaDeInicio;
        this.previsaoDeTermino = previsaoDeTermino;
    }
}
