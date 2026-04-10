package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.dao.AtorDAO;
import model.dao.FilmeDAO;
import model.dao.PersonagemDAO;
import model.entity.Ator;
import model.entity.Filme;
import model.entity.Personagem;

public class PersonagemCONTROLLER {
    Scanner leia = new Scanner(System.in);
    Ator a = new Ator();
    Filme f = new Filme();
    FilmeDAO fd = new FilmeDAO ();
    Personagem p = new Personagem();
    PersonagemDAO pd = new PersonagemDAO();
    AtorDAO ad = new AtorDAO();
    public void adicionar(String atorCPF, String filmeNOME, String personagemNOME, int idade, String descricacao)
    {
        a.setCpf(atorCPF);
        ad.buscarTudo(a);
        f.setNome(filmeNOME);
        System.out.println("Classificação do Filme: " + filmeNOME);
        if(fd.buscarFILME(f))
        {
            int clas;
            ArrayList<Filme> filmes = fd.buscarTudo(f);
            for(int i = 0; i < filmes.size(); i++)
            {
                System.out.println(filmes.get(i).getClasInd());
            }
            System.out.println("Informe a classificação desejada: ");
            clas = leia.nextInt();
            f.setClasInd(clas);
            fd.pegarIdNome(f);
            p.setAtor(a);
            p.setFilme(f);
            p.setNome(personagemNOME);
            p.setIdade(idade);
            p.setDescricao(descricacao);
            pd.adicionar(p);
        }
        else
        {
            f.setNome(filmeNOME);
            p.setAtor(a);
            p.setFilme(f);
            p.setNome(personagemNOME);
            p.setIdade(idade);
            p.setDescricao(descricacao);
            pd.adicionar(p);
        }
    }
    public void attPersonagem(String personagemNOME, String filmeNOME, String novocpfAtor)
    {
        p.setNome(personagemNOME);
        f.setNome(filmeNOME);
        a.setCpf(novocpfAtor);
        
        fd.buscarId(f);
        ad.buscarTudo(a);
        
        p.setFilme(f);
        p.setAtor(a);
        pd.attPersonagem(p);
    }
}
