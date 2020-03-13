package testMethodObject;

public class Coche {
	protected String fabricante;
	protected String modelo;
	protected int numeroRuedas;
	
	public Coche() {
		super();
	}
//cambio random

	public String getFabricante() {
		return fabricante;
	}


	public void setfabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getmodelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [fabricante=" + fabricante + ", Modelo=" + modelo + "]";
	}

	public Coche(String fabricante, String modelo, int i) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numeroRuedas = i;
	}


	public int getNumeroRuedas() {
		return numeroRuedas;
	}


	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	
	
	

	

}
