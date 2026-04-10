
package controller;

import java.util.ArrayList;
import model.dao.FilmeDAO;
import model.dao.PersonagemDAO;
import model.entity.Filme;
import model.entity.Personagem;

public class FilmeCONTROLLER {
    Filme f = new Filme();
    FilmeDAO fd = new FilmeDAO();
    PersonagemDAO pd = new PersonagemDAO();
    Personagem p = new Personagem();
    public void adicionar(String nome, int clasInd)
    {
        f.setNome(nome);
        f.setClasInd(clasInd);
        fd.adicionar(f);
    }
    public ArrayList<Personagem> listar(String nome, int clasInd)
    {
        f.setNome(nome);
        f.setClasInd(clasInd);
        fd.pegarIdNome(f);
        p.setFilme(f);
        return pd.listarPersonagens(p);
    }
}
