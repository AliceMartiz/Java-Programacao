
package model.entity;

import java.util.ArrayList;

public class Filme 
{
    private String nome;
    private int clasInd, id;
    ArrayList<Personagem> lista;

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

    public int getClasInd() {
        return clasInd;
    }

    public void setClasInd(int clasInd) {
        this.clasInd = clasInd;
    }

    public ArrayList<Personagem> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Personagem> lista) {
        this.lista = lista;
    }
    
    
}
