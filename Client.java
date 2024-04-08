import java.io.PrintStream;
import java.util.Scanner;

public class Client {
	//public static void main(String[] args) {
		PrintStream pst = System.out;

		private String nome;
		private String sobrenome;
		private String cpf;

		public Client() {}

		public Client(String nome, String sobrenome, String cpf) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.cpf = cpf;
		}

		public void clientPrinter() {
			pst.println("INFORMACOES DO CLIENTE");
			pst.println("NOME: " + this.nome);
			pst.println("SOBRENOME: " + this.sobrenome);
			pst.println("CPF: " + this.cpf);
		}

		public String getNome() {
			return nome;
		}

		public void setName(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
	//}
}
