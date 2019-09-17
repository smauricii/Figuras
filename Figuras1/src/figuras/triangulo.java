package figuras;

public class triangulo extends figura2d {
	
	
	private double base;
	private double altura;

	public triangulo(String nombre, String color, double base, double altura) {
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
	public String calcularArea() {
		double area= base * altura/2;
		return "Area = "+area +"\n";
		// TODO Auto-generated method stub
	}

	@Override
	public String calcularPerimetro() {
		double perimetro =(base+base+base);
		return "[Perimetro] ="+perimetro;
	}
	public String Exportar(){
		return super.Exportar();
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}
