
public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private boolean ligado=false;
	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima){
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String getCor(){
		return cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}

	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public double getVelocidadeAtual(){
		return velocidadeAtual;
	}
	
	public void setVelocidadeAtual(double velocidadeAtual){
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(double velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar(){
		if(ligado == false)
			ligado = true;
	}
	
	public void acelerar(double velocidade, double velocidadeAtual, double velocidadeMaxima){
		if(ligado == false)
			System.out.printf("O carro esta desligado\n");
		else{
			double vAtualizada = velocidadeAtual + velocidade;
			if(vAtualizada>velocidadeMaxima)
				System.out.printf("Velocidade maxima excedida\n");
			else
				System.out.printf("Velocidade aumentada para %f", vAtualizada);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
