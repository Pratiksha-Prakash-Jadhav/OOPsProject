package OOPsBasicProject;

import java.util.Scanner;

public class Main {
        
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice Options");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		System.out.println("How many number we wont to calculate");
		int count=sc.nextInt();
		
		int result=0;
		
		switch(choice)
		{
		case 1:{
			CalAddition addition;
			addition=new CalAddition();
		      switch(count)
		         {
		             case 2:
		            {
						result=addition.addition(12,12);
						System.out.println("Addition is: "+result);
						break;
					}
					case 3:
					{
						result=addition.addition(12,12,12);
						System.out.println("Addition is: "+result);
						break;
					}
					case 4:
					{
						result=addition.addition(12,12,12,12);
						System.out.println("Addition is: "+result);
						break;
					}
					case  5:
					{
						result=addition.addition(12,12,12,12,12);
						System.out.println("Addition is: "+result);
						break;
					}
					default:
						System.out.println("Invalid Input");			
				    }
				 }break;
		case 2:
		{
			CalSubstraction substraction;
			substraction=new CalSubstraction();
			     switch(count)
			     {
			     case 2:
					{
						result=substraction.substraction(12,12);
						System.out.println("Substraction is: "+result);
						break;
					}
			     case 3:
			     {
			    	 result=substraction.substraction(12,2,1);
						System.out.println("Substraction is: "+result);
						break;
			     }
			     case 4:
			     {
			    	 result=substraction.substraction(12,2,1,0);
						System.out.println("Substraction is: "+result);
						break;
			     }
			     case 5:
			     {
			    	 result=substraction.substraction(12,2,1,0,5);
						System.out.println("Substraction is: "+result);
						break;
			      }
			     default:
						System.out.println("Invalid Input");			
				    
			    }
		    }break;
		    
		case 3:
		{
			CalMultiplication multiplication;
			multiplication=new CalMultiplication();
			
			switch(count)
			{
			case 2:
			{
				result=multiplication.multiplication(2,2);
				System.out.println("Multiplication is: "+result);
				break;
			}
			case 3:
			{
				result=multiplication.multiplication(2,2,2);
				System.out.println("Multiplication is: "+result);
				break;
			}
			case 4:
			{
				result=multiplication.multiplication(2,2,2,2);
				System.out.println("Multiplication is: "+result);
				break;
			}
			case 5:
			{
				result=multiplication.multiplication(2,2,2,2,2);
				System.out.println("Multiplication is: "+result);
				break;
			}
			default:
				System.out.println("Invalid Input");			
		  }
		}break;
		default:
			System.out.println("Invalid Input");			
	    
      }
	}
}
