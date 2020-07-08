package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimetro() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2)+Math.pow(height,2));
	}
	
	public String toString() {
		return "Area: "
				+String.format("%.2f", area())
				+"\n"
				+"Perimetro: "
				+String.format("%.2f", perimetro())
				+"\n"
				+"Diagonal: "
				+String.format("%.2f", diagonal());
	}
	
}
