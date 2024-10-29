/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author felipe
 */
@Entity
@Table(name = "tb_veiculo")
public class Veiculo implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private String cor;
    private String placa;
    private Pessoa proprietario;
    private Modelo modelo;
    private TipoVeiculo tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

//    public void setProprietario(Pessoa proprietario) {
//        this.proprietario = proprietario;
//        proprietario.addVeiculo(this);
//    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
