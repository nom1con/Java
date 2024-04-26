import java.util.Scanner;

public class PAP {

	public static void main(String[] args) {
		int t=0, n,i=0;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		while(i<=n) {
			//Überprüfen ob n durch i teilbar ist und ggf möglichen Teiler count erhöhen
			t+=n%i++==0?1:0;
		}
		if(t==2) {
		System.out.println("n ist eine Primzahl");
		}else {
			System.out.println("n ist keine Primzahl");
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
}
