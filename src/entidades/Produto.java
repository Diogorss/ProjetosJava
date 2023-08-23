package entidades;

public class Produto{
	public String nome;
	public double valor;
	public int quantidade;
	public boolean remocao(int qtd){
		if(qtd > quantidade) {
			return false;
		}
		else {
			quantidade -= qtd;
			return true;
		}
	}
}
