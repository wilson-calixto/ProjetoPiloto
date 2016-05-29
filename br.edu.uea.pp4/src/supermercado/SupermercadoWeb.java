package supermercado;

import estoque.*;
import java.util.*;

/**
 * 
 */
public class SupermercadoWeb {

    private Estoque estoque;
    private Carrinho carrinho;
    private ArrayList<Genero> generos;
    private ArrayList<Produto> produtos;
    private ArrayList<Marca> marcas;
    
    public SupermercadoWeb() {
        iniciaSupermercado();
    }

    private void iniciaSupermercado() {
        estoque = new Estoque();
    }




    /**
     * @return
     */
    private void iniciaSupermercado() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public List getMarcas() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List getProdutos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Estoque getEstoque() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Carrinho getCarrinho() {
        // TODO implement here
        return null;
    }

}
