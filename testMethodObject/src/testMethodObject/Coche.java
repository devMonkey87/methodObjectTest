package testMethodObject;

public class Coche {
	protected String Fabricante;
	protected String Modelo;

//test
	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [Fabricante=" + Fabricante + ", Modelo=" + Modelo + "]";
	}

	public Coche(String fabricante, String modelo) {
		super();
		Fabricante = fabricante;
		Modelo = modelo;
	}

	public Coche() {
		super();
	}

}
