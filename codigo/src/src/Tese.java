
public class Tese extends Item{
	private String assunto;
	private String sinopse;


	public Tese(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String assunto, String sinopse) {
		super(titulo, autor, tipo, anoPublicado, quantidadeTotal, quantidadeDisponivel, avaliacao);
		this.assunto = assunto;
		this.sinopse = sinopse;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

}
