package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >18; 

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao Autorizado comprar bebida alcolica");

        }
        System.out.println("Fora do If");
    }

}
