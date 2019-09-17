package figuras;

public class cuadrado extends figura2d {

	double lado;
	public cuadrado(String nombre, String color, double lado) {
		super(nombre,color,grosorBorde);
		this.lado=lado;
	}
	
public String calcularArea () {
	double area = lado*lado;
	return "Area = "+area +"\n";
}

public String calcularPerimetro () {
	double perimetro = (lado+lado+lado+lado);
	return "[Perimetro] ="+perimetro;
}

public double escala(double escala) {
	lado=lado*escala;
	return escala;
}
public String Exportar(){
	return super.Exportar();
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
public void dibujar() {
	// TODO Auto-generated method stub
	
}

}

