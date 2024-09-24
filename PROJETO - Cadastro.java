import java.util.ArrayList;
import java.util.Scanner;

class Main {
  static ArrayList<Cliente> clientes = new ArrayList<>();
  static ArrayList<Produto> produtos = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int escolha = 0;
    while (escolha != 4) {
      System.out.println("Menu:");
      System.out.println("1. Adicionar Cliente");
      System.out.println("2. Visualizar Clientes");
      System.out.println("3. Adicionar Produto a um Cliente");
      System.out.println("4. Sair");
      System.out.print("Escolha uma opção: ");
      escolha = scanner.nextInt();

      switch (escolha) {
        case 1:
          adicionarCliente();
          break;
        case 2:
          visualizarClientes();
          break;
        case 3:
          adicionarProdutoCliente();
          break;
        case 4:
          System.out.println("Encerrando o programa.");
          break;
        default:
          System.out.println("Opção inválida. Por favor, tente novamente.");
      }
    }
  }

  public static void adicionarCliente() {
    Cliente cliente = new Cliente();
    clientes.add(cliente);
    System.out.println("Cliente adicionado com sucesso.\n");
  }

  public static void visualizarClientes() {
    if (clientes.isEmpty()) {
      System.out.println("Nenhum cliente adicionado ainda.\n");
    } else {
      System.out.println("Clientes:");
      for (Cliente c : clientes) {
        c.mostrar();
      }
    }
  }

  public static void adicionarProdutoCliente() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um cliente pelo índice:");
    for (int i = 0; i < clientes.size(); i++) {
      System.out.println(i + ". " + clientes.get(i).nome);
    }
    int indexCliente = sc.nextInt();

    Cliente clienteSelecionado = clientes.get(indexCliente);

    Produto produto = new Produto();
    produto.cadastrar();

    clienteSelecionado.adicionarProduto(produto);
    System.out.println("Produto associado ao cliente com sucesso.\n");
  }
}

class Cliente {
  String nome, email;
  ArrayList<Produto> produtos = new ArrayList<>();

  Cliente() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do cliente:");
    this.nome = sc.nextLine();

    System.out.println("Digite o email do cliente:");
    this.email = sc.nextLine();
  }

  void mostrar() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Email: " + this.email);

    if (!produtos.isEmpty()) {
      System.out.println("Produtos associados:");
      for (Produto p : produtos) {
        p.mostrar();
      }
    }
    System.out.println();
  }

  void adicionarProduto(Produto produto) {
    produtos.add(produto);
  }
}

class Produto {
  String nome, descricao;

  void cadastrar() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do produto:");
    this.nome = sc.nextLine();

    System.out.println("Digite a descrição do produto:");
    this.descricao = sc.nextLine();
  }

  void mostrar() {
    System.out.println("Nome do Produto: " + this.nome);
    System.out.println("Descrição: " + this.descricao);
  }
}
