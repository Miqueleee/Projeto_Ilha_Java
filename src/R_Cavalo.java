
public class R_Cavalo extends Robo{

	public R_Cavalo() {
		super();
		this.nome = "Cavalo";
		this.id = 5;
	}

	@Override
	public String Simbolo() {
		return "♞";
	}
	@Override
	public void avancar(int numCelulas) {
		if (numCelulas <= 2) {
		posicaoY+=numCelulas;
		posicaoX+=numCelulas;
	} else {
		posicaoY+=2;
		posicaoX+=2;
		}
	}
	@Override
	public void retroceder(int numCelulas) {
		if (numCelulas <= 2) {
			posicaoY+=numCelulas;
			posicaoX-=numCelulas;
		} else {
			posicaoY+=2;
			posicaoX-=2;
			}
	}

}
