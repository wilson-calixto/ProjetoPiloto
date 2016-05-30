package supermercado;

import estoque.*;
import produtos.Genero;
import produtos.Marca;
import produtos.Produto;

import java.util.*;
public class SupermercadoWeb {

    private Estoque estoque;
    private Carrinho carrinho;
    private ArrayList<Genero> generos;
    private ArrayList<Produto> produtos;
    private ArrayList<Marca> marcas;
    
   /* public SupermercadoWeb() {
        iniciaSupermercado();
    }
*/
    public void iniciaSupermercado() {
        estoque = new Estoque();
    }

    public ArrayList<Marca> getMarcas() {
        // TODO implement here
        return marcas;
    }

    public ArrayList<Produto> getProdutos() {
        // TODO implement here
        return  produtos;
    }

    public Estoque getEstoque() {
        // TODO implement here
        return estoque;
    }
    public Carrinho getCarrinho() {
        // TODO implement here
        return carrinho;
    }

}
