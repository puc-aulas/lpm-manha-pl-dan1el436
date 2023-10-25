
public class Cd extends Item implements ItemAlugavel {
	private int musicas;
	private int duracao;
	
	public Cd(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int musicas, int duracao) {
		super(titulo, autor, tipo, anoPublicado, quantidadeTotal, quantidadeDisponivel, avaliacao);
		this.musicas = musicas;
		this.duracao = duracao;
	}

	public int getMusicas() {
		return musicas;
	}

	public void setMusicas(int musicas) {
		this.musicas = musicas;
	}
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public boolean alugar() {
	
		return true;
	}
	
}
