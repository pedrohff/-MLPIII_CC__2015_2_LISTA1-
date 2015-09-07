
public class Lancamento extends Fitas{
	 private double preco;
	 
	 public double getPreco(){
			return preco;
	 }
		
	 public void setPreco(double preco){
		 this.preco = preco+(preco*0.2);
	 }
}
