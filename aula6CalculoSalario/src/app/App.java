package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora fun1 = new Calculadora();
        Scanner in = new Scanner(System.in);

        System.out.println("Digite às horas trabalhadas: ");
        fun1.setHorasTrabalhadas(in.nextDouble()); // utiliza virgula ao invez de . nas casas decimais

        System.out.println("Digite o salário hora: ");
        double valorHora = in.nextDouble();

        System.out.println("Digite o numero de dependentes: ");
        fun1.setSalarioBruto(valorHora, in.nextInt());

        in.close();

        System.out.println("Salário bruto: R$" + fun1.getSalarioBruto());
        System.out.println("Valor de INSS: R$" + fun1.getINSS());
        System.out.println("Valor de IR: R$" + fun1.getIR());
        System.out.println("Salário líquido: R$" + fun1.getSalarioLiquido());
    }
}