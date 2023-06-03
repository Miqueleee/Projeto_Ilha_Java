
public class R_Peao extends Robo{

	public R_Peao() {
		super();
		this.nome = "Peao";
		this.id = 2;
	}

	@Override
	public String Simbolo() {
		return "♟";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoX++;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoX--;
	}
}
