package br.com.murilo.contatos;

import br.com.murilo.contatos.model.Contato;
import br.com.murilo.contatos.repository.ContatoRepository;

import java.util.Scanner;

public class ContatosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Contato c1 = new Contato();
        System.out.print("Digite o nome do contato: ");
        c1.nome = sc.nextLine();
        System.out.print("Digite o email do contato: ");
        c1.email = sc.nextLine();
        System.out.print("Digite o telefone do contato: ");
        c1.telefone = sc.nextLine();

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = c1;
        contatoRepository.gravar();

        contatoRepository.listarContatos();


    }
}
