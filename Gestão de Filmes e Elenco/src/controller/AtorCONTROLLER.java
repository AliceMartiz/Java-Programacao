package controller;

import java.util.ArrayList;
import model.dao.AtorDAO;
import model.dao.PersonagemDAO;
import model.entity.Ator;
import model.entity.Personagem;
import view.AtorVIEW;

public class AtorCONTROLLER {
    AtorDAO ad = new AtorDAO();
    AtorVIEW av = new AtorVIEW();
    Ator a = new Ator();
    Personagem p = new Personagem();
    PersonagemDAO pd = new PersonagemDAO();
    public void adicionar(String nome, String cpf, String sexo)
    {
        a.setNome(nome);
        a.setCpf(cpf);
        a.setSexo(sexo);
        if(!ad.buscarCPF(a))
        {
            ad.adicionar(a);
        }
        else
        {
            av.erro();
        }
    }
    public ArrayList<Personagem> BuscarAtor(String nome)
    {
        a.setNome(nome);
        ad.buscarIdPorNome(a);
        p.setAtor(a);
        return pd.buscarAtor(p);
    }
}
