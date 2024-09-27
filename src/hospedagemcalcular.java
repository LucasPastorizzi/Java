import java.sql.SQLOutput;
import java.util.Scanner;

public class hospedagemcalcular {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double diaria ;
    double dias;
    double soma;

        System.out.println("Escreva o valor da diária");
        diaria =entrada.nextDouble();
        while (diaria <= 0){
            System.out.println("valor inválido.");
            System.exit(1);
        }
        System.out.println("Escreva a quantidade de dias que deseja se hospedar no hotel");
        dias = entrada.nextDouble();
        while (dias <= 0 ) {
            System.out.println("Valor inválido!");
            System.exit(1);
        }if (dias >=31) {
            System.out.println("Valor inválido.");
            System.exit(1);
        }

        soma = (diaria * dias);
        System.out.println("O valor total das diárias foi:"+ soma );







    }
}