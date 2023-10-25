
public class Usuario {
	private String nome;
	private String cpf;
	private int numAlugueis;
	
	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.numAlugueis = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumAlugueis() {
		return numAlugueis;
	}

	public void setNumAlugueis(int numAlugueis) {
		this.numAlugueis = numAlugueis;
	}
	
}
