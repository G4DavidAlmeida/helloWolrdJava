package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Pessoa user = new Pessoa();

        System.out.println("Digite sua Altura: ");

        user.setHeight(input.nextDouble());

        System.out.println("Digite seu Pesso: ");

        user.setWeight(input.nextDouble());

        double imc = user.calcImc();

        System.out.println(user.statusImc(imc));

        input.close();
    }
}