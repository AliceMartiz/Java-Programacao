
package controller;

import model.dao.AluguelDAO;
import model.dao.BicicletaDAO;
import model.dao.EstacaoDAO;
import model.dao.UsuarioDAO;
import model.entity.Aluguel;
import model.entity.Bicicleta;
import model.entity.Estacao;
import model.entity.Usuario;

public class AluguelCONTROLLER {
    AluguelDAO ad = new AluguelDAO();
    EstacaoDAO ed = new EstacaoDAO();
    UsuarioDAO ud = new UsuarioDAO();
    BicicletaDAO bd = new BicicletaDAO();
    Aluguel a = new Aluguel();
    Bicicleta b = new Bicicleta();
    Estacao e = new Estacao();
    Usuario u = new Usuario();
    
    public void registrar(String nomeEstacao, String localizacao, int idBicicleta, String cpf)
    {
        e.setNome(nomeEstacao);
        e.setLocalizacao(localizacao);
        ed.pegarTudoPeloNL(e);
        a.setEstacao(e);//
        b.setId(idBicicleta);
        a.setBicicleta(b); //    
        u.setCpf(cpf);
        ud.pegarTudoPeloCpf(u);   
        a.setUsuario(u); //
        bd.attBicicleta(b);
        ad.registrar(a);
    }      
}
