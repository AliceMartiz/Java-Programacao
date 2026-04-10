package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Bicicleta;

public class BicicletaDAO
{
    public void cadastrar(Bicicleta bicicleta)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "INSERT INTO Bicicleta VALUES (?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, bicicleta.getStatus());
            statement.setInt(2, bicicleta.getId());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void attBicicleta(Bicicleta bicicleta)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "update Bicicleta set status = 2 where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, bicicleta.getId());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public ArrayList<Bicicleta> buscarBicicleta(Bicicleta bicicleta)
    {
        ArrayList<Bicicleta> lista = new ArrayList<Bicicleta>();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Bicicleta where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, bicicleta.getId());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                bicicleta.setStatus(rs.getInt("status"));
                lista.add(bicicleta);
            }
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return lista;
    }
    public void attStatus(Bicicleta bicicleta)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "update Bicicleta set status = 1 where id = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, bicicleta.getId());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
