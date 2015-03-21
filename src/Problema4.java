import java.util.Scanner;

public class Problema4 {
	public static void main(String[]args){
		double x=0;
		int f=0;
		System.out.println("Ingrese 1 si quiere calcular para círculo");
		System.out.println("Ingrese 2 si quiere calcular para cuadrado");
		System.out.println("Ingrese 3 si quiere calcular para triángulo");
		Scanner s=new Scanner(System.in);	 
	     f=s.nextInt();
	 
		
		if(f==1){
	      System.out.println("Ingrese el diámetro");
		  Scanner otro=new Scanner(System.in);	 
	      x=otro.nextDouble();
	        double pi=3.141592654;
	        double r= x/2;
	      System.out.println("El radio es:"+ r+ "unidades");
	      System.out.println("El perimetro es:"+ (2*r*pi)+"unidades cuadradas");
	      System.out.println("El área es:"+ (pi*r*r) + "unidades cuadradas");
		}
	   if(f==2){
		   System.out.println("Ingrese el tamaño de uno de los lados");
	       Scanner otro=new Scanner(System.in);	 
		      x=otro.nextDouble();
		      System.out.println("El perimetro es:"+ (4*x)+"unidades");
		      System.out.println("El área es:"+ (x*x)+ "unidades cuadradas");    
	   }
	   if(f==3){
		   int t=0;
		    System.out.println("Ingrese 1 isóceles");
		    System.out.println("Ingrese 2 equilátero");
			System.out.println("Ingrese 3 rectangulo");
			Scanner g=new Scanner(System.in);	 
		     t=g.nextInt();
		   
		   if(t==1){
			   double b =0;
		       double l=0;
		   System.out.println("Ingrese base y lado ");
	       Scanner otro=new Scanner(System.in);	 
		      b=otro.nextDouble();
		      l=otro.nextDouble();
		      double h=((l*l)-((b/2)*(b/2)));
		      System.out.println("La altura es:"+h +"unidades");
		      System.out.println("El perimetro es:"+ (l+l+b)+"unidades");
		      System.out.println("El área es:"+ (0.5*b*h)+ "unidades cuadradas");   
		   }
		   if(t==2){
			   double l=0;
			   System.out.println("Ingrese lado");
			   Scanner otro=new Scanner(System.in);	 
			      l=otro.nextDouble();
			      double h=((l*l)-((l/2)*(l/2)));
			      System.out.println("La altura es:"+h +"unidades");
			      System.out.println("El perimetro es:"+ (l+l+l)+"unidades");
			      System.out.println("El área es:"+ (0.5*l*h)+ "unidades cuadradas");
		   }
		   if(t==3){
			   double b =0;
		       double l=0;
		   System.out.println("Ingrese la hipotesnusa y el lado ayacente");
	       Scanner otro=new Scanner(System.in);	 
		      b=otro.nextDouble();
		      l=otro.nextDouble();
		      double h=((l*l)-((b)*(b)));
		      System.out.println("La altura es:"+h +"unidades");
		      System.out.println("El perimetro es:"+ (l+l+b)+"unidades");
		      System.out.println("El área es:"+ (0.5*b*h)+ "unidades cuadradas");   
	    }
	   }
	  }
	} 
		
