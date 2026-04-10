package view;

import controller.PersonagemCONTROLLER;
import java.util.Scanner;

public class PersonagemVIEW 
{
    Scanner leia = new Scanner(System.in);
    public void adicionar()
    {
        PersonagemCONTROLLER pc = new PersonagemCONTROLLER();
        String atorCPF, filmeNOME, personagemNOME, descricao;
        int idade;
        System.out.println("Informe o CPF do Ator: ");
        atorCPF = leia.next();
        System.out.println("Informe o NOME do Filme: ");
        filmeNOME = leia.next();
        System.out.println("Informe o NOME do Personagem: ");
        personagemNOME = leia.next();
        System.out.println("Informe a IDADE do Personagem: ");
        idade = leia.nextInt();
        System.out.println("Informe a DESCRICAO do Personagem: ");
        descricao = leia.next();
        pc.adicionar(atorCPF, filmeNOME, personagemNOME, idade, descricao);
    }
    public void attPersonagem()
    {
        PersonagemCONTROLLER pc = new PersonagemCONTROLLER();
        String personagemNOME, filmeNOME, novocpfATOR;
        System.out.println("Informe o nome de um personagem: ");
        personagemNOME = leia.nextLine();
        System.out.println("Informe o nome de um filme: ");
        filmeNOME = leia.nextLine();
        System.out.println("Informe o cpf do novo ator: ");
        novocpfATOR = leia.next();
        pc.attPersonagem(personagemNOME, filmeNOME, novocpfATOR);
        leia.nextLine();
    }
}
