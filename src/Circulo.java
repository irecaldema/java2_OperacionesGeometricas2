public class Circulo extends Figura{

	static final double NUM_PI =3.1416;
	private String nombre;
	private double radio, area, circu;

	public Circulo(String nombre,double radio)
 {
	super(nombre);
	area=0;
	circu=0;
	setradio(radio);
 }
	
public void setradio(double radio) 
 {
	this.radio = radio;
 }
 
public double area() 
 {	
	area = NUM_PI*radio*radio;
	return area;
 }
 
public double circu() 
 {	
	circu = 2*NUM_PI*radio;
	return circu;
 }
}