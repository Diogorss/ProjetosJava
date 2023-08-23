package aplicacao;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op;
		do {
			System.out.println("****MENU****");
			System.out.println("1 - Primos");
			System.out.println("2 - Perfeitos");
			System.out.println("3 - Amigos");
			System.out.println("4- Sair");
			System.out.println("Qual a sua opcao?");
			op = sc.nextInt();
			switch(op){
			case 1: System.out.println("Informe um numero: ");
			n1 = sc.nextInt();
			boolean primo = primos(n1);
			if(primo == true) {
				System.out.println("Numero e Primo");
			}
			else {
				System.out.println("O numero nao e primo");
			}
			break;
			case 2: System.out.println("Informe um numero: ");
			n1 = sc.nextInt();
			boolean perfeito = perfeitos(n1);
			if(perfeito == true) {
				System.out.println("O numero e perfeito");
			}
			else {
				System.out.println("O numero nao e perfeito");
			}
			break;
			case 3: System.out.println("Informe o primeiro numero:");
			n1 = sc.nextInt();
			System.out.println("Informe o segundo numero");
			n2 = sc.nextInt();
			boolean amigo = amigos(n1, n2);
			if(amigo == true) {
				System.out.println("Os numeros sao amigos");
			}
			else {
				System.out.println("Os numeros nao sao amigos");
			}
			break;
			default:
				System.out.println("Selecione uma opcao valida: ");
				
				
				
;			}
		} while(op != 4);
		
	}
	public static boolean primos(int n){
		int div = 1, total = 0;
		for(div = 1; div <= n; div++) {
			if(n % div == 0) {
				total++;
			}
		}
		if(total <= 2) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	
	public static boolean perfeitos(int n) {
		int soma = somaDivisores(n);
		if(soma == n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int somaDivisores(int n){
		int div = 1, soma = 0;
		for(div = 1; div <n; div++) {
			if(n %div == 0) {
				soma=+div;
			}
		}
		return soma;
	}
	
	public static boolean amigos(int n1, int n2) {
		int soma1 = somaDivisores(n1);
		int soma2 = somaDivisores(n2);
		if((soma1 == n2) && (soma2 == n1)) {
			return true;
		}
		else {
			return false;
		}
	}
}

