package app;

public class Candidato extends Eleitor implements IEleitor {
	private int cargo = -1;
	private int votosRecebidos = 0;
	private int codigo = -1;
	
	public Candidato () {}
	
	public Candidato (String nome, String rg, int cargo, int codigo) {
		this.setNome(nome);
		this.setRg(rg);
		this.setCargo(cargo);
		this.setCodigo(codigo);
	}
	
	public int getCargo() {
		return cargo;
	}

	public boolean setCargo(int cargo) {
		if (cargo == 1 || cargo == 2) {
			this.cargo = cargo;
			
			return true;
		} else {
			return false;
		}
	}
	
	public int getVotosRecebidos () {
		return this.votosRecebidos;
	}
	
	public void acrescentarVotos () {
		this.votosRecebidos++;
	}
	
	public int getCodigo () {
		return this.codigo;
	}
	
	public boolean setCodigo (int codigo) {
		if (codigo <= 0) return false;
		this.codigo = codigo;
		return true;
	}
	
	@Override
	public boolean verificarCredenciais () {
		return super.verificarCredenciais() &&
			cargo != -1 &&
			codigo != -1;
	}
}
