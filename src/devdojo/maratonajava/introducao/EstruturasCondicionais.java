package devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 17;
        String categoria;

        if (idade >= 18){
            categoria = "Categoria Adulta";
        } else if( idade < 18 && idade >= 15 ){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Infantil";
        }
        System.out.println(categoria);
    }
}
