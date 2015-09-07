
public class carga extends veiculo {
	private double capacidadeCarga;
	public carga(){}
	public carga(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double valor, double capacidadeCarga){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.valorKmRodado=valorKmRodado;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valor=valor;
		this.capacidadeCarga=capacidadeCarga;
	}
	
	public double getCap(){
		return capacidadeCarga;
	}
	public void setCap(double capacidadeCarga){
		this.capacidadeCarga = capacidadeCarga;
	}
}
