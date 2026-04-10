package view;

import controller.AtorCONTROLLER;
import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Personagem;

public class AtorVIEW 
{
    Scanner leia = new Scanner(System.in);
    public void adicionar()
    {
        AtorCONTROLLER ac = new AtorCONTROLLER();
        String nome, cpf, sexo;
        System.out.println("Informe o nome:");
        nome = leia.next();
        System.out.println("Informe o cpf:");
        cpf = leia.next();
        System.out.println("Informe o sexo:");
        sexo = leia.next();
        ac.adicionar(nome, cpf, sexo);
    }
    public void erro(){
        System.out.println("CPF Já está cadastrado em nosso banco de dados.");
    }
    public void buscarAtor()
    {
        AtorCONTROLLER ac = new AtorCONTROLLER();
        int cont = 0;
        String nome;
        System.out.println("Informe o nome do Ator: ");
        nome = leia.nextLine();
        ArrayList<Personagem> personagens = ac.BuscarAtor(nome);
        for(int i = 0; i < personagens.size(); i++)
        {
            System.out.println("");
            System.out.println("Personagem: " + personagens.get(i).getNome() + 
                    " Do Filme: " + personagens.get(i).getFilme().getNome());
            cont++;
        }
        System.out.println("Total de Personagens: " + cont);
    }
}
