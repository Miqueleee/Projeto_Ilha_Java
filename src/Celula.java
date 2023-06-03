import java.util.ArrayList;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public ArrayList<ElementoDeJogo> elementos;//quem está ocupando 
	
	public Celula(int id, int x , int y) {
		this.posicaoX = x;
		this.posicaoY = y;
		this.id = id;
		elementos = new ArrayList<>();
	}
	
	public void adicionar(ElementoDeJogo elemento) {
		this.elementos.add(elemento);
	}
	

	public void desocupar(ElementoDeJogo elementoParaRemover) {
		Marcador marca = new Marcador();
	    if (this.elementos.size() > 0) {
	        for (int i = 0; i < elementos.size(); i++) {
	            if (elementos.get(i) == elementoParaRemover) {
	                elementos.remove(i);
	                if (this.posicaoX != 1 || this.posicaoY != 1) {
	                	if (this.elementos.size() == 0) {
	             	      this.elementos.add(marca);
	                	}
	              }

	                break; // Interrompe o loop após remover o elemento
	                }
	        }
	    }
	}
	

	
	public void desocuparPrimeiroAluno() {
	    if (this.elementos.size() > 0) {
	        elementos.remove(0);
	    }
	    Marcador marca = new Marcador();
	    this.elementos.add(marca);
	    marca.SimboloAluno();
	}
	
	public void desocuparPrimeiroBug() {
	    if (this.elementos.size() > 0) {
	        elementos.remove(0);
	    }
	    Marcador marca = new Marcador();
	    this.elementos.add(marca);
	    marca.SimboloBug();
	}

	
	public String infos() {
		if(elementos.size() > 0) {
			if(elementos.size() > 1) {
				return "[" + this.elementos.size() + "]";
			}else {
				return "[" + this.elementos.get(elementos.size()-1).Simbolo() + "]";
			}
		}else {
			return "[ ]";
		}
	}
}
