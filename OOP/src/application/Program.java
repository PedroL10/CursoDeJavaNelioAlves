package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		Rectangle rec = new Rectangle();
		rec.width = width;
		rec.height = height;
		
		System.out.printf("Area: %.2f%n" , rec.Area() );
		System.out.printf("Perimeter: %.2f%n" , rec.Perimeter() );
		System.out.printf("Diagonal: %.2f%n" , rec.diagonal() );

	}

}
