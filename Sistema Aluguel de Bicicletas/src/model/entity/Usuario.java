package model.entity;

import java.util.ArrayList;

public class Usuario {
    private String nome, cpf, telefone;
    private int id;
    private ArrayList<Aluguel> lista;

    public ArrayList<Aluguel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluguel> lista) {
        this.lista = lista;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
