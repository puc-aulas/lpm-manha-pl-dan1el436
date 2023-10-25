
public class Dvd extends Item implements ItemAlugavel {
	
	private int duracao;
	private String genero;

	
	public Dvd(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int duracao, String genero) {
		super(titulo, autor, tipo, anoPublicado, quantidadeTotal, quantidadeDisponivel, avaliacao);
		this.duracao = duracao;
		this.genero = genero;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public void alugar() {
		// TODO Auto-generated method stub
		
	}
}
