package org.example;

public class Main {
    public static Turma turma = new Turma();

    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa(1, "Maria");
        Pessoa pessoa2 = new Pessoa(2, "João");
        Pessoa pessoa3 = new Pessoa(3, "José");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);
        turma.adicionarPessoa(pessoa3);

        System.out.println(turma.getPessoas().size());

        turma.removerTodasPessoas();

        System.out.println(turma.getPessoas().size());
    }
}