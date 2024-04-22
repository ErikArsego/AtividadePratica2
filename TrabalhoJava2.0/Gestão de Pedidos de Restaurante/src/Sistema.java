import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado");
    }

    public static void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos registrados.");
        } else {
            System.out.println("Lista de Pedidos:");
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }

    public static void executarProjeto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao restaurante!");
        System.out.println("Insira os itens do seu pedido.");

        Pedido pedido = new Pedido();

        while (true) {
            System.out.print("Nome do item ou digite fim para encerrar: ");
            String nomeItem = scanner.nextLine();
            if (nomeItem.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Preço do item: ");
            double precoItem = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Tipo do item (entrada, prato principal, sobremesa): ");
            String tipoItem = scanner.nextLine();

            switch (tipoItem.toLowerCase()) {
                case "entrada":
                    pedido.adicionarItem(new Entrada(nomeItem, precoItem));
                    break;
                case "prato principal":
                    pedido.adicionarItem(new PratoPrincipal(nomeItem, precoItem));
                    break;
                case "sobremesa":
                    pedido.adicionarItem(new Sobremesa(nomeItem, precoItem));
                    break;
                default:
                    System.out.println("Tipo de item inválido. Por favor, insira novamente.");
            }
        }

        adicionarPedido(pedido);
        listarPedidos();

        scanner.close();
    }
}
