import java.util.Scanner;




public class Problema3 { 
	public static void main(String[]args){
	     char pp;
		 int h=0;
		 int m=0;
		 System.out.println("introduzca la hora con exactamente cinco caracteres");
		 Scanner s=new Scanner(System.in);	 
		 h= s.nextInt();
		 pp=s.next().charAt(0);
		 m= s.nextInt();
		 
		 if(h >12){
			 if(h!=24){
		      h = h-12;
			 System.out.println("La hora es:"+h+pp+m+"p.m.");}
			 else if(h==24){
				 h=h/2;
				 System.out.println("La hora es:"+h+pp+m+"a.m.");}
		 }
		 else if(h ==12){
			 System.out.println("La hora es:"+h+pp+m+"p.m.");}
		 else if(h<12){
			 System.out.println("La hora es:"+h+pp+m+"a.m.");
		 }
		else
		     System.out.println("La hora es:"+h+pp+m+"a.m.");
		 
	 }
	}
