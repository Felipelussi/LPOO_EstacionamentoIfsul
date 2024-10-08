/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author felipe
 */
public class ESoficial extends EntradaSaida {
    private int kmRegistrado;
    private Pessoa pessoa;

    public ESoficial(Date data, VeiOficial veiculo, Tipo tipo,  int kmRegistrado, Pessoa pessoa) {
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
