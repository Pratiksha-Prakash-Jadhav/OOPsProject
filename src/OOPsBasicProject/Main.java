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
		
		int[] num=new int[count];
		System.out.println("Enter your number: ");
		for(int i=0;i<count;i++)
		{
			int b = i +1;
			num[i]=sc.nextInt();
		}
		
		switch(choice)
		{
		case 1:{
			
			CalAddition addition;
			addition=new CalAddition();
			
		      if(count==2)
		         {
						result=addition.addition(num[0],num[1]);
						System.out.println("Addition is: "+result);
					}
		      else if(count==3)
					{
						result=addition.addition(num[0],num[1],num[2]);
						System.out.println("Addition is: "+result);
					}
		      else if(count==4)
					{
		    	       result=addition.addition(num[0],num[1],num[2],num[3]);
						System.out.println("Addition is: "+result);
					}
		      else if(count==5)
					{
		    	       result=addition.addition(num[0],num[1],num[2],num[3],num[4]);
						System.out.println("Addition is: "+result);
					}
				 }break;
		case 2:
		{
			CalSubstraction substraction;
			substraction=new CalSubstraction();
			   if(count==2)
					{
				        result=substraction.substraction(num[0],num[1]);
						System.out.println("Substraction is: "+result);
					}
			   else if(count==3)
			     {
				        result=substraction.substraction(num[0],num[1],num[2]);
						System.out.println("Substraction is: "+result);
			     }
			   else if(count==4)
			     {
				         result=substraction.substraction(num[0],num[1],num[2],num[3]);
						System.out.println("Substraction is: "+result);
			     }
			   else if(count==5)
			     {      
				        result=substraction.substraction(num[0],num[1],num[2],num[3],num[4]);
						System.out.println("Substraction is: "+result);
			      }
		    }break;
	
		case 3:
		{
			CalMultiplication multiplication;
			multiplication=new CalMultiplication();
			
		   if(count==2)
			{
			    result=multiplication.multiplication(num[0], num[1]);
				System.out.println("Multiplication is: "+result);
			}
		   else if(count==3)
			{
			   result=multiplication.multiplication(num[0], num[1],num[2]);
				System.out.println("Multiplication is: "+result);
			}
		   else if(count==4)
			{
			   result=multiplication.multiplication(num[0], num[1],num[2],num[3]);
				System.out.println("Multiplication is: "+result);
			}
		   else if(count==5)
			{
			   result=multiplication.multiplication(num[0], num[1],num[2],num[3],num[4]);
				System.out.println("Multiplication is: "+result);
			}
		}break;
		
		default:
			System.out.println("Invalid Input");			
	    
      }
	}
}


