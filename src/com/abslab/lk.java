package com.abslab;

import java.util.Scanner;

public class lk {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("--------DOG GROOMER REGISTRY--------");
		System.out.println("************************************");
		System.out.println("--PLEASE SELECT FROM THE FOLLOWING--");
		System.out.println("1. Add a dog to the registry");
		System.out.println("2. View current list of dogs");
		System.out.println("3. Delete a dog from the registry");
		System.out.println("4. Exit the program");
		System.out.print("Enter your choice here: ");
		int selection = input.nextInt();
		System.out.println();
	}

}
