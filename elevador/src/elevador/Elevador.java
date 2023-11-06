package elevador;

public class Elevador {

	private int idElevador;
	private int vagasTotais;
	private int vagasDisponiveis;
	private double cargaLimite;
	private double cargaAtual;
	private boolean disponivel;
	
	public Elevador(int idElevador, int vagasTotais, int vagasDisponiveis, double cargaLimite, double cargaAtual,
			boolean disponivel	) {
		this.idElevador = idElevador;
		this.vagasTotais = vagasTotais;
		this.vagasDisponiveis = vagasDisponiveis;
		this.cargaLimite = cargaLimite;
		this.cargaAtual = cargaAtual;
		this.disponivel= disponivel;
	}
	

	public int getIdElevador() {
		return idElevador;
	}

	public int getVagasTotais() {
		return vagasTotais;
	}

	public int getVagasDisponiveis() {
		return vagasDisponiveis;
	}

	public double getCargaLimite() {
		return cargaLimite;
	}

	public double getCargaAtual() {
		return cargaAtual;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public boolean receberPessoa(double peso) {
		if(this.disponivel == true) {
			this.vagasDisponiveis --;
			this.cargaAtual += peso;
		
			if(this.cargaAtual>= this.cargaLimite || this.vagasDisponiveis==0){
				this.disponivel=false;
			}
			return true;
		}
			return false;
		
	}
}	
