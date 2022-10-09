package comunicacion;


public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}


	public String [] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return getInterpretacion();
	}
	
	@Override
	public String toString() {
		String str = ""; 
		for (int i=0;i<letras.length;i++) {
			if (i == letras.length -1) {
				str = str + letras[i];
			} else {
			str = str + letras[i] + ", ";
			}
		}
		return str;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
}
