package model.entity;

import java.util.ArrayList;

public class Estacao {
    private String nome, localizacao;
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
