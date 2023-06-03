public class R_Rainha extends Robo {

	public R_Rainha() {
		super();
		this.nome = "Rainha";
		this.id = 7;
	}

	@Override
	public String Simbolo() {
		return "♛";
	}
	@Override
	public void avancar(int numCelulas) {
		if (numCelulas <= 4) {
			posicaoY+=numCelulas;
			posicaoX+=numCelulas;
			} else {
				posicaoY+=4;
				posicaoX+=4;
			}	}
	@Override
	public void retroceder(int numCelulas) {
		if (numCelulas <= 4) {
			posicaoY-=numCelulas;
			posicaoX-=numCelulas;
		} else {
			posicaoY-=4;
			posicaoX-=4;
			}
		}

}
