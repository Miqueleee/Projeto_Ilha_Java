
public class R_Torre extends Robo{

	
	public R_Torre() {
		super();
		this.nome = "Torre";
		this.id = 3;
	}

	@Override
	public String Simbolo() {
		// TODO Auto-generated method stub
		return "♜";
	}
	@Override
	public void avancar(int numCelulas) {
		if (numCelulas <= 2) {
		posicaoY += numCelulas;
	} else {
		posicaoY+=2;

	}
	}
	@Override
	public void retroceder(int numCelulas) {
		if (numCelulas <= 2) {
		posicaoY-= numCelulas;
	} else {
		posicaoY-= numCelulas;}
	}
}
