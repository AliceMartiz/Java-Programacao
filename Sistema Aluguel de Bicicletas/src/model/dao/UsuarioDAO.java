
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.entity.Usuario;

public class UsuarioDAO {
    public void pegarTudoPeloCpf(Usuario usuario)
    {
        try
        {
            Connection conexao = ConectaBanco.getConnection();
            String sql = "select * from Usuario where cpf = ?";
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, usuario.getCpf());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                usuario.setId(rs.getInt("id"));      
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
