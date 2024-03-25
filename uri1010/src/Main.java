import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPecaUm = sc.nextInt();
		int numeroPecaUm = sc.nextInt();
		double valorPecaUm = sc.nextDouble();
		
		int codigoPecaDois = sc.nextInt();
		int numeroPecaDois = sc.nextInt();
		double valorPecaDois = sc.nextDouble();
		
		
		double total = (numeroPecaUm * valorPecaUm) + (numeroPecaDois * valorPecaDois);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		sc.close();
	}
}
