package devdojo.maratonajava.javacore.Npolimorfismo.service;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
