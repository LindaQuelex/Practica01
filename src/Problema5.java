import java.util.Scanner;


public class Problema5 {
	public static void main(String[]args){
		int d=0, m=0, a=0, d1=0, m1=0, a1=0;
		System.out.println("Ingrese fecha más actual y luego la anterior");
		 Scanner s=new Scanner(System.in);	 
		 d= s.nextInt();
		 m=s.nextInt();
		 a= s.nextInt();
		 d1= s.nextInt();
		 m1=s.nextInt();
		 a1= s.nextInt();
		 
		 if(m==m1){
			 if(a==a1){
				int c=(d-d1);
				 System.out.println("hay"+" "+c +" "+"días");
			 }
			 if(a-a1==1){
				 if(d>d1){
					 int o=(-1*(d-d1)+(a-a1));
					 System.out.println("hay"+" " +o+" "+ "días");
					 }}
				 if(d<d1){
					 int q=(360+(d-d1));
					 System.out.println("hay"+" " +q+" "+ "días");
				 }
			if(a-a1!=1){
			 if(d>d1){
				 int o=((360-d1)+(((a-a1)-1)*360)+d);
				 System.out.println("hay"+" "+ o+" "+ "días");
			 }
			 if(d<d1){
				int p=((((a-a1)-1)*360)+(360+(d-d1)));
				System.out.println("hay"+" "+ p +" "+ "días");
				 }
			 }
		 }
		 if(m!=m1){
			 int p=((30-d1)+d+(((m-m1)-1)*30));
			 if(a==a1){
				 System.out.println("hay"+" "+ p +" "+ "días");
			 }
			 if(a!=a1){
				 int q= ((30-d1)+d+(((m-m1)-1)*30))+(((a-a1)-1)*360);
				 System.out.println("hay"+" "+ q+" "+ "días");
			 }
		 }
		 
	    }
	}
		 
 
