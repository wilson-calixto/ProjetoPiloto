package produtos;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String data;
    private Calendar c;
    public Data() {
    }

    public Data(int dia,int mes,int ano) {
    	this.dia=dia;
    	this.mes=mes;
    	this.ano=ano;
    }
    public void toStrings() {
    	data=dia+"/"+mes+"/"+ano;
    }

    public void setData(int dia,int mes,int ano) {
    	this.dia=dia;
    	this.mes=mes;
    	this.ano=ano;
    }

    public boolean antes() {
        // TODO implement here
        return false;
    }
    public boolean depois() {
        // TODO implement here
        return false;
    }
    public boolean igual() {
        // TODO implement here
        return false;
    }

    public String dataHoje() {
    	c = Calendar.getInstance();
		data=c.getTime()+"/"+c.get(Calendar.YEAR)+"/"+c.get(Calendar.DAY_OF_MONTH);
        return data;
    }

    public int  getDia() {
        // TODO implement here
        return dia;
    }

    public int getMes() {
        // TODO implement here
        return mes;
    }
  	public int getAno() {
        // TODO implement here
        return ano;
    }

}