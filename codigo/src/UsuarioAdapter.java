	public class UsuarioAdapter implements UsuarioAdaptado {
	    private Usuario usuario;
	    private String[] categoriasDeInteresse;

	    public UsuarioAdapter(Usuario usuario, String[] categoriasDeInteresse) {
	        this.usuario = usuario;
	        this.categoriasDeInteresse = categoriasDeInteresse;
	    }

	    // Implementação do método da interface
	    @Override
	    public String[] getCategoriasDeInteresse() {
	        return categoriasDeInteresse;
	    }

	    // Métodos delegados da classe Usuario
	    public String getNome() {
	        return usuario.getNome();
	    }

	    public void setNome(String nome) {
	        usuario.setNome(nome);
	    }

	    public String getCpf() {
	        return usuario.getCpf();
	    }

	    public void setCpf(String cpf) {
	        usuario.setCpf(cpf);
	    }

	    public String getCurso() {
	        return usuario.getCurso();
	    }

	    public void setCurso(String curso) {
	        usuario.setCurso(curso);
	    }

	    public int getNumAlugueis() {
	        return usuario.getNumAlugueis();
	    }

	    public void setNumAlugueis(int numAlugueis) {
	        usuario.setNumAlugueis(numAlugueis);
	    }
	}