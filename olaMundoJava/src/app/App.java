package app;

public class App {
    public static void main(String[] args) throws Exception {
        double valorSalario = 1300.45; // valores decimais
        
        int numeroDenpendentes = 5; // valores inteiros
        
        String nomeCidade = "Bauru"; // valores string
        
        char letra = 'B'; // valores caracteres
        
        boolean temSaldo = true; //  true ou false
        
        double valor1 = 10.20;
        double valor2 = 30.20;
        double soma = valor1 + valor2;
        
        if (soma > 100) {
            System.out.println("Soma maior que 100");
        } else {
            System.out.println("Soma menor que 100");
        }
        
        System.out.println("A soma de " + valor1 + " mais " + valor2 + " é: " + soma);
        
        for (int  i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}