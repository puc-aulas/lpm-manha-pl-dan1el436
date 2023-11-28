import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private String curso;
    private int numAlugueis;
    private List<String> categoriasDeInteresse;
    private List<Item> historicoDeItensAlugados;

    public Usuario(String nome, String cpf, String curso, List<String> categoriasDeInteresse) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.numAlugueis = 0;
        this.categoriasDeInteresse = categoriasDeInteresse;
        this.historicoDeItensAlugados = new ArrayList<>();
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
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNumAlugueis() {
		return numAlugueis;
	}

	public void setNumAlugueis(int numAlugueis) {
		this.numAlugueis = numAlugueis;
	}

	public List<String> getCategoriasDeInteresse() {
		return categoriasDeInteresse;
	}

	public void setCategoriasDeInteresse(List<String> categoriasDeInteresse) {
		this.categoriasDeInteresse = categoriasDeInteresse;
	}
    public void adicionarItemAoHistorico(Item item) {
        historicoDeItensAlugados.add(item);
    }

    public List<Item> obterHistoricoDeItensAlugados() {
        return historicoDeItensAlugados;
    }
	
}
