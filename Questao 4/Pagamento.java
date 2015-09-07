import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dado = scan.nextLine();
		scan.close();
		System.out.print(dado.replaceAll("[^0-9]*", ""));
		
		

	}

}
