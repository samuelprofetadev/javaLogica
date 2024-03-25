import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGastoHora = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double quantidadeLitros = (double) (tempoGastoHora * velocidadeMedia) / 12;
		
		System.out.printf("%.3f%n", quantidadeLitros);
		
		sc.close();
		
	}

}
