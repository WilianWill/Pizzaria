
import java.util.*;


public class App {
    static List<Pedido> pedidos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<>();


    static List<Pizza> cardapioPizzas = Arrays.asList(
    new Pizza("Mussarela", "Grande", "Mussarela", 40.0),
    new Pizza("Calabresa", "Média", "Calabresa", 35.0),
    new Pizza("Portuguesa", "Grande", "Portuguesa", 45.0)
);

static List<Bebebida> cardapioBebidas = Arrays.asList(
    new Bebebida("Coca-Cola", "Coca-Cola", 8.0, 1),
    new Bebebida("Guaraná", "Antarctica", 7.0, 1),
    new Bebebida("Suco de Laranja", "Natural", 6.0, 1)
);

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
                    FuncionarioListarPedidos();
                    break;
                case 2:
                    FuncionarioListarClientes();
                    break;
                case 3:
                    FuncionarioAtualizarStatusPedido();
                    break;
                case 4:
                    FuncionarioCadastrarCliente();
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
            System.out.println("2. Listar pedidos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    ClienteFazerPedido();
                    break;
                case 2:
                    ClienteListarPedidos();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }



    private static void FuncionarioListarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println("ID: " + p.getIdPedido() + ", Cliente: " + p.getIdCliente() + ", Valor: R$" + p.getValorTotal() + ", Status: " + p.getStatusPedido() + ", Data: " + p.getDataPedido());
        }
    }

    private static void FuncionarioAtualizarStatusPedido() {
        FuncionarioListarPedidos();
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

    
    private static void FuncionarioCadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        // Endereço simples 
        List<Endereco> enderecos = new ArrayList<>();
        Cliente novo = new Cliente(nome, email, telefone, enderecos);
        novo.setId(clientes.size() + 1);
        clientes.add(novo);
        System.out.println("Cliente cadastrado com sucesso! ID: " + novo.getId());
    }

    private static void FuncionarioListarClientes() {
        if(clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Email: " + c.getEmail() + ", Telefone: " + c.getTelefone());
        }
    }

    private static void ClienteFazerPedido() {
        System.out.print("Digite seu ID de cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
    
        double valorTotal = 0.0;
    
        // Escolha de pizza
        System.out.println("Escolha uma pizza:");
        for (int i = 0; i < cardapioPizzas.size(); i++) {
            Pizza p = cardapioPizzas.get(i);
            System.out.println((i+1) + ". " + p.getNome() + " (" + p.getTamanho() + ") - R$" + p.getValor());
        }
        System.out.print("Digite o número da pizza: ");
        int pizzaEscolhida = scanner.nextInt() - 1;
        scanner.nextLine();
        valorTotal += cardapioPizzas.get(pizzaEscolhida).getValor();
    
        // Escolha de bebida
        System.out.println("Escolha uma bebida:");
        for (int i = 0; i < cardapioBebidas.size(); i++) {
            Bebebida b = cardapioBebidas.get(i);
            System.out.println((i+1) + ". " + b.getNome() + " (" + b.getMarca() + ") - R$" + b.getValor());
        }
        System.out.print("Digite o número da bebida: ");
        int bebidaEscolhida = scanner.nextInt() - 1;
        scanner.nextLine();
        valorTotal += cardapioBebidas.get(bebidaEscolhida).getValor();
    
        int idPedido = pedidos.size() + 1;
        Date data = new Date();
        Pedido novo = new Pedido(idPedido, idCliente, valorTotal, "Pendente", data);
        pedidos.add(novo);
        System.out.println("Pedido realizado com sucesso! ID do pedido: " + idPedido + " | Valor total: R$" + valorTotal);
    }

    private static void ClienteListarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }
        for (Pedido p : pedidos) {
            System.out.println("ID: " + p.getIdPedido() + ", Cliente: " + p.getIdCliente() + ", Valor: R$" + p.getValorTotal() + ", Status: " + p.getStatusPedido() + ", Data: " + p.getDataPedido());
        }
    }
}