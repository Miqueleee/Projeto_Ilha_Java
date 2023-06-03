public class R_Andador extends Robo{
	
	public R_Andador() {
		super();
		this.nome = "Andador";
		this.id = 1;
	}

	@Override
	public String Simbolo() {
		// TODO Auto-generated method stub
		return "☂";
	}
	@Override
	public void avancar(int numCelulas) {
		posicaoY+=numCelulas;
	}
	@Override
	public void retroceder(int numCelulas) {
		posicaoY-=numCelulas;
	}
}
