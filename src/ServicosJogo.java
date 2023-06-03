import java.util.ArrayList;
import java.util.Random;

public class ServicosJogo {
	
	public Plano plano;
	public int qtdAlunos;
	public int qtdBugs;
	public int BugsEcontrados= 0;
	public int AlunosSalvos= 0;
		
	public ServicosJogo(Plano plano, int qtdAlunos, int qtdBugs) {
		this.plano = plano;
		this.qtdAlunos = qtdAlunos;
		this.qtdBugs = qtdBugs;
	}

	private int sortearNumero(int min, int max) {
		Random random = new Random();
		
		return random.nextInt((max - min) + 1) + min;
	}
	
	
	
	public ArrayList<int[]> sortearElementosNoPlano() {	
		ArrayList<int[]> posicoesIniciais = new ArrayList<int[]>();
		
		for(int i=1; i<=(this.qtdAlunos + this.qtdBugs); i++) {
			int[] coordenada = new int[3];// Cria vetor de coordenada e tipo de elemento
			
			// Sorteia coodernadas:
			coordenada[0] = sortearNumero(1, this.plano.tamanhoX); 
			coordenada[1] = sortearNumero(1, this.plano.tamanhoY);
			
			//Decide se é aluno ou bug
			if(i <= this.qtdAlunos) {
				coordenada[2] = 1; // 1 Representa aluno
			}else {
				coordenada[2] = 2; // 1 Representa bug
			}

			for(int[] c : posicoesIniciais) {
				while(coordenada[0] == c[0] && coordenada[1] == c[1]) {
					coordenada[0] = sortearNumero(1, this.plano.tamanhoX);
					coordenada[1] = sortearNumero(1, this.plano.tamanhoY);
				}
			}
			
			posicoesIniciais.add(coordenada);
		}
		
		return posicoesIniciais;
	}

	
	
	
	public void povoarPlano() {
		ArrayList<int[]> posicoesIniciais = this.sortearElementosNoPlano();
		
		for (int i = 0; i < posicoesIniciais.size(); i++) {	
			for (int j = 0; j < this.plano.listaCelulas.size(); j++) {	
				if(this.plano.listaCelulas.get(j).posicaoX == posicoesIniciais.get(i)[0]
						&&
					this.plano.listaCelulas.get(j).posicaoY == posicoesIniciais.get(i)[1] ) {
					//Acima verificando se a posicao X e Y da celula do Plano é igual ao do vetor de posicoes randomizado
					
					//Caso seja, abaixo é verificado se ele é Aluno [1] ou Bug [2] e setando o elemento de jogo da celula respectivamente
					if(posicoesIniciais.get(i)[2] == 1) {
						Aluno novoAluno = new Aluno();
						this.plano.listaCelulas.get(j).adicionar(novoAluno); // Ocupar com aluno
					}else if(posicoesIniciais.get(i)[2] == 2) {
						Bug novoBug = new Bug();
						this.plano.listaCelulas.get(j).adicionar(novoBug); // Ocupar com bug
					}
				}
			}
		}
	}

	
	
	
	public void atualizarPosicaoRobo(Robo robo) {
		for (int i = 0; i < this.plano.listaCelulas.size(); i++) {	
			this.plano.listaCelulas.get(i).desocupar(robo);
		}
		
		// Foi encontrado o elemento na lista de celulas e a celula foi desocupada
		for (int i = 0; i < this.plano.listaCelulas.size(); i++) {	
			if(this.plano.listaCelulas.get(i).posicaoX == robo.posicaoX
					&& this.plano.listaCelulas.get(i).posicaoY == robo.posicaoY) {
				this.plano.listaCelulas.get(i).adicionar(robo);
			}
		}
		//Foi encontrado o lugar com o novo X e Y do robo e reposicionado ele 
	}

	
	
	
	public void adicionarRobo(Robo robo) {
		//Ter que criar uma array de elementos de jogo no elemento da celula?
		//Deixar asssim pra testar só um e fazer pro próximos depois
		for (int i = 0; i < this.plano.listaCelulas.size(); i++) {	
			if(this.plano.listaCelulas.get(i).posicaoX == 1
					&& this.plano.listaCelulas.get(i).posicaoY == 1) {
				this.plano.listaCelulas.get(i).adicionar(robo);
			}
		}
	}
	
	
	
	public void verificarColisao(Robo robo) {
	//	Marcador marca = new Marcador();
	//	Aluno aluno = new Aluno();
		for (int i = 0; i < this.plano.listaCelulas.size(); i++) {
			
			if(this.plano.listaCelulas.get(i).posicaoX == robo.posicaoX
					&& this.plano.listaCelulas.get(i).posicaoY == robo.posicaoY) {
				
				for (int j = 0; j < this.plano.listaCelulas.get(i).elementos.size(); j++) {
					if(this.plano.listaCelulas.get(i).elementos.get(j).getTipo() == 1) {
						robo.salvarAluno();
						System.out.println("O " + robo.nome + " salvou um Aluno!\n");
						this.qtdAlunos--;
						this.AlunosSalvos ++;
						this.plano.listaCelulas.get(i).desocuparPrimeiroAluno();	
					
					}else if(this.plano.listaCelulas.get(i).elementos.get(j).getTipo() == 2) {
						robo.atingidoBug();
						this.qtdBugs--;
						this.BugsEcontrados ++;
						System.out.println("O " + robo.nome + " eliminou um BUG!\n");
						this.plano.listaCelulas.get(i).desocuparPrimeiroBug();
							
					}
				}
			}
		}
	}
	

}
