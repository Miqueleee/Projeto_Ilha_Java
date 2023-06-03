public class Bug implements ElementoDeJogo {

	
	public Bug() {
		super();
	}

	@Override
	public String Simbolo() {
		return "b";
	}

	@Override
	public int getValor() {
		return -15;
	}

	@Override
	public int getTipo() {
		return 2; // representa o Bug
	}

}
