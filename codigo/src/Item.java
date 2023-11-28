
public abstract class Item implements Comparable<Item>{
	private String titulo;
	private String autor;
	private String tema;
	private String tipo;
	private String anoPublicado;
	private int quantidadeTotal;
	private int quantidadeDisponivel;
	private int avaliacao;
	private double pontuacao;
	
	public Item(String titulo, String autor, String tema, String tipo, String anoPublicado, int quantidadeTotal, int quantidadeDisponivel,
			int avaliacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		this.tipo = tipo;
		this.anoPublicado = anoPublicado;
		this.quantidadeTotal = quantidadeTotal;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.avaliacao = avaliacao;
		this.pontuacao = 0;
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
	
	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
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

    public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

    @Override
    public int compareTo(Item outroItem) {
        return Double.compare(outroItem.getPontuacao(), this.getPontuacao());
    }

}
