
public class Revista extends Item{
	private String[] materias;
	

	public Revista(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String[] materias) {
		super(titulo, autor, tipo, anoPublicado, quantidadeTotal, quantidadeDisponivel, avaliacao);
		this.materias = materias;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	
}
