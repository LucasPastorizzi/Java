import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
   int garcom;
   int hours;
   int soma;

        System.out.println("Digite a qntidade de garçons por favor;");
        garcom = ler.nextInt();

        System.out.println("Agora escreva a quantidade de horas do evento.");
        hours = ler.nextInt();

        soma = (garcom * 10 * hours);

        System.out.println("O total que irá pagar será;" + soma +"$$");











    }
}