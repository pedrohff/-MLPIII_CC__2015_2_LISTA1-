
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia(){
		return dia;
	}
	
	public void setDia(int dia){
		if(dia<1 || dia>31){
			System.out.printf("Dia Invalido\n");
			return;
		}else
			this.dia = dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public void setMes(int mes){
		if(mes<1 || mes>12){
			System.out.printf("Mes Invalido\n");
			return;
		}else
			this.mes = mes;
	}

	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		if(ano<1 || ano>3000){
			System.out.printf("Ano Invalido\n");
			return;
		}else
			this.ano = ano;
	}
	
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}