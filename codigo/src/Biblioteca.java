import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {
	private ArrayList <Usuario> usuarios;
	private ArrayList <Item> itens;
	private ArrayList <Item> itensAlugaveis;
	private ArrayList <Aluguel> alugueis;
	Scanner scan = new Scanner(System.in);
	
	public Biblioteca() {
		this.usuarios = new ArrayList<Usuario>();
		this.itens = new ArrayList<Item>();
		this.alugueis = new ArrayList<Aluguel>();
		this.itensAlugaveis = new ArrayList<Item>();
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
	public ArrayList <Aluguel> getAlugueis() {
		return alugueis;
	}
	public void setAlugueis(ArrayList <Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	public ArrayList<Item> getItensAlugaveis() {
		return itensAlugaveis;
	}
	public void setItensAlugaveis(ArrayList<Item> itensAlugaveis) {
		this.itensAlugaveis = itensAlugaveis;
	}
	
	public void adicionarUsuario (String nome, String cpf) {
		Usuario novoUsuario = new Usuario(nome, cpf);
		this.usuarios.add(novoUsuario);
	}
	public void criarUsuario() {
		int chave = 0;
		while (chave!=2) {
			System.out.println("Voce gostaria de adicionar um novo usuario?");
			System.out.println("1) Sim");
			System.out.println("2) Nao");
			chave = scan.nextInt();
			switch (chave) {
			case 1:
				System.out.println("Insira o nome");
				String nome = scan.next();
				System.out.println("Insira o cpf");
				String cpf = scan.next();
				adicionarUsuario(nome, cpf);
				break;

			default:
				break;
			}
		}
	}
	public void removerUsuario() {
		int key = 0;
		while (key!=2) {
			System.out.println("Voce gostaria de remover um Cliente?");
			System.out.println("1) Sim");
			System.out.println("2) Nao");
			key = scan.nextInt();
			switch (key) {
			case 1:
				System.out.println("Qual o Cliente?");
				for (int i = 0;i<this.usuarios.size();i++) {
					System.out.println(i+1+": "+ this.usuarios.get(i).getNome());
				}
				System.out.println("-----------------------");
				key = scan.nextInt();
				this.usuarios.remove(key-1);
				System.out.println("Cliente: "+ key+" Removido!");
				}
		}
}
	public void listarUsuarios() {
		System.out.println("Usuarios:");
		for (int i = 0;i<this.usuarios.size();i++) {
			System.out.println(i+1 +": "+ this.usuarios.get(i).getNome());
		}
		System.out.println("-----------------------");
	}
	
	public void adicionarRevista (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal, int quantidadeDisponivel,
			int avaliacao, int materias) {
		Item novoItem = new Revista(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,materias);
		this.itens.add(novoItem);
	}
	public void criarRevista() {
		System.out.println("Insira o Titulo");
		String tituloItem = scan.next();
		System.out.println("Insira o Autor");
		String autorItem = scan.next();
		String tipoItem = "Revista";
		System.out.println("Insira o Ano Publicado");
		String anoItem = scan.next();
		System.out.println("Insira o Quantidade Total");
		int quantTotalItem = scan.nextInt();
		int quantDispItem = quantTotalItem;
		System.out.println("Insira a Avaliacao");
		int avaliacaoItem = scan.nextInt();
		System.out.println("Insira a Quantidade de Materias");
		int quantMateriasItem = scan.nextInt();
		adicionarRevista(tituloItem, autorItem, tipoItem, anoItem, quantTotalItem, quantDispItem, avaliacaoItem, quantMateriasItem);
	}
	public void adicionarTese (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String assunto, String sinopse) {
		Item novoItem = new Tese(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,assunto,sinopse);
		this.itens.add(novoItem);
	}
	public void criarTese() {
		System.out.println("Insira o Titulo");
		String tituloItem = scan.next();
		System.out.println("Insira o Autor");
		String autorItem = scan.next();
		String tipoItem = "Tese";
		System.out.println("Insira o Ano Publicado");
		String anoItem = scan.next();
		System.out.println("Insira o Quantidade Total");
		int quantTotalItem = scan.nextInt();
		int quantDispItem = quantTotalItem;
		System.out.println("Insira a Avaliacao");
		int avaliacaoItem = scan.nextInt();
		System.out.println("Insira a Sinopse da Tese?");
		String sinopseItem = scan.next();
		System.out.println("Insira o Assunto");
		String assuntoItem = scan.next();
		adicionarTese(tituloItem, autorItem, tipoItem, anoItem, quantTotalItem, quantDispItem, avaliacaoItem, assuntoItem, sinopseItem);
	}
	public void adicionarDvd (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int duracao, String genero) {
		Item novoItem = new Dvd(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,duracao,genero);
		this.itens.add(novoItem);
		this.itensAlugaveis.add(novoItem);
	}
	public void criarDvd() {
		System.out.println("Insira o Titulo");
		String tituloItem = scan.next();
		System.out.println("Insira o Autor");
		String autorItem = scan.next();
		String tipoItem = "Dvd";
		System.out.println("Insira o Ano Publicado");
		String anoItem = scan.next();
		System.out.println("Insira o Quantidade Total");
		int quantTotalItem = scan.nextInt();
		int quantDispItem = quantTotalItem;
		System.out.println("Insira a Avaliacao");
		int avaliacaoItem = scan.nextInt();
		System.out.println("Insira a Duracao do Dvd?");
		int duracaoItem = scan.nextInt();
		System.out.println("Insira o Genero");
		String generoItem = scan.next();
		adicionarDvd(tituloItem, autorItem, tipoItem, anoItem, quantTotalItem, quantDispItem, avaliacaoItem, duracaoItem, generoItem);
	}
	public void adicionarCd (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, int musicas, int duracao) {
		Item novoItem = new Cd(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,musicas,duracao);
		this.itens.add(novoItem);
		this.itensAlugaveis.add(novoItem);
	}
	public void criarCd(){
		System.out.println("Insira o Titulo");
		String tituloItem = scan.next();
		System.out.println("Insira o Autor");
		String autorItem = scan.next();
		String tipoItem = "Cd";
		System.out.println("Insira o Ano Publicado");
		String anoItem = scan.next();
		System.out.println("Insira o Quantidade Total");
		int quantTotalItem = scan.nextInt();
		System.out.println("Insira a Avaliacao");
		int avaliacaoItem = scan.nextInt();
		System.out.println("Insira Quantas Musicas");
		int quantMusicasItem = scan.nextInt();
		System.out.println("Insira a Duracao do CD?");
		int duracaoItem = scan.nextInt();
		adicionarCd(tituloItem, autorItem, tipoItem, anoItem, quantTotalItem, quantTotalItem, avaliacaoItem, quantMusicasItem, duracaoItem);
	}
	public void adicionarLivro (String titulo, String autor, String tipo, String anoPublicado, int quantidadeTotal,
			int quantidadeDisponivel, int avaliacao, String genero, String sinopse) {
		Item novoItem = new Livro(titulo, autor,tipo,anoPublicado,quantidadeTotal,quantidadeDisponivel,avaliacao,genero,sinopse);
		this.itens.add(novoItem);
		this.itensAlugaveis.add(novoItem);
	}
	public void criarLivro() {
		System.out.println("Insira o Titulo");
		String tituloItem = scan.next();
		System.out.println("Insira o Autor");
		String autorItem = scan.next();
		String tipoItem = "Livro";
		System.out.println("Insira o Ano Publicado");
		String anoItem = scan.next();
		System.out.println("Insira o Quantidade Total");
		int quantTotalItem = scan.nextInt();
		int quantDispItem = quantTotalItem;
		System.out.println("Insira a Avaliacao");
		int avaliacaoItem = scan.nextInt();
		System.out.println("Insira a Sinopse do Livro?");
		String sinopseItem = scan.next();
		System.out.println("Insira o Genero");
		String generoItem = scan.next();
		adicionarLivro(tituloItem, autorItem, tipoItem, anoItem, quantTotalItem, quantDispItem, avaliacaoItem, generoItem, sinopseItem);
	}
	public void criarItem() {
		int key = 0;
		while (key!=2) {
			System.out.println("Voce gostaria de adicionar um novo item?");
			System.out.println("1) Sim");
			System.out.println("2) Nao");
			key = scan.nextInt();
			switch (key) {
			case 1:
				System.out.println("Qual o tipo de item?");
				System.out.println("1) Cd");
				System.out.println("2) Dvd");
				System.out.println("3) Livro");
				System.out.println("4) Revista");
				System.out.println("5) Tese");
				
				key = scan.nextInt();
				switch (key) {
				case 1:
					criarCd();
					break;
				case 2:
					criarDvd();
					break;
				case 3:
					criarLivro();
					break;
				case 4:
					criarRevista();
					break;
				case 5:
					criarTese();
					break;
				default:
					break;
				}
				}
		}
	}
		public void removerItem() {
			int key = 0;
			while (key!=2) {
				System.out.println("Voce gostaria de remover um item?");
				System.out.println("1) Sim");
				System.out.println("2) Nao");
				key = scan.nextInt();
				switch (key) {
				case 1:
					System.out.println("Qual o item?");
					for (int i = 0;i<this.itens.size();i++) {
						System.out.println(i+1 +": "+ this.itens.get(i).getTitulo());
					}
					System.out.println("-----------------------");
					key = scan.nextInt();
					this.itens.remove(key-1);
					System.out.println("Item: "+ key+" Removido!");
					}
			}
	}
	public void listarItens() {
		System.out.println("Voce gostaria de resumir as informacoes do catalogo?");
		System.out.println("1) Sim");
		System.out.println("2) Nao");
		int key = scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Como?");
			System.out.println("1) Titulo");
			System.out.println("2) Autor");
			System.out.println("3) Ano");
			key = scan.nextInt();
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
			System.out.println("Voce gostaria de filtrar ou organizar o catalogo?");
			System.out.println("1) Sim");
			System.out.println("2) Nao");
			key = scan.nextInt();
			switch (key) {
			case 1:
				System.out.println("Como?");
				System.out.println("1) Alfabetica");
				System.out.println("2) Autor");
				System.out.println("3) Ano");
				System.out.println("4) Tipo");
				key = scan.nextInt();
				switch (key) {
				case 1:
					System.out.println("Itens:");
					String[] ordemAlfabetica = new String[itens.size()];
					
					for (int i = 0;i<this.itens.size();i++) {
						ordemAlfabetica[i] = this.itens.get(i).getTitulo();
					}
					Arrays.sort(ordemAlfabetica);
					for (int i = 0;i<this.itens.size();i++) {
						System.out.println(i+1 +": "+ ordemAlfabetica[i]);
					}
					System.out.println("-----------------------");
					break;
				case 2:
					System.out.println("Qual o nome do autor?");
					String nomeAutor = scan.next();
					System.out.println("Itens:");
					for (int i = 0;i<this.itens.size();i++) {
						if(nomeAutor.equals(this.itens.get(i).getAutor())) {
							System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
						}
					}
					System.out.println("-----------------------");
					break;
				case 3:
					System.out.println("Qual o Ano Publicado?");
					String data = scan.next();
					System.out.println("Itens:");
					for (int i = 0;i<this.itens.size();i++) {
						if(data.equals(this.itens.get(i).getAnoPublicado())) {
							System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
					}
					}
					System.out.println("-----------------------");
					break;
				default:
					System.out.println("Qual o tipo de item?");
					System.out.println("1) Cd");
					System.out.println("2) Dvd");
					System.out.println("3) Livro");
					System.out.println("4) Revista");
					System.out.println("5) Tese");
					
					key = scan.nextInt();
					switch (key) {
					case 1:
						for (int i = 0;i<this.itens.size();i++) {
							if(this.itens.get(i).getTipo().equals("Cd")) {
								System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
							}
						}
						break;
					case 2:
						for (int i = 0;i<this.itens.size();i++) {
							if(this.itens.get(i).getTipo().equals("Dvd")) {
								System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
							}
						}
						break;
					case 3:
						for (int i = 0;i<this.itens.size();i++) {
							if(this.itens.get(i).getTipo().equals("Livro")) {
								System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
							}
						}
						break;
					case 4:
						for (int i = 0;i<this.itens.size();i++) {
							if(this.itens.get(i).getTipo().equals("Revista")) {
								System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
							}
						}
						break;
					case 5:
						for (int i = 0;i<this.itens.size();i++) {
							if(this.itens.get(i).getTipo().equals("Tese")) {
								System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
							}
						}
						break;
					default:
						break;
					}
					break;
				}
				break;

			default:
				System.out.println("Itens:");
				for (int i = 0;i<this.itens.size();i++) {
					System.out.println(i+1 +": "+ this.itens.get(i).getTitulo()+", "+ this.itens.get(i).getAutor()+", "+ this.itens.get(i).getTipo()+", " + this.itens.get(i).getAnoPublicado()+", Avaliacao("+this.itens.get(i).getAvaliacao()+")");
				}
				System.out.println("-----------------------");
				break;
			}
		default:
			break;
		}

	}
	public void adicionarAluguel(Usuario usuario, Item item, String data) {
		Aluguel aluguel = new Aluguel(usuario,item,data);
		this.alugueis.add(aluguel);
	}
	public void criarAluguel() {
		int key = 0;
		System.out.println("Qual Cliente Esta Realizando o Aluguel?");
		for (int i = 0;i<this.usuarios.size();i++) {
			System.out.println(i+1+": "+ this.usuarios.get(i).getNome());
		}
		System.out.println("-----------------------");
		key = scan.nextInt();
		Usuario usuario = this.usuarios.get(key-1);
		if(usuario.getNumAlugueis()<3) {
		System.out.println("Qual Item Gostaria de Alugar?");
			for (int i = 0;i<this.itensAlugaveis.size();i++) {
				System.out.println(i+1+": "+ this.itensAlugaveis.get(i).getTitulo());
			}
			System.out.println("-----------------------");
			key = scan.nextInt();
			Item item = this.itensAlugaveis.get(key-1);
			if(item.getQuantidadeDisponivel()>1) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now(); 
		String data = dtf.format(now);
		adicionarAluguel(usuario, item, data);
		usuario.setNumAlugueis(usuario.getNumAlugueis()+1);
		item.setQuantidadeDisponivel(item.getQuantidadeDisponivel()-1);
		System.out.println("Alugado com sucesso!");
		System.out.println(" Usuario: " +usuario.getNome()+" Item: "+ item.getTitulo()+" Data: " + data);
		}else {
			System.out.println("Este item ja realizou o maximo de alugueis!");
		}
		}else {
			System.out.println("Este usuario ja realizou o maximo de alugueis!");
		}
	}
	public void listarAlugueis() {
		int key = 0;
		System.out.println("Voce Gostaria de Ver o Historico de Alugueis?");
		System.out.println("1) Sim");
		System.out.println("2) Nao");
		key = scan.nextInt();
		switch (key) {
		case 1:
			if(alugueis.isEmpty()) {
				System.out.println("Nao Ha Alugueis!");
			}else {
				System.out.println("Voce Gostaria de Filtrar o Historico de Alugueis?");
				System.out.println("1) Sim");
				System.out.println("2) Nao");
				key = scan.nextInt();
				switch (key) {
				case 1:
					System.out.println("Como?");
					System.out.println("1) Usuario");
					System.out.println("2) Item");
					System.out.println("3) Data");
					key = scan.nextInt();
					switch (key) {
					case 1:
						System.out.println("Insira o nome:");
						String nome = scan.next();
						for (int i = 0; i < alugueis.size(); i++) {
							if(alugueis.get(i).getUsuario().getNome().equals(nome)) {
							System.out.println(i+1 + ") Usuario: "+alugueis.get(i).getUsuario().getNome()+" Item: "+ alugueis.get(i).getItem().getTitulo()+" Data: " + alugueis.get(i).getData());
							}
						}
						break;

					case 2:
						System.out.println("Insira o Item:");
						String item = scan.next();
						for (int i = 0; i < alugueis.size(); i++) {
							if(alugueis.get(i).getItem().getTitulo().equals(item)) {
							System.out.println(i+1 + ") Usuario: "+alugueis.get(i).getUsuario().getNome()+" Item: "+ alugueis.get(i).getItem().getTitulo()+" Data: " + alugueis.get(i).getData());
							}
						}
						break;

					default:
						System.out.println("Insira a Data:");
						String data = scan.next();
						for (int i = 0; i < alugueis.size(); i++) {
							if(alugueis.get(i).getData().equals(data)) {
							System.out.println(i+1 + ") Usuario: "+alugueis.get(i).getUsuario().getNome()+" Item: "+ alugueis.get(i).getItem().getTitulo()+" Data: " + alugueis.get(i).getData());
							}
						}
						break;
					}
					break;

				default:
					for (int i = 0; i < alugueis.size(); i++) {
						System.out.println(i+1 + ") Usuario: "+alugueis.get(i).getUsuario().getNome()+" Item: "+ alugueis.get(i).getItem().getTitulo()+" Data: " + alugueis.get(i).getData());
					}
					break;
				}
			}
			break;
			
		default:
			break;
		}
	}
}
