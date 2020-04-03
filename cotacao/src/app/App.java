package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar em real");
        double cotacao = in.nextDouble();
        System.out.println("Digite o valor que deseja converter em Real");
        double valorDolar = in.nextDouble();

        in.close();
        
        double convercao = valorDolar * cotacao;
        
        if (convercao > 100) {
            System.out.println("5% de desconto");
            System.out.println("Valor original: " + convercao);
            System.out.println("Valor: " + convercao * 0.95);
        } else if (convercao > 1000) {
            System.out.println("10% de desconto");
            System.out.println("Valor original: " + convercao);
            System.out.println("Valor: " + convercao * 0.90);
        } else {
            System.out.println("Valor: " + convercao);
        }
    }
}