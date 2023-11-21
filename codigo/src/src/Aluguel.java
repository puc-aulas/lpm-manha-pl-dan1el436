
public class Aluguel {
	private Usuario usuario;
	private Item item;
	private String data;
	
	public Aluguel(Usuario usuario, Item item, String data) {
		this.usuario = usuario;
		this.item = item;
		this.data= data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
