import java.util.Scanner;
public class gasolinaVSalcool
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do alcool: ");
        double alcool = in.nextDouble();
        System.out.println("Digite o valor da gasolina: ");
        double gasolina = in.nextDouble();
        
        double result = gasolina * 0.7;
        
        if (result < alcool) {
            System.out.println("Gasolina é mais rentavel que o alcool");
        } else {
            System.out.println("Alcool é mais rentavel que a gasolina");
        }
    }
}
