package calculadora;

import java.util.Scanner;

public class Operaciones {

	static Scanner reader = new Scanner(System.in);
	
	public static int suma (int a, int b) {	/* funció */
		int res;
		res = a + b;
		return res;
	}

	public static int resta (int a, int b) {	/* funció */
		int res;
		res = a - b;
		return res;
	}

	public static int multiplicacio (int a, int b) {	/* funció */
		int res;
		res = a * b;
		return res;
	}

	public static int divisio (int a, int b) {	/* funció */
		int res = 0;
		char op;
		
		do{
		   System.out.print("M." + a + " mod " + b);
		   System.out.print("D." + a + " div " + b);
		   op = obtenirChar();
		   if (op=='M' || op=='m') res = a % b;
		   else if (op == 'D' || op=='d') res = a / b;
		        else System.out.println("opció incorrecte");
	    } while (op!='M' && op!='m' && op!='D' && op!='d');
		
		return res;
	}

	public static char obtenirChar() {
		char c;
		Scanner reader = new Scanner(System.in);
		System.out.print("Introdueix un caràcter: ");
		c = reader.nextLine().charAt(0);
		return c;
	}
	
	public static int obtenirEnter()   //funció
	{
	    int valor = 0;
	    
	    boolean valid = false;
	    
	    do {
	    	try {
		    	System.out.print("Introdueix un valor enter: ");
		    	valor = reader.nextInt();
		    	valid = true;
		    }
		    catch (Exception e) {
		    	System.out.println("Error, cal introduir un valor enter");
		    	reader.nextLine();
		    } 
	    } while (valid == false);
	    
	    return valor; 
	}

	public static void visualitzar(int res) {  /* procediment */  
		System.out.println("El resultat de l'operacio és" + res);
		
	}

}
