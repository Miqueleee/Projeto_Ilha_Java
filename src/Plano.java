import java.util.ArrayList;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	int tamanhoX;
	int tamanhoY;

	public Plano(int tamanhoX, int tamanhoY) {
		
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		
	}

	
	public void montarPlano() {
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int j = tamanhoY; j >= 1; j--) {
			for (int i = 1; i <= tamanhoX; i++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}
	
	public void desenharPlano() {
		int cont = 0;
		
		for (int i = 0; i < this.tamanhoY; i++) {
			for(int j = 0; j < this.tamanhoX; j++) {
				System.out.print(listaCelulas.get(cont).infos());
				cont++;
			}
			System.out.println();
		}
	}
	


}
