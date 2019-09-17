package figuras;

public abstract class figura {
	
protected static String nombre;
protected static int color;
protected static int grosorBorde;

public figura(String nombre) {
	
	super();
	figura.nombre=nombre;
}
public figura (String nombre, int color, int grosorBorde ) {
	super();
	figura.nombre=nombre;
	figura.color=color;

}

public String getNombre(){
return figura.nombre;
}
public void setNombre(String n){
figura.nombre=n;
				}

public int getColor(){
return figura.color;
}

public void setColor(int c){
figura.color=c;
}

public int getGrosorBorde(){
return figura.grosorBorde;
}

public void setGrosorBorde(int g){
figura.grosorBorde=g;
}

public abstract void dibujar();

public String Exportar() {
	return "[Color= " + color +"\n" + "Forma= " + nombre+"\n";
}
	}
