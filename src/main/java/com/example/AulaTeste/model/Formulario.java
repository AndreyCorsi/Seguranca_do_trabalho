package com.example.AulaTeste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
 
@Data
@Entity(name="formulario")
public class Formulario {
@Column(name = "TiposdeAtividade")
private String TiposdeAtividade;
@Column(name = "RiscosTrabalhoemAltura")
private String RiscosTrabalhoemAltura;
@Column(name = "RiscosEspacoConfinado")
private String RiscosEspacoConfinado;
@Column(name = "RiscosEnergiaPerigosa ")
private String RiscosEnergiaPerigosa;
@Column(name = "RiscosEquipamentosMoveis")
private String RiscosEquipamentosMoveis;
@Column(name = "RiscosIcamentodeCarga")
private String RiscosIcamentodeCarga;

public Formulario(){}
public Formulario(String TiposdeAtividade, String RiscosTrabalhoemAltura, String RiscosEspacoConfinado, String RiscosEnergiaPerigosa, String RiscosEquipamentosMoveis, String RiscosIcamentodeCarga){
    this.TiposdeAtividade = TiposdeAtividade;
    this.RiscosTrabalhoemAltura = RiscosTrabalhoemAltura;
    this.RiscosEspacoConfinado = RiscosEspacoConfinado;
    this.RiscosEnergiaPerigosa = RiscosEnergiaPerigosa;
    this.RiscosEquipamentosMoveis = RiscosEquipamentosMoveis;
    this.RiscosIcamentodeCarga = RiscosIcamentodeCarga;
    }
}
