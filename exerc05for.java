package repeticoes;
import java.util.Scanner;

public class exerc05for {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		double media;
		
		System.out.println("Digite a quantiade de alunos da sala: ");
		int quantAlunos = input.nextInt();
		
		for(int i = 1; i <= quantAlunos; i++) {
			System.out.println("Digite a nota do aluno "+ i+" : ");
			double notaAluno = input.nextDouble();
			soma = soma + notaAluno;
		}
		media = soma / quantAlunos;
		System.out.println("A media dos alunos da sala e: "+ media);
	}
}
