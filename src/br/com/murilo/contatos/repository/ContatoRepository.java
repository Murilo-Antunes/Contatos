package br.com.murilo.contatos.repository;

import br.com.murilo.contatos.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private Path arquivo = Paths.get("/Users/25203706/ds1t/contatos.csv");

    public void gravar(){


        try{
            Files.writeString(arquivo,contato.serializarContato(), StandardOpenOption.APPEND);
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void listarContatos(){
        try {
            List<String> listaContatos = Files.readAllLines(arquivo);
            int contador = 0;

            while(contador < listaContatos.size()){
                String[] linhaContatos = listaContatos.get(contador).split(";");
                System.out.println("Nome: " + linhaContatos[1]);
                System.out.println("Telefone: " + linhaContatos[3]);
                System.out.println("Email: " + linhaContatos[2]);
                System.out.println("-----------------------------------");
                contador++;
            }
        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }
}
