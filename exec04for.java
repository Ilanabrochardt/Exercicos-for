package repeticoes;
import java.util.Scanner;

public class exec04for {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int x = input.nextInt();

		if (x % 2 == 0) {
			x = x /2;
		}else {
			x = 3 * x +1;
		}
		System.out.println(x);
	}
}
