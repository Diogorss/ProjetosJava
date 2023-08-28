package entidades;

public class Produto{
	private String nome;
	private double valor;
	private int quantidade;
	public boolean remocao(int qtd){
		if(qtd > quantidade) {
			return false;
		}
		else {
			quantidade -= qtd;
			return true;
		}
	
	}
	public String getnome(){
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}

	
	public double getvalor() {
		return valor;
	}
	public void setvalor(double valor) {
		this.valor = valor;
	}
	
	public int getquantidade() {
		return quantidade;
	}
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
