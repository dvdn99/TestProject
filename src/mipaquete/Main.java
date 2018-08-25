package mipaquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Bienvenidos al primer programa :)");
		
		System.out.print("Enter a number: ");
		
		num = sc.nextInt();
		
		System.out.println("Number is : "+num);
		
		sc.close();
	}

}
