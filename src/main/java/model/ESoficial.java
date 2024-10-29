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
@Table(name = "tb_es_oficial")
public class ESoficial extends EntradaSaida implements Serializable{

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private int kmRegistrado;
    private Pessoa pessoa;
    
    public ESoficial(Date data, Veiculo veiculo, Tipo tipo){
    super(data, veiculo, tipo);
    }

    public ESoficial(Date data, VeiOficial veiculo, Tipo tipo, int kmRegistrado, Pessoa pessoa) {
        super(data, veiculo, tipo);
        this.kmRegistrado = kmRegistrado;

        this.pessoa = pessoa;
    }

    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
