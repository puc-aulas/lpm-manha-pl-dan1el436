
public class Revista extends Item{
	private int materias;
	
	public Revista(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int materias) {
		super(titulo, autor, tipo, anoPublicado, quantidadeTotal, quantidadeDisponivel, avaliacao);
		this.materias = materias;
	}

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}



	
}
