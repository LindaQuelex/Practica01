import java.util.Scanner;


public class Problema2 {

	public static void main(String[] args) {
		System.out.println("MEDIA     PUNTUCION");
		System.out.println("90-100         A");
		System.out.println(" 80-89         B");
		System.out.println(" 70-79         C");
		System.out.println(" 60-69         D");
		System.out.println(" 00-59         E");
		System.out.println("-----------------");
	     double n1=0;
	     double n2=0;
	     double n3=0;
	     double n4=0;
	     double n5=0;
	     double n6=0;
		System.out.println("Ingrese las 6 notas");
		Scanner s=new Scanner(System.in);
		 n1= s.nextDouble();
		 n2= s.nextDouble();
		 n3= s.nextDouble();
		 n4= s.nextDouble();
		 n5= s.nextDouble();
		 n6= s.nextDouble();
		 
		 double media = ((n1+n2+n3+n4+n5+n6)/6);
			System.out.println("La media es:"+ media);
			
		if(media<60)
			System.out.println("La puntuaciones: E");
		else if(media<70)
		     System.out.println("La puntuacion es: D");
		else  if(media <80)
	       System.out.println("La puntuacion es: C");
	    else if(media<90)
	        System.out.println("La puntuacion es: B");
	    else
	        System.out.println("La puntuacion es: A");
	}

}
