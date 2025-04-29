package com.example.AulaTeste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
 
@Data
@Entity(name="formulario")
public class Formulario {
@Column(name = "identificacao")
private String identificacao;
@Column(name = "identificacaoAtividade")
private String identificacaoAtividade;
@Column(name = "riscosAtividade")
private String riscosAtividade;
@Column(name = "medidasControle")
private String medidasControle;
@Column(name = "epiNecessarios")
private String epiNecessarios;
@Column(name = "revalidacaoEncerramento")
private String revalidacaoEncerramento;

public Formulario(){}
public Formulario(String identificacao, String identificacaoAtividade, String riscosAtividade, String medidasControle, String epiNecessarios, String revalidacaoEncerramento){
    this.identificacao = identificacao;
    this.identificacaoAtividade = identificacaoAtividade;
    this.riscosAtividade = riscosAtividade;
    this.medidasControle = medidasControle;
    this.epiNecessarios = epiNecessarios;
    this.revalidacaoEncerramento = revalidacaoEncerramento;
    }
}
