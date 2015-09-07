
public class passeio extends veiculo{
	public boolean ar;
	public int portas;
	
	public passeio(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double valor, boolean ar, int portas){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.valorKmRodado=valorKmRodado;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valor=valor;
		this.ar=ar;
		this.portas=portas;
	}
	
	public boolean getAr(){
		return ar;
	}
	public void setAr(boolean ar){
		this.ar =ar;
	}
	
	public int getPortas(){
		return portas;
	}
	public void setPortas(int portas){
		this.portas=portas;
	}
}
