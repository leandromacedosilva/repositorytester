import java.io.PrintStream;
import java.util.Scanner;

//import Client.java;

public class MainClient {
	public static void main(String[] args) {

		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);

		pst.println("INFORME OS DADOS DO CLIENTE");

		pst.print("NOME: ");
		String nome = input.nextLine();

		pst.print("SOBRENOME: ");
		String sobrenome = input.nextLine();

		pst.print("CPF: ");
		String cpf = input.nextLine();

		Client client = new Client(nome, sobrenome, cpf);
		client.clientPrinter();

	}
}
