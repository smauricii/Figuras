package figuras;

public class piramide extends figura3d{
	
	 private double base;
	private double altura;

	public piramide(String nombre, String color,double base,double altura){
		super(nombre,color,grosorBorde);
	        this.base=base;
	        this.altura=altura;
	    }
	
	

	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public double calcularVolumen() {
		// TODO Auto-generated method stub
		return (int) ((base*altura)/3);
	}
	
	public String Exportar(){
		return super.Exportar();
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}
