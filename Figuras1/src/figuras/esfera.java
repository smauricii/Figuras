package figuras;

public class esfera extends figura3d {
	
	private double radio;

	public esfera (String nombre, String color,double radio) {
		super(nombre,color,grosorBorde);
		this.radio=radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularVolumen() {
		return (double) ((4/3) * Math.PI*(radio*radio*radio));
	}
	
	public String Exportar() {
		return super.Exportar();
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	

}
