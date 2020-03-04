package com.nttdata.Main;

import java.util.Scanner;

public class RoomAreaMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the length in feet:");
		//double l = s.nextDouble();
		float l = s.nextFloat();
		System.out.println("Enter the width in feet:");
		float b = s.nextFloat();

		float area = l * b;
		System.out.println("The Area of Room is: " + area +"  square feet");
		System.out.println("Or "+area*0.09290304 + " in square meters");
	}
}
