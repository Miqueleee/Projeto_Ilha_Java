
public class Marcador implements ElementoDeJogo{
	
	String Simbolo = "⊗";
@Override
public String Simbolo() {
	return this.Simbolo;
}

@Override
public int getValor() {
	return 0;
}

@Override
public int getTipo() {
	return 99;
}
	public String SimboloBug() {
		Simbolo = "☿";
		return Simbolo;
	}
	
	public String SimboloAluno() {
		Simbolo = "☺";
		return Simbolo;
	}
}