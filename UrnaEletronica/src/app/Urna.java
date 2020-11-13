package app;

import java.util.*;

public class Urna {
	private List<Voto> votos;
	private List<String> jaVotaram;	
	private List<Candidato> candidatosAPrefeito;
	private List<Candidato> candidatosAVereador;
	
	public Urna () {
		this.votos = new ArrayList<>();
		this.jaVotaram = new ArrayList<>();
		this.candidatosAPrefeito = new ArrayList<>();
		this.candidatosAVereador = new ArrayList<>();
	}
	
	public int totalVotos () {
		return this.votos.size();
	}
	
	public void mostrarVencedores () {
		System.out.println("Resultados");
		this.resultadosPrefeito();
		this.resultadosVereador();
	}
	
	private void resultadosPrefeito () {
		Iterator<Candidato> iterator = this.candidatosAPrefeito.iterator();
		Candidato vencedor = this.candidatosAPrefeito.iterator().next();
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (vencedor.getVotosRecebidos() < candidato.getVotosRecebidos()) {
				vencedor = candidato;
			}
		}
		
		System.out.println(
			"O Vencedor para prefeito foi: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getVotosRecebidos()
		);
	}
	
	private void resultadosVereador () {
		Iterator<Candidato> iterator = this.candidatosAVereador.iterator();
		Candidato vencedor = this.candidatosAVereador.iterator().next();
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (vencedor.getVotosRecebidos() < candidato.getVotosRecebidos()) {
				vencedor = candidato;
			}
		}
		
		System.out.println(
			"O Vencedor para Vereador foi: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getVotosRecebidos()
		);
	}
	
	/*
	public static void mostrarVoto (Voto voto) {
		if (!urna.adicionarVoto(voto)) {
			System.out.println("Voto inválido");
			return;
		}
		
		System.out.println("Eleitor: ");
		mostrarPessoa(voto.getEleitor());
		System.out.println("Votou para prefeito: ");
		mostrarPessoa(voto.getPrefeito());
		System.out.println("Votou para vereador: ");
		mostrarPessoa(voto.getVereador());
	}
	
	public static void mostrarPessoa (Eleitor pessoa) {
		System.out.println(
			"\tNome: " + pessoa.getNome() + "\n" +
			"\tRG: " + pessoa.getRg()
		);
	}
	*/
	
	public boolean adicionarVoto (int codVereador, int codPrefeito, Eleitor eleitor) {
		boolean condition = !eleitor.verificarCredenciais() ||
			this.jaVotaram.contains(eleitor.getRg());
		
		if (condition) return false;
		
		Candidato vereador = this.acharCandidato(1, "", codVereador);
		if (vereador == null) return false;
		
		Candidato prefeito = this.acharCandidato(2, "", codPrefeito);
		if (prefeito == null) return false;
		
		Voto voto = new Voto (vereador, prefeito, eleitor);
		vereador.acrescentarVotos();
		prefeito.acrescentarVotos();
		
		this.votos.add(voto);
		this.jaVotaram.add(voto.getEleitor().getRg());
		return true;
	}
	
	public Candidato acharCandidato (int cargo, String rg, int codigo) {
		Iterator<Candidato> iterator;
		
		if (cargo == 2) {
			iterator = this.candidatosAPrefeito.iterator();
		} else {
			iterator = this.candidatosAVereador.iterator();
		}
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (candidato.getRg().equals(rg)) {
				return candidato;
			}
			if (candidato.getCodigo() == codigo) {
				return candidato;
			}
		}
		return null;
	}
	
	public boolean adicionarCandidato (Candidato candidato) {		
		if (!candidato.verificarCredenciais()) return false;
		
		Candidato temp = this.acharCandidato(
			candidato.getCargo(),
			candidato.getRg(),
			candidato.getCodigo()
		);
		
		if (temp != null) return false;
		
		
		if (candidato.getCargo() == 1) {
			this.candidatosAVereador.add(candidato);
		} else {
			this.candidatosAPrefeito.add(candidato);
		}
		
		return true;
	}
}
