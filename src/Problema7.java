import java.util.Scanner;


public class Problema7 {

	public static void main(String[] args) {
		int num1=0;
		int num=0;
		System.out.println("Ingrese un número entre 0 y 10");		
	       Scanner otro=new Scanner(System.in);	 
		   num1=otro.nextInt();
		   if(num1<=10)
		for(num=10; num>=1;num-- )
			System.out.println(num*num1);
		 }		
	}

