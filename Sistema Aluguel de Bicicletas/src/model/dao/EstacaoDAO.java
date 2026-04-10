package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.entity.Estacao;

public class EstacaoDAO {
    public void pegarTudoPeloNL(Estacao estacao)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Estacao where nome = ? and localizacao = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, estacao.getNome());
            statement.setString(2, estacao.getLocalizacao());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                estacao.setId(rs.getInt("id"));               
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