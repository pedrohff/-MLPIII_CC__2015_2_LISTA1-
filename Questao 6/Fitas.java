
public abstract class Fitas {
	private String titulo;
	private double preco;
	
	public Fitas(){}
	
	public Fitas(String titulo, double preco){
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
}
