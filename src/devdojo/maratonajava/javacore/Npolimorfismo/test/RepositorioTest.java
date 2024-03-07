package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancodeDados;
import devdojo.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Rubens");
        list.add("Vicente");
        list.add("Miguel");
        System.out.println(list);
    }
}
