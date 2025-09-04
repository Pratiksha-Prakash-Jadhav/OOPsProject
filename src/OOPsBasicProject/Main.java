package OOPsBasicProject;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice Options");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Exit");
		
		int choice=sc.nextInt();
		
		System.out.println("How many number we wont to calculate");
		int count=sc.nextInt();
		
		Calculator calculator;
		// operation id = 1 or = 2 and nov =2
		if (count == 2) {
			if (choice == 1) 
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				calculator = new CalAddition();
				System.out.println("Addition is: "+calculator.addition(a, b));
			} 
			else if (choice == 2) 
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				calculator = new CalSubstraction();
				System.out.println("Substraction is: "+calculator.substraction(a, b));
			}
			else if(choice==3)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				calculator=new CalMultiplication();
				System.out.println("Multiplication is: "+calculator.multiplication(a, b));
			}
		}
		else if(count > 2 && count < 6) {
			if(choice == 1) {
				CalAddition addition = new CalAddition();
				
				switch(count)
				{
				case 3:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					System.out.println("Addition is: "+addition.addition(a, b, c));
				}break;
				case 4:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					System.out.println("Addition is: "+addition.addition(a, b, c,d));
				}break;
				case 5:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					int e=sc.nextInt();
					System.out.println("Addition is: "+addition.addition(a, b, c,d,e));
				}
				}
				
			}
			else if(choice == 2) {
				CalSubstraction substraction = new CalSubstraction();
				switch(count)
				{
				case 3:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					System.out.println("Substraction is: "+substraction.substraction(a, b, c));
				}break;
				case 4:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					System.out.println("Substraction is: "+substraction.substraction(a, b, c,d));
				}break;
				case 5:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					int e=sc.nextInt();
					System.out.println("Substraction is: "+substraction.substraction(a, b, c,d,e));
				}
				}

			}
			else if(choice == 3)
			{
				CalMultiplication multiplication=new CalMultiplication();
				switch(count)
				{
				case 3:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					System.out.println("Multiplication is: "+multiplication.multiplication(a, b, c));
				}break;
				case 4:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					System.out.println("Multiplication is: "+multiplication.multiplication(a, b, c,d));
				}break;
				case 5:
				{
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					int d=sc.nextInt();
					int e=sc.nextInt();
					System.out.println("Multiplication is: "+multiplication.multiplication(a, b, c,d,e));
				}
				}
				}
			}
		
	}

}


