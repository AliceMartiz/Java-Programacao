package controller;

import model.dao.BicicletaDAO;
import model.entity.Bicicleta;

public class BicicletaCONTROLLER {
    BicicletaDAO bd = new BicicletaDAO();
    Bicicleta b = new Bicicleta();
    public void cadastroBicicleta(int status, int id)
    {
        b.setStatus(status);
        b.setId(id);
        bd.cadastrar(b);
    }
    public void attStatus(int id)
    {
        b.setId(id);
        bd.attStatus(b);
    }
}
