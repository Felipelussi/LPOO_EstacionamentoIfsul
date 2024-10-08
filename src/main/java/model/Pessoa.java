/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Pessoa {
    private int id;
    private String nome;
    private String fone;
    private String email;
    private ArrayList<Veiculo> veiculos;
    private VinculoPessoa vinculo;

    public Pessoa(String nome, String email, ArrayList<Veiculo> veiculos, VinculoPessoa vinculo) {
        this.nome = nome;
        this.email = email;
        this.veiculos = new ArrayList<Veiculo>();
        this.vinculo = vinculo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
        for (Veiculo veiculo : veiculos) {
            veiculo.setProprietario(this);
        }
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
        veiculo.setProprietario(this);
    }

    public VinculoPessoa getVinculo() {
        return vinculo;
    }

    public void setVinculo(VinculoPessoa vinculo) {
        this.vinculo = vinculo;
    }
}
