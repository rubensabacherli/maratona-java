package devdojo.maratonajava.javacore.Npolimorfismo.service;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
