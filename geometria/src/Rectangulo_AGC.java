/**
 * 
 * @author Adrian Granero Caparros
 * @version 1.2
 *
 */
public class Rectangulo_AGC extends FiguraGeometrica_AGC {
	private double l1;
	private double l2;
	/**
	 * 
	 * @param tipoFigura
	 * @param lG Un lado del rectangulo	
	 * @param lP Otro lado del rectangulo
	 */
	public Rectangulo_AGC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}


	/**
	 * Calcula el area
	 * @return devuelve el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	

	/**
	 * Calcula el perimetro
	 * @return devuelve el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
