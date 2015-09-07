
public class veiculo {

	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKmRodado;
	protected double kmInicial;
	protected double kmFinal;
	protected double valor;
	
	public veiculo(){}
	
	public veiculo(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double valor){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.valorKmRodado=valorKmRodado;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valor=valor;
	}
	/*------------------------------------------*/
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa=placa;
	}
	/*------------------------------------------*/
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	/*------------------------------------------*/
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	/*------------------------------------------*/
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	/*------------------------------------------*/
	public double getVKR(){
		return valorKmRodado;
	}
	public void setVKR(double valorKmRodado){
		this.valorKmRodado = valorKmRodado;
	}
	/*------------------------------------------*/
	public double getKmInicial(){
		return kmInicial;
	}
	public void setKmInicial(double kmInicial){
		this.kmInicial = kmInicial;
	}
	/*------------------------------------------*/
	public double getKmFinal(){
		return kmFinal;
	}
	public void setKmFinal(double kmFinal){
		this.kmFinal = kmFinal;
	}
	/*------------------------------------------*/               
	public double getValor(){
		return valor;
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double valorLocacao(double kmInicial, double kmFinal, double valorKmRodado){
		return (kmInicial-kmFinal)*valorKmRodado;
	}
	
}
