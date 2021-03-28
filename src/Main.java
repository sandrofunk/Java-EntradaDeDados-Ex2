import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou o número: " + x);
		
		sc.close();

	}

}
