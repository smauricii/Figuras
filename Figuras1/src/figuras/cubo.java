package figuras;

public class cubo extends figura3d {
	
	private double arista;
	private double areaLateral;
	private double areaTotal;

	public cubo(String nombre, String color,double areaLateral,double areaTotal,double arista) {
		super(nombre,color,grosorBorde);
		this.setAreaLateral(areaLateral);
		this.setAreaTotal(areaTotal);
		this.arista=arista;
	}

	@Override
	public double calcularVolumen() {
		
		setAreaLateral(4*Math.pow(arista,2));
		setAreaTotal(6*Math.pow(arista,2));
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String Exportar(){
		return super.Exportar();
	}


	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	public double getAreaLateral() {
		return areaLateral;
	}

	public double getArista() {
		return arista;
	}

	public void setArista(double arista) {
		this.arista = arista;
	}

	public void setAreaLateral(double areaLateral) {
		this.areaLateral = areaLateral;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

}

