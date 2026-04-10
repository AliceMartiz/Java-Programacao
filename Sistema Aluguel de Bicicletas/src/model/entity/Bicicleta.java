package model.entity;

import java.util.ArrayList;

public class Bicicleta {
    private int status, id;
    private ArrayList<Aluguel> lista;

    public ArrayList<Aluguel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluguel> lista) {
        this.lista = lista;
    }
    
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
