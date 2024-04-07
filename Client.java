import java.io.PrintStream;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);

		pst.println("INFORME OS DADOS DO CLIENTE");
		
		pst.print("NOME: ");
		String nome = input.nextLine();

		pst.println("NOME INFORMADO: " + nome);
	}
}
