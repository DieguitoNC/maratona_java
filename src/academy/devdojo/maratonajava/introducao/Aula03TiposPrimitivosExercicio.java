package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Diego";
        String address = "Rua Diegod";
        double salary = 1800.15;
        String dataSalary = "03/06/2025";
        String message = ("Eu "+name+" , morando no endereco "+address+" , confirmo que recebi o salario de "+salary+" , na data "+dataSalary);
        System.out.println(message); 
    }
}
