package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro dev dojo";
        String mensagemNaoDoar = "Eu ainda nao tenho condicoes, mas vou ter";
        
        // String resultado = (condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);
    }
}
