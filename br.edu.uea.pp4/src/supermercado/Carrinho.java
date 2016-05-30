package supermercado;
import java.util.*;

public class Carrinho {
	private ArrayList<ItemProduto> itemsProdutos;
	
    public Carrinho() {
    }
    
    public void adicionaItem(ItemProduto item, Estoque estoque) {
        estoque.saiItem(item);
        itemsProdutos.add(item);
    }
    
    public void removeItem() {
        estoque.entraItem(item);
        itemsProdutos.remove(item);
    }
    
    public ArrayList<ItemProduto> getItens() {
        return itemsProdutos;
    }
    
    public double totalAPagar() {
    	double total = 0.0f;
    	
    	for(ItemProduto p : itemsProdutos) {
        	total += itemsProdutos.getProduto().getPreco();
        }
        return total;
    }
}
