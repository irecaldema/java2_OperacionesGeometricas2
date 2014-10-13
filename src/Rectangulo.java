public class Rectangulo extends Figura{
	private String nombre;
	private double base, altura, area, peri ;

	public Rectangulo(String nombre,double base, double altura)
 {
	super(nombre);
	area=0;
	peri=0;
	setbase(base);
	setaltura(altura);
 }
	
	
public void setbase(double base) 
 {
	this.base = base;
 }	
public void setaltura(double altura)
 {
	this.altura = altura;
 }

public double getbase() 
{
	return base;
}

public double getaltura() 
{
	return altura;
}

public double area() 
{
	area = getbase()*getaltura();
	return area;
}

public double peri() 
{
	peri = 2*getbase()+2*getaltura();
	return peri;
}
 public void mostrar()
 {
    super.mostrar();
    System.out.println("\nEl area del rectangulo es: " + area());
    System.out.println("\nEl perimetro del rectangulo es: " + peri());
 }
}