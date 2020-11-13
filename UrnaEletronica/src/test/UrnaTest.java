package test;

import app.*;

// código vereador 1, código prefeito 2
public class UrnaTest {
	public static Urna urna;
	
	public static void main(String[] args) {
		urna = new Urna();
		
		System.out.println("Total de votos feitos: " + urna.totalVotos());
		
		// criando candidatos a vereadores
		Candidato vereador1 = new Candidato("Julhinho", "11.111.111-1", 1, 25555);
		Candidato vereador2 = new Candidato("Marcos", "22.222.222-2", 1, 12555);
		System.out.println(
			"Vereador 1 foi adicionado? " + urna.adicionarCandidato(vereador1) + "\n" +
			"Vereador 2 foi adicionado? " + urna.adicionarCandidato(vereador2) + "\n" +
			"Vereador 3 foi adicionado? " + urna.adicionarCandidato(new Candidato())
		);
		
		// criando candidatos a prefeitos
		Candidato prefeito1 = new Candidato("Chico", "33.333.333-3", 2, 25);
		Candidato prefeito2 = new Candidato("Zé", "44.444.444-4", 2, 12);
		System.out.println(
			"Prefeito 1 foi adicionado? " + urna.adicionarCandidato(prefeito1) + "\n" +
			"Prefeito 2 foi adicionado? " + urna.adicionarCandidato(prefeito2) + "\n" +
			"Prefeito 3 foi adicionado? " + urna.adicionarCandidato(new Candidato())
		);
		
		// criando eleitores
		Eleitor eleitor1 = new Eleitor("infeliz1", "55.555.555-5");
		Eleitor eleitor2 = new Eleitor("infeliz3", "66.666.666-6");
		Eleitor eleitor3 = new Eleitor("infeliz3", "77.777.777-7");
		
		// criando votos
		urna.adicionarVoto(25555, 25, eleitor1);
		urna.adicionarVoto(25555, 25, eleitor1); // voto inválido
		urna.adicionarVoto(12555, 12, eleitor2);
		urna.adicionarVoto(25555, 25, eleitor3);
		
		System.out.println("Total de votos feitos: " + urna.totalVotos());
		
		urna.mostrarVencedores();
	}
}
