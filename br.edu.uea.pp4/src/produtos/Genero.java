package produtos;


import java.util.*;

public abstract class Genero {
	String nome;
	
	public Genero() {
    }
    public abstract String getNome();
    public abstract void setNome(String nome);
}