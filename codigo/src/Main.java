import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.adicionarUsuario("Felipe", "122.383.956-79");
		biblioteca.adicionarUsuario("Lucas", "122.383.956-79");
		biblioteca.adicionarUsuario("Daniel", "122.383.956-79");
		biblioteca.adicionarUsuario("Itamar", "122.383.956-79");
		
		biblioteca.adicionarRevista("Quatro Rodas (outubro-2023)","Felipe","Revista","2023",3,3,5,5);
		biblioteca.adicionarRevista("Caras (outubro-2023)","Felipe","Revista","2023",3,3,5,5);
		biblioteca.adicionarRevista("Veja (outubro-2023)","Felipe","Revista","2023",3,3,5,5);
		
		biblioteca.adicionarTese("Inteligencia Artificial","Felipe","Tese","2023",3,3,5,"Tecnologia","Como a Inteligencia Artificial pode ajudar os Alunos");
		biblioteca.adicionarTese("Programacao Modular","Felipe","Tese","2023",3,3,5,"Tecnologia","Como a Programacao Modular pode ajudar os Alunos");
		biblioteca.adicionarTese("Java","Felipe","Tese","2023",3,3,5,"Tecnologia","Como Java se matem no mercado a Tantos anos");
		
		biblioteca.adicionarCd("Ao Vivo Em Goiania","Jorge e Matheus","Cd","2003",3,3,5,5,15);
		biblioteca.adicionarCd("A ultima dose de amor","Felipe","Cd","2023",3,3,5,5,15);
		biblioteca.adicionarCd("Esquenta Sertanejo","Spotfy","Cd","2023",3,3,5,5,15);
		
		biblioteca.adicionarDvd("Avatar","Disney","Dvd","2023",3,3,5,2,"Aventura");
		biblioteca.adicionarDvd("O Rei Leao","Disney","Dvd","2023",3,3,5,2,"Aventura");
		biblioteca.adicionarDvd("A Pequena Sereia","Disney","Dvd","2023",3,3,5,3,"Aventura");
		
		biblioteca.adicionarLivro("Dracula","Bram Stoker","Livro","2023",3,3,5,"Terror","A presença profana de Drácula condena a tripulação do navio mercante Demeter.");
		biblioteca.adicionarLivro("O Senhor dos Aneis","Tolkien","Livro","2023",3,3,5,"Aventura","O Senhor dos Anéis é um livro de alta fantasia, escrito pelo escritor britânico J. R. R. Tolkien. Escrita entre 1937 e 1949, com muitas partes criadas durante a Segunda Guerra Mundial, a saga é uma continuação de O Hobbit.");
		biblioteca.adicionarLivro("Como treinar seu dragao","Cressida Cowell","Livro","2023",3,3,5,"Aventura","How to Train Your Dragon é uma série de livros infantojuvenil criados pela escritora Cressida Cowell e lançado pela editora Holden Children's Books em 27 de junho de 2003 no Reino Unido. A série é dividida em treze livros, com onze lançados, e dois extras. No Brasil, a série foi lançada pela Editora Intrínseca.");
		
		Scanner scan = new Scanner(System.in);
		int chave = 0;
		
		System.out.println("-----------------------");
		System.out.println("Bem Vindo a biblioteca!");
		System.out.println("-----------------------");
		while (chave != 6) {
			System.out.println("Menu: ");
			System.out.println("1) Lista de Clientes");
			System.out.println("2) Catalogo");
			System.out.println("3) Gerenciar Cliente");
			System.out.println("4) Gerenciar Item");
			System.out.println("5) Alugueis");
			System.out.println("6) Sair");
			
			chave = scan.nextInt();
			int key=0;
			switch (chave) {
			case 1:
				biblioteca.listarUsuarios();
				break;
			case 2:
				biblioteca.listarItens();
				break;
			case 3:
				System.out.println("Gerenciando Usuarios:");
				System.out.println("1) Adicionar");
				System.out.println("2) Remover");
				key = scan.nextInt();
				switch (key) {
				case 1:
					biblioteca.criarUsuario();
					break;
				case 2:
					biblioteca.removerUsuario();
					break;
				default:
					break;
				}
				break;
			case 4:
				System.out.println("Gerenciando Itens:");
				System.out.println("1) Adicionar");
				System.out.println("2) Remover");
				key = scan.nextInt();
				switch (key) {
				case 1:
					biblioteca.criarItem();
					break;
				case 2:
					biblioteca.removerItem();
					break;
				default:
					break;
				}
				break;
			case 5:
				System.out.println("Alugueis:");
				System.out.println("1) Alugar");
				System.out.println("2) Historico");
				System.out.println("3) Sair");
				key = scan.nextInt();
				switch (key) {
				case 1:
					biblioteca.criarAluguel();
					break;
				case 2:
					biblioteca.listarAlugueis();
					break;
				default:
					break;
				}
				break;
			case 6:
				System.out.println("Programa Encerrado!");
				break;
			default:
				break;
			}
		}
	}

}
