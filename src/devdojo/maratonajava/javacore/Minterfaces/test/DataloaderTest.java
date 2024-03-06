package devdojo.maratonajava.javacore.Minterfaces.test;

import devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

import java.io.File;

public class DataloaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
