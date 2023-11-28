package repeticoes;

public class exercForControlandoloop01 {
	public static void main(String[] args) {
		
		for(int i =0; i < 10; i++) {
			System.out.print("ola! ");
		}
		System.out.println("\n");
		int x = 2;
		int y = 22;
		for(int i = x; i < y; i++) {
			if(i % 19 == 0) {
				System.out.println("Achei um divisivel por 19 entre " + x + " e "+ y+" que e " + i);
				break;
			}
		}
	}
}
