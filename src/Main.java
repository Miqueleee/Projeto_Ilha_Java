import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Olá Jogador(a)! \nInsira seu nome de usuário abaixo:");
		String nome = scan.nextLine();
		System.out.printf("Bem vindo (a): " + nome + ". Vamos montar o Mapa da Ilha!\n");
		System.out.println("Vamos montar o mapa:");
		System.out.printf("Quantas linhas (x):\n ");
		int linhas = scan.nextInt();
		System.out.printf("Quantas Colunas (y):\n ");
		int colunas = scan.nextInt();
		
		Jogo jogo = new Jogo(nome, linhas, colunas);

		
		System.out.printf("Quantos alunos estão perdidos na ilha?\n");
		int alunos = scan.nextInt();
		jogo.setQtdAlunos(alunos);
		System.out.printf("Quantos BUGs estarão aterrorizando a ilha?\n");
		int bugs = scan.nextInt();
		jogo.setQtdBugs(bugs);
		jogo.Jogar();                                                                                                                                                                                                                                                                                                                                                              
	}
}