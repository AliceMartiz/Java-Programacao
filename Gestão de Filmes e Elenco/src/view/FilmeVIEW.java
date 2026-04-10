
package view;

import controller.FilmeCONTROLLER;
import java.util.ArrayList;
import java.util.Scanner;
import model.entity.Personagem;

public class FilmeVIEW 
{
    Scanner leia = new Scanner(System.in);
    public void adicionar()
    {
        FilmeCONTROLLER fc = new FilmeCONTROLLER();
        String nome;
        int clasInd;
        System.out.println("Informe o nome do filme: ");
        nome = leia.next();
        System.out.println("Informe a Classificação Indicativa do Filme: ");
        clasInd = leia.nextInt();
        fc.adicionar(nome, clasInd);
    }
    public void listar()
    {
        FilmeCONTROLLER fc = new FilmeCONTROLLER();
        String nome;
        int clasInd;
        System.out.println("Informe o nome do filme: ");
        nome = leia.nextLine();
        System.out.println("Informe a Classificação Indicativa do Filme: ");
        clasInd = leia.nextInt();
        leia.nextLine();
        ArrayList<Personagem> personagens = fc.listar(nome, clasInd);
        System.out.println("Personagens do filme: " + nome);
        for(int i = 0; i < personagens.size(); i++)
        {
            System.out.println("");
            System.out.println("Personagem: " + personagens.get(i).getNome());
            System.out.println("Ator(Atriz): " + personagens.get(i).getAtor().getNome());
            System.out.println("");
        }
    }
}
