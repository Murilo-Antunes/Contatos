package br.com.murilo.contatos.model;

import java.util.UUID;

public class Contato {
    public String nome;
    public String email;
    public String telefone;
    public String id = UUID.randomUUID().toString();

    public String serializarContato(){
        String contatoDados = id + ";" + nome + ";" + email + ";" + telefone + "\n";

        return contatoDados;
    }
}
