import java.io.PrintStream;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);

		pst.println("INFORME OS DADOS DO CLIENTE");
		
		pst.print("NOME: ");
		String nome = input.nextLine();

		pst.print("INFORME O SOBRENOME: ");
		String sobrenome = input.nextLine();

		pst.println("NOME INFORMADO: " + nome);
		pst.println("SOBRENOME: " + sobrenome);
	}
}
