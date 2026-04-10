
package controller;

import java.util.ArrayList;
import model.dao.AluguelDAO;
import model.dao.EstacaoDAO;
import model.entity.Aluguel;
import model.entity.Estacao;

public class EstacaoCONTROLLER {
    Estacao e = new Estacao();
    Aluguel a = new Aluguel();
    AluguelDAO ad = new AluguelDAO();
    public ArrayList<Aluguel> buscarEstacao(int codEstacao)
    {
        e.setId(codEstacao);
        a.setEstacao(e);
        return ad.buscarEstacao(a);
    }
}
