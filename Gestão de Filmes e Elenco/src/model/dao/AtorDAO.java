
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.entity.Ator;

public class AtorDAO 
{
    public void adicionar(Ator ator)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "insert into Ator values(?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, ator.getNome());
            statement.setString(2, ator.getCpf());
            statement.setString(3, ator.getSexo());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean buscarCPF(Ator ator)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Ator where cpf = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, ator.getCpf());
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
    public void buscarTudo(Ator ator)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Ator where cpf = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, ator.getCpf());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                ator.setId(rs.getInt("id"));
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void buscarNome(Ator ator)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Ator where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, ator.getId());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                ator.setNome(rs.getString("nome"));
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void buscarIdPorNome(Ator ator)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Ator where nome = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, ator.getNome());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                ator.setId(rs.getInt("id"));
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

