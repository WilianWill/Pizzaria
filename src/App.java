
import java.util.*;


public class App {
    static List<Pedido> pedidos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Bem-vindo à Pizzaria ===");
            System.out.println("1. Login como Funcionário");
            System.out.println("2. Login como Cliente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    menuFuncionario();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    private static void menuFuncionario() {
        while (true) {
            System.out.println("\n--- Menu Funcionário ---");
            System.out.println("1. Listar pedidos");
            System.out.println("2. Listar clientes");
            System.out.println("3. Atualizar status de pedido");
            System.out.println("4. Cadastrar cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    listarPedidos();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    atualizarStatusPedido();
                    break;
                case 4:
                    cadastrarCliente();
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuCliente() {
        while (true) {
            System.out.println("\n--- Menu Cliente ---");
            System.out.println("1. Fazer novo pedido");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    fazerPedido();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println("ID: " + p.getIdPedido() + ", Cliente: " + p.getIdCliente() + ", Valor: R$" + p.getValorTotal() + ", Status: " + p.getStatusPedido() + ", Data: " + p.getDataPedido());
        }
    }

    private static void atualizarStatusPedido() {
        System.out.print("Digite o ID do pedido: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Pedido p : pedidos) {
            if (p.getIdPedido() == id) {
                System.out.print("Novo status: ");
                String status = scanner.nextLine();
                p.setStatusPedido(status);
                System.out.println("Status atualizado!");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    private static void fazerPedido() {
        System.out.print("Digite seu ID de cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Valor total do pedido: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        int idPedido = pedidos.size() + 1;
        Date data = new Date();
        Pedido novo = new Pedido(idPedido, idCliente, valor, "Pendente", data);
        pedidos.add(novo);
        System.out.println("Pedido realizado com sucesso! ID do pedido: " + idPedido);
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        // Endereço simples (pode ser expandido depois)
        List<Endereco> enderecos = new ArrayList<>();
        Cliente novo = new Cliente(nome, email, telefone, enderecos);
        novo.setId(clientes.size() + 1);
        clientes.add(novo);
        System.out.println("Cliente cadastrado com sucesso! ID: " + novo.getId());
    }

    private static void listarClientes() {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Email: " + c.getEmail() + ", Telefone: " + c.getTelefone());
        }
    }
}