
package model.entity;

import java.util.ArrayList;

public class Ator 
{
    private String nome, cpf, sexo;
    ArrayList<Personagem> lista;
    private int id;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Personagem> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Personagem> lista) {
        this.lista = lista;
    }
    
    
}
