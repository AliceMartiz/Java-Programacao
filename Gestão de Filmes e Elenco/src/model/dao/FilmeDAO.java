
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.entity.Filme;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FilmeDAO 
{
public void adicionar(Filme filme)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "insert into Filme values(?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, filme.getNome());
            statement.setInt(2, filme.getClasInd());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public boolean buscarFILME(Filme filme)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select id from Filme where nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, filme.getNome());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                return true;
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
public void buscarId(Filme filme)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select id from Filme where nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, filme.getNome());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                filme.setId(rs.getInt("id"));
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public ArrayList<Filme> buscarTudo(Filme filme)
    {
        ArrayList<Filme> filmes = new ArrayList();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Filme where nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, filme.getNome());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setNome(rs.getString("nome"));
                filme.setClasInd(rs.getInt("clasInd"));
                filmes.add(filme);
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return filmes;
    }
public void pegarIdNome(Filme filme)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select id from Filme where nome = ? and clasInd = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, filme.getNome());
            statement.setInt(2, filme.getClasInd());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                filme.setId(rs.getInt("id"));
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
public void buscarFilmePorId(Filme filme)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Filme where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, filme.getId());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                filme.setNome(rs.getString("nome"));
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
