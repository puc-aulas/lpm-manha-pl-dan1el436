import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private ArrayList <Usuario> usuarios;
	private ArrayList <Item> itens;
	
	Scanner scan = new Scanner(System.in);
	
	public Biblioteca() {
		this.usuarios = new ArrayList<Usuario>();
		this.itens = new ArrayList<Item>();
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public void adicionarUsuario (String nome, String cpf) {
		Usuario novoUsuario = new Usuario(nome, cpf);
		this.usuarios.add(novoUsuario);
	}
	
	public void listarUsuarios() {
		System.out.println("Usuarios:");
		for (int i = 0;i<this.usuarios.size();i++) {
			System.out.println(i+1 +": "+ this.usuarios.get(i).getNome());
		}
		System.out.println("-----------------------");
	}
	
	public void adicionarRevista (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal, int quantidadeDisponivel,
			int avaliacao, String[] materias) {
		Item novoItem = new Revista(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,materias);
		this.itens.add(novoItem);
	}
	public void adicionarTese (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String assunto, String sinopse) {
		Item novoItem = new Tese(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,assunto,sinopse);
		this.itens.add(novoItem);
	}
	public void adicionarDvd (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int duracao, String genero) {
		Item novoItem = new Dvd(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,duracao,genero);
		this.itens.add(novoItem);
	}
	public void adicionarCd (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String[] musicas, int duracao) {
		Item novoItem = new Cd(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,musicas,duracao);
		this.itens.add(novoItem);
	}
	public void adicionarLivro (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String genero, String sinopse) {
		Item novoItem = new Livro(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,genero,sinopse);
		this.itens.add(novoItem);
	}
	public void listarItens() {
		System.out.println("Voce gostaria de filtrar o catalogo?");
		System.out.println("1) Sim");
		System.out.println("2) Nao");
		int key = scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Como?");
			System.out.println("1) Titulo");
			System.out.println("2) Autor");
			System.out.println("3) Ano");
			switch (key) {
			case 1:
				System.out.println("Itens:");
				for (int i = 0;i<this.itens.size();i++) {
					System.out.println(i+1 +": "+ this.itens.get(i).getTitulo());
				}
				System.out.println("-----------------------");
				break;
			case 2:
				System.out.println("Itens:");
				for (int i = 0;i<this.itens.size();i++) {
					System.out.println(i+1 +": "+ this.itens.get(i).getAutor());
				}
				System.out.println("-----------------------");
				break;
			case 3:
				System.out.println("Itens:");
				for (int i = 0;i<this.itens.size();i++) {
					System.out.println(i+1 +": "+ this.itens.get(i).getAnoPublicado());
				}
				System.out.println("-----------------------");
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("Itens:");
			for (int i = 0;i<this.itens.size();i++) {
				System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
			}
			System.out.println("-----------------------");
			break;
		default:
			break;
		}

	}
}
