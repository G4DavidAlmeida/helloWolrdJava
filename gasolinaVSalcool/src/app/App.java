package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do alcool: ");
        double alcool = in.nextDouble();
        System.out.println("Digite o valor da gasolina: ");
        double gasolina = in.nextDouble();

        in.close();
        
        double result = gasolina * 0.7;
        
        if (result < alcool) {
            System.out.println("Gasolina é mais rentavel que o alcool");
        } else {
            System.out.println("Alcool é mais rentavel que a gasolina");
        }
    }
}