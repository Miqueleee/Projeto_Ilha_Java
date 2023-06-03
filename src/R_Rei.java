
public class R_Rei extends Robo{

	public R_Rei() {
		super();
		this.nome = "Rei";
		this.id = 6;
	}

	@Override
	public String Simbolo() {
		return "♚";
	}
	@Override
	public void avancar(int numCelulas) {
		if (numCelulas <= 4) {
			posicaoY+=numCelulas;
			posicaoX+=numCelulas;
		} else {
			posicaoY+=4;
			posicaoX+=4;
			}
	}
	
	@Override
	public void retroceder(int numCelulas) {
		if (numCelulas <= 4) {
			posicaoY+=numCelulas;
			posicaoX-=numCelulas;
		} else {
			posicaoY+=4;
			posicaoX-=4;
			}
	}
}
