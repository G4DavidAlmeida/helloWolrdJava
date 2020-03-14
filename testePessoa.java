public class testePessoa
{
    public static void main(String[] args) {
        System.out.println("============================================");
        Pessoa p1 = new Pessoa();
        p1.nome = "David";
        p1.idade = 19;
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Cubas";
        p2.idade = 80;
        
        System.out.println(p1.nome + " : " + p1.idade);
        System.out.println(p2.nome + " : " + p2.idade);
        
        p1 = p2;System.out.println("----------------------------------");
        
        System.out.println(p1.nome + " : " + p1.idade);
        System.out.println(p2.nome + " : " + p2.idade);
        System.out.println("===========================================");
    }
}
