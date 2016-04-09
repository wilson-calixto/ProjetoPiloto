package br.com.primeiro;//meu pacote onde se encontra minha classe

import javax.swing.JFrame;//diferentemente do Frame do AWT, o JFrame ja contem o botam de fechar

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafico extends JFrame { //usando o JFrame como extenção da classe
	
	public Grafico(){ //Metodo construtor da classe
		super( "Primeiro Grafico" ); //Titulo do frame
		
		DefaultPieDataset pieDataset = new DefaultPieDataset();//cria um Dataset p/ inserir os dados que serão passados para a criação do grafico
		
		//Adicionando os dados ao Dataset devendo somar 100%
		pieDataset.setValue ("A", new Integer(20));
		pieDataset.setValue ("B", new Integer(30));
		pieDataset.setValue ("C", new Integer(35));
		pieDataset.setValue ("D", new Integer(15));
		
		//Cria um objeto JFreeChart (grafico) passando os seguintes parametros
		JFreeChart chart = ChartFactory.createPieChart(//instaciamento do grafico do tipo pizza
			"Titulo Do Grafico",
			pieDataset,   //DataSet
			true,         //p/ mostrar ou nao a legenda
			true,         //p/ mostrar ou nao os tooltips
			false);
		
			
		this.add(new ChartPanel(chart));//adicionando na tela meu grafico "chart"
		
		this.pack();//cria o tamanho de acordo com o que tiver dentro do frame
	
	}

	public static void main(String[] args) {
		new Grafico().setVisible(true);// instanciando e usando o metodo setVisible p/ mostrando o frame na tela
	
	
	}
