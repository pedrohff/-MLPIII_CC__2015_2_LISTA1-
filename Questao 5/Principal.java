import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Data d = new Data();
		
		System.out.printf("Dia: ");
		int a = scan.nextInt();
		System.out.printf("Mes: ");
		int b = scan.nextInt();
		System.out.printf("Ano: ");
		int c = scan.nextInt();
	
		
		d.setDia(a);
		d.setMes(b);
		d.setAno(c);
		
		
		if(d.getAno()!=0 && d.getMes()!=0 && d.getDia()!=0)
			System.out.println(d);
		
	}
}