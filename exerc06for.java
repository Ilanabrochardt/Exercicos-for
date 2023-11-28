package repeticoes;

public class exerc06for {
	public static void main(String[] args) {
		int soma = 0;
		int somaMultiplo3 = 0;
		int somaMultiplo5 = 0;
		
		for(int i = 1; i <= 20; i++) {
			soma = soma + i;
			if(i % 3 == 0) {
				somaMultiplo3 = somaMultiplo3 + i;
			}
			if(i % 5 == 0) {
				somaMultiplo5 = somaMultiplo5 +i;
			}
		}
		System.out.println("A soma dos numeros entre 1 a 20 e: "+ soma);
		System.out.println("A soma dos numeros nesse intervalo multiplos de 3 e: "+ somaMultiplo3);
		System.out.println("A soma dos numeros nesse intervalo multiplos de 5 e: "+ somaMultiplo5);
	}
}
