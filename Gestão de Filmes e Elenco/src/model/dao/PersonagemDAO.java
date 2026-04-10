
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Ator;
import model.entity.Filme;
import model.entity.Personagem;

public class PersonagemDAO 
{
public void adicionar(Personagem personagem)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "insert into Personagem values(?, ?, ?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, personagem.getNome());
            statement.setInt(2, personagem.getIdade());
            statement.setString(3, personagem.getDescricao());
            statement.setInt(4, personagem.getAtor().getId());
            statement.setInt(5, personagem.getFilme().getId());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public ArrayList<Personagem> listarPersonagens(Personagem personagem)
    {
    ArrayList<Personagem> personagens = new ArrayList();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select nome, id_ator from Personagem where id_fil = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, personagem.getFilme().getId());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                AtorDAO ad = new AtorDAO();
                personagem = new Personagem();
                personagem.setNome(rs.getString("nome"));
                Ator ator = new Ator();
                ator.setId(rs.getInt("id_ator"));
                ad.buscarNome(ator);
                personagem.setAtor(ator);
                personagens.add(personagem);
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return personagens;
    }
public void attPersonagem(Personagem personagem)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "update Personagem set id_ator = ? where id_fil = ? and nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, personagem.getAtor().getId());
            statement.setInt(2, personagem.getFilme().getId());
            statement.setString(3, personagem.getNome());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public ArrayList<Personagem> buscarAtor(Personagem personagem)
    {
        ArrayList<Personagem> personagens = new ArrayList();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Personagem where id_ator = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, personagem.getAtor().getId());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
               Filme filme = new Filme();
               FilmeDAO fd = new FilmeDAO();
               personagem = new Personagem();
               personagem.setNome(rs.getString("nome"));
               filme.setId(rs.getInt("id_fil"));
               fd.buscarFilmePorId(filme);
               personagem.setFilme(filme);
               personagens.add(personagem);
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return personagens;
    }
}
