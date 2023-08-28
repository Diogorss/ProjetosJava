package aplicacao;
import entidades.Produto;
import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("***MENU***");
		System.out.println("Selecione 1 para mostrar os dados dos produtos");
		System.out.println("Selecione 2 para adicionar novos produtos");
		System.out.println("Selecione 3 para remover produtos");
		System.out.println("Selecione 4 para sair");

		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Produto produto = new Produto();
		System.out.println("Digite o nome do produto:");
		produto.setnome(sc.next());
		System.out.println("Digite o valor do produto:");
		produto.setvalor(sc.nextDouble());
		System.out.println("Digite a quantidade do produto:");
		produto.setquantidade(sc.nextInt());
		
		do {
			menu();
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Produto: " + produto.getnome());
				System.out.println("Valor: " + produto.getvalor());
				System.out.println("Quantidade em estoque: " + produto.getquantidade());
				break;
				
			case 2:
				System.out.println("Digite o valor de produtos a serem adicionados:");
				produto.setquantidade(produto.getquantidade() +  sc.nextInt());
				
				System.out.println("Quantidade atualizada:");
				System.out.println("Produto: " + produto.getnome());
				System.out.println("Valor: " + produto.getvalor());
				System.out.println("Quantidade em estoque: " + produto.getquantidade());

				break;
				
			case 3:
				System.out.println("Digite o valor de produtos a serem removidos:");
				while(!produto.remocao(sc.nextInt())){
					System.out.println("Digite uma quantidade valida");
				}
				System.out.println("Quantidade atualizada:");
				System.out.println("Produto: " + produto.getnome());
				System.out.println("Valor: " + produto.getvalor());
				System.out.println("Quantidade em estoque: " + produto.getquantidade());
				
				break;
				
			default:
				System.out.println("Digite uma opcao valida");
				break;
			}
		}
		while(opcao != 4);
		
		sc.close();
	}
	

}
