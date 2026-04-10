
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.entity.Aluguel;
import model.entity.Bicicleta;
import model.entity.Estacao;

public class AluguelDAO {
    public void registrar(Aluguel aluguel)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "INSERT INTO Aluguel VALUES (?, ?, ?)";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, aluguel.getUsuario().getId());
            statement.setInt(2, aluguel.getBicicleta().getId());
            statement.setInt(3, aluguel.getEstacao().getId());
            statement.execute();
            statement.close();
            conexao.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public ArrayList<Aluguel> buscar(Aluguel aluguel)
    {
        ArrayList<Aluguel> lista = new ArrayList<Aluguel>();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Aluguel where id_usu = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, aluguel.getUsuario().getId());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Estacao e = new Estacao();
                aluguel = new Aluguel();
                Bicicleta b = new Bicicleta();
                BicicletaDAO bd = new BicicletaDAO();
                b.setId(rs.getInt("id_bic"));
                bd.buscarBicicleta(b);
                e.setId(rs.getInt("id_est"));
                aluguel.setBicicleta(b);
                aluguel.setEstacao(e);
                lista.add(aluguel);
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
    public ArrayList<Aluguel> buscarEstacao(Aluguel aluguel)
    {
        ArrayList<Aluguel> lista = new ArrayList<Aluguel>();
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Aluguel where id_est = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, aluguel.getEstacao().getId());
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                aluguel = new Aluguel();
                Bicicleta b = new Bicicleta();
                b.setId(rs.getInt("id_bic"));
                aluguel.setBicicleta(b);
                lista.add(aluguel);
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
}

