
package view;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) {
        AtorVIEW av = new AtorVIEW();
        FilmeVIEW fv = new FilmeVIEW();
        PersonagemVIEW pv = new PersonagemVIEW();
        Scanner leia = new Scanner(System.in);
        int op = 0;
        do
        {
            System.out.println("Informe a opção desejada: \n1 - Cadastro de Ator\n2 - Cadastro de Filme\n3 - Cadastro de Personagem\n4 - Listar Personagens \n5 - Alterar Ator\n6 - Buscar Ator");
            System.out.printf("--> ");
            op = leia.nextInt();
            if(op == 1)
            {
            /*
            **Cadastro de ator:** solicite que o usuário informe dados para realizar o cadastro
            de um ator e adicione-o na base de dados. Não permita o cadastro de atores
            com CPF repetido.
            */
                av.adicionar();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
            if(op == 2)
            {
            /*
            **Cadastro de filme:** solicite que o usuário informe dados para realizar o
            cadastro de um filme e adicione-o na base de dados.
            */
                fv.adicionar();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
            if(op == 3)
            {
            /*
            **Cadastro de personagem:** solicite que o usuário informe o CPF do ator e o
            nome de um filme. Se houver mais de um filme com o mesmo nome, apresente
            a classificação indicativa dele e solicite que o usuário selecione qual
            classificação deseja. Com os dados do ator e do filme, solicite os dados para
            cadastro de um personagem. Relacione-o ao ator e filme escolhido e adicione-o
            na base de dados. Se não houver o ator ou o filme selecionado, não permita o
            cadastro do personagem e informe o usuário sobre o motivo da não realização
            do cadastro do personagem.
            */
                pv.adicionar();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
            if(op == 4)
            {
            /*
            **Listar personagens:** solicite que o usuário informe o nome de um filme e a
            classificação indicativa dele. Considere que não haverá mais de um filme com o
            mesmo nome e a mesma classificação indicativa. Após receber os dados,
            apresente o nome de todos os personagens daquele filme. Apresente também o
            nome de todos os atores relacionados ao filme em questão.
            */
                fv.listar();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
            if(op == 5)
            {
            /*
            **Alterar ator:** solicite que o usuário informe o nome de um personagem, o nome
            de um filme o CPF de um novo ator. Atualize o cadastro daquele personagem
            para que ele seja transferido para o novo ator informado. Considere que não
            haverá mais de um personagem e filme com o mesmo nome.
            */
                pv.attPersonagem();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
            if(op == 6)
            {
            /*
            Buscar ator: solicite o nome de um ator e apresente o nome de cada
            personagem acompanhado do nome do filme. No final, apresente a quantidade
            de personagens aquele ator realizou.
            */
                av.buscarAtor();
                System.out.println("");
                System.out.println("Finalizado!");
                System.out.println("");
            }
        }
        while(op != 7);
    }
}

/*
select * from Ator
select * from Personagem
select * from Filme

select * from Ator where id = 1
select nome from personagem where id_fil = 1 
select nome, id_ator from Personagem where id_fil = 1
update Personagem set id_ator = 1 where id_fil = 1 and nome = 'sadasdsa'

INSERT INTO Ator (nome, cpf, sexo) VALUES ('João Silva', '12345678900', 'M');
INSERT INTO Ator (nome, cpf, sexo) VALUES ('Maria Oliveira', '98765432100', 'F');
INSERT INTO Ator (nome, cpf, sexo) VALUES ('Carlos Pereira', '45612378911', 'M');
INSERT INTO Ator (nome, cpf, sexo) VALUES ('Ana Santos', '32165498700', 'F');
INSERT INTO Ator (nome, cpf, sexo) VALUES ('Fernanda Lima', '65498732122', 'F');

INSERT INTO Filme (nome, clasInd) VALUES ('Aventura no Deserto', 12);
INSERT INTO Filme (nome, clasInd) VALUES ('Comédia dos Amigos', 10);
INSERT INTO Filme (nome, clasInd) VALUES ('Drama em Família', 16);
INSERT INTO Filme (nome, clasInd) VALUES ('Mistério na Floresta', 14);
INSERT INTO Filme (nome, clasInd) VALUES ('Viagem ao Futuro', 12);

INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('João Explorador', 35, 'Líder da expedição', 1, 1);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Maria Risada', 28, 'Personagem engraçada', 2, 2);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Carlos Pai', 45, 'Pai de família dedicado', 3, 3);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Ana Investigadora', 32, 'Investigadora determinada', 4, 4);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Fernanda Cientista', 29, 'Cientista brilhante', 5, 5);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Lucas Aventureiro', 30, 'Explorador corajoso e curioso', 1, 1);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Clara Risos', 25, 'Amiga que sempre traz alegria', 2, 2);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Pedro Jovem', 18, 'Filho rebelde, mas de bom coração', 3, 3);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Beto Florestal', 40, 'Guia com vasto conhecimento da floresta', 4, 4);
INSERT INTO Personagem (nome, idade, descricao, id_ator, id_fil) VALUES ('Diana Inventora', 35, 'Cientista criativa com grandes ideias', 5, 5);
*/