package br.edu.up;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.up.model.Jogos;

public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;

	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();	
		menu();
	}

	public static void menu() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("_____________________________________");
		System.out.println("|Escolha uma das opções do menu      |");		
		System.out.println("|1 - Cadastrar                       |");
		System.out.println("|2 - Consultar                       |");
		System.out.println("|3 - Editar                          |");
		System.out.println("|4 - Deletar                         |");
		System.out.println("|5 - Sair                            |");
		System.out.println("|------------------------------------|");
		
		int opcao = leitor.nextInt();
		switch (opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				consultar();
				break;
			case 3:
				alterar();
				break;
			case 4:
				excluir();
				break;
			case 5:
				System.out.println("****************************************");
				System.out.println("**************DESLOGADO*****************");
				System.out.println("****************************************");
				break;
			default:
				System.out.println("****************************************");
				System.out.println("Opção invalida, digite um valor correto:");
				System.out.println("****************************************");
				menu();
				break;	
		}
	}

	public static void cadastrar() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("________________________________________");
		System.out.println("| Insira o nome do jogo:                |");
		System.out.println("|---------------------------------------|");
		String nomejogo = leitor.nextLine();
		System.out.println("________________________________________");
		System.out.println("| Qual a categoria deste jogo?          |");
		System.out.println("|---------------------------------------|");
		String catjogo = leitor.nextLine();
		System.out.println("________________________________________");
		System.out.println("| Insira o valor deste jogo em Reais:   |");
		System.out.println("|---------------------------------------|");
		double valorjogo = leitor.nextDouble();
		
		Jogos cadastrarJogo = new Jogos();
		cadastrarJogo.setJogo(nomejogo);
		cadastrarJogo.setCategoria(catjogo);
		cadastrarJogo.setValor(valorjogo);
		
		salvar(cadastrarJogo);
		
		System.out.println("________________________________________");
		System.out.println("| Cadastrado com sucesso!               |");
		System.out.println("|---------------------------------------|");
		
		int id = cadastrarJogo.getId();
		consutadireta(id);
		menu();
		
	}

	public static void consultar() {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("________________________________________");
		System.out.println("| Insira a ID de cadastro:              |");
		System.out.println("|---------------------------------------|");
		int id = leitor.nextInt();
		
		consutadireta(id);
		menu();
		
		
		
	}
	
	public static void consutadireta(int id) {

		Jogos consultaJogo = procurar(id);
		
		if(consultaJogo == null) {
			System.out.println("________________________________________");
			System.out.println("| Não foi possivel localizar esta ID!   |");
			System.out.println("|---------------------------------------|");
			menu();
		}else{
		
		int idJogo = consultaJogo.getId();
		String nomeJogo = consultaJogo.getJogo();
		String catJogo = consultaJogo.getCategoria();
		double valorJogo = consultaJogo.getValor();
				
		System.out.println("_____________________________________");
		System.out.println("| Id:" +idJogo );
		System.out.println("| Nome: " +nomeJogo );
		System.out.println("| Categoria: " +catJogo );
		System.out.println("| Valor em reias: R$" +valorJogo );
		System.out.println("|-------------------------------------");
		}
				
	}
	
	public static void alterar() {
			Scanner leitor = new Scanner(System.in);
			System.out.println("________________________________________");
			System.out.println("| Insira a id de cadastro para alterar: |");
			System.out.println("|---------------------------------------|");
			int id = leitor.nextInt();
			consutadireta(id);
		
		
			System.out.println("________________________________________");
			System.out.println("| Qual opção deseja alterar?            |");
			System.out.println("| 1 - Nome                              |");
			System.out.println("| 2 - Categoria                         |");
			System.out.println("| 3 - Valor em Reais                    |");
			System.out.println("| 4 - Voltar ao menu                    |");
			System.out.println("|---------------------------------------|");
			Jogos alterarvalor = procurar(id);
			int num = leitor.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("________________________________________");
				System.out.println("| Qual o novo nome do jogo?             |");
				System.out.println("|---------------------------------------|");
				String nomejogo = leitor.next();
				alterarvalor.setJogo(nomejogo);
				editar(alterarvalor);
				break;
			case 2:
				System.out.println("________________________________________");
				System.out.println("| Qual a nova categoria do jogo?        |");
				System.out.println("|---------------------------------------|");
				String catjogo = leitor.next();
				
				alterarvalor.setCategoria(catjogo);
				editar(alterarvalor);
				break;
			case 3:
				System.out.println("________________________________________");
				System.out.println("| Qual o novo valor do jogo?            |");
				System.out.println("|---------------------------------------|");
				double valorjogo = leitor.nextDouble();
				alterarvalor.setValor(valorjogo);
				editar(alterarvalor);
				break;
			case 4:
				menu();
				break;
			default:
				System.out.println("________________________________________");
				System.out.println("| Valor incorreto!                      |");
				System.out.println("|---------------------------------------|");
				alterar();
				break;
			
			}
			System.out.println("________________________________________");
			System.out.println("| Alterado com sucesso!                 |");
			System.out.println("|---------------------------------------|");
		
			consutadireta(id);
			menu();
			
		}
	

	public static void excluir() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("________________________________________");
		System.out.println("| Insira a id para excluir:             |");
		System.out.println("|---------------------------------------|");
		int id = leitor.nextInt();
			
		excluir(id);
		
		System.out.println("________________________________________");
		System.out.println("| Excluido com sucesso:                 |");
		System.out.println("|---------------------------------------|");
		menu();
	}
	
	
	public static Integer salvar(Jogos jogo) {
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
		return jogo.getId();
		
	}
	
	private static void editar(Jogos alterarvalor) {
		em.getTransaction().begin();
		em.merge(alterarvalor);
		em.getTransaction().commit();
		
	}

	public static Jogos procurar(int id) {
		Jogos idjogo = em.find(Jogos.class, id);
		return idjogo;
		
	}

	public static void excluir(Integer id) {
		Jogos excluirJogo = em.find(Jogos.class, id);
		em.getTransaction().begin();
		em.remove(excluirJogo);
		em.getTransaction().commit();
		
	}

	
}