import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemMenu> itens;

    public Pedido () {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem (ItemMenu item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemMenu item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString () {
        return "Toal do pedido foi de:" + calcularTotal();
    }
}