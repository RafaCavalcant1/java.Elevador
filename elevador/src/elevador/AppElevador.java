package elevador;

public class AppElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(1,10,10,1000,0,true);

		elevador.receberPessoa(50);
		
		System.out.println(elevador.getCargaAtual());
		System.out.println(elevador.getVagasDisponiveis());
	}

}
