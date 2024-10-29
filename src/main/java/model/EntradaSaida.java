/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
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
@Table(name = "tb_entrada_saida")
public class EntradaSaida implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    private Date data;
    private Veiculo veiculo;
    private Tipo tipo;

    public EntradaSaida(Date data, Veiculo veiculo, Tipo tipo) {
        this.data = data;
        this.veiculo = veiculo;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
