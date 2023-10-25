
public abstract class Item {
	private String titulo;
	private String autor;
	private String tipo;
	private String anoPublicado;
	private int quantidadeTotal;
	private int quantidadeDisponivel;
	private int avaliacao;
	
	public Item(String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal, int quantidadeDisponivel,
			int avaliacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
		this.anoPublicado = anoPublicado;
		this.quantidadeTotal = quantidadeTotal;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.avaliacao = avaliacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(String anoPublicado) {
		this.anoPublicado = anoPublicado;
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}



}
