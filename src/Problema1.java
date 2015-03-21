
public class Problema1 {
	
	public static void main(String[] args) {
		for(int i=1;i<10; i++){
			  for(int j=9-i; j>0; j--)
				  if(j%2!=0)
				System.out.print(" ");
			  for(int k=0;k<i;k++)
				  if(i%2!=0)
				System.out.print("*");
			  System.out.println(" ");
		 }		
		for(int i=7;i>0;i--){
			for(int j=i; j>0; j--)
				 if(i%2!=0)
						System.out.print("*");
					  System.out.println(" ");
					 
		}
	  }
	}
 