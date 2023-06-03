
public class R_Bispo extends Robo {

	
	public R_Bispo() {
		super();
		this.nome = "Bispo";
		this.id = 4;
	}

	@Override
	public String Simbolo() {
		return "♗";
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
		posicaoY-=numCelulas;
		posicaoX-=numCelulas;
	} else {
		posicaoY-=2;
		posicaoX-=2;
		}
	}

}
