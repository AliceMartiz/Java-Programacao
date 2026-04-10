package controller;

import java.util.ArrayList;
import model.dao.AluguelDAO;
import model.dao.UsuarioDAO;
import model.entity.Aluguel;
import model.entity.Usuario;

public class UsuarioCONTROLLER {
    UsuarioDAO ud = new UsuarioDAO();
    Usuario u = new Usuario();
    Aluguel a = new Aluguel();
    AluguelDAO ad = new AluguelDAO();
    
    public ArrayList<Aluguel> devolucao(String cpf)
    {
        u.setCpf(cpf);
        ud.pegarTudoPeloCpf(u);
        a.setUsuario(u);
        
        return ad.buscar(a);
    }
    public ArrayList<Aluguel> consultar(String cpf)
    {
        u.setCpf(cpf);
        ud.pegarTudoPeloCpf(u);
        a.setUsuario(u);
        return ad.buscar(a);
    }
}




