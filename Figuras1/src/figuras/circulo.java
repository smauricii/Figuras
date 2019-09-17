package figuras;

public class circulo extends figura2d {

	private double radio;

	public circulo(String nombre, String color, double radio)	{
		super(nombre,color,grosorBorde);
		this.radio=radio;

	}
	@Override
	public String calcularArea() {
		double area = Math.PI * (pow(radio, 2));
		return "Area = "+area +"\n";

	}

	private double pow(double radio2, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getRadio() {

		return radio;

	}

	public void setRadio(double radio) {

		this.radio = radio;

	}

	public String Exportar() {
		return super.Exportar();
	}

	@Override
	public
	String calcularPerimetro() {
	return  null;
	}



	


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
	}