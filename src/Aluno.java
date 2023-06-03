public class Aluno implements ElementoDeJogo {
	
	String Simbolo = "x";
	@Override
	public String Simbolo() {
		return this.Simbolo;
	}

	@Override
	public int getValor() {
		return 10;
	}

	@Override
	public int getTipo() {
		return 1; // representa o Aluno
	}

}
