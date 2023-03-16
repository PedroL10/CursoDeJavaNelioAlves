package entities;

public class Rectangle {

	public double width;
	public double height;

	public double Area() {
		return this.height * this.width;
	}
	
	public double Perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
		}
	
}
