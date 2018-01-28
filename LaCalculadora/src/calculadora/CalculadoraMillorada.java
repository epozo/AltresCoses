package calculadora;

//Calculadora que acumula el resultat de l'operació i únicament demana el següent valor

public class CalculadoraMillorada {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		char opcio;
		int resultat = 0;
		boolean control = false;
		
		do  {
		    mostrarMenu();
			opcio = Operaciones.obtenirChar();
			
			switch(opcio) {
				case 'o': 
	            case 'O': x=Operaciones.obtenirEnter();
			              y=Operaciones.obtenirEnter();
			              control = true;
			              break;
				case '+':  if (control)
								resultat = Operaciones.suma(x,y);   
						   else mostrarError();
						  break;
				case '-': if (control)
								resultat = Operaciones.resta(x,y);   
							else mostrarError();
	                      break;
				case '*': 	if (control)
									resultat = Operaciones.multiplicacio(x,y);   
							else mostrarError();
							break;
					case '/': if (control) {
								if (y==0) System.out.print ("Error, no es pot dividir per zero");
							    else resultat = Operaciones.divisio(x,y);   
							}
							else mostrarError();
						  break;
				case 'v': 
	            case 'V': if (control)
	            			Operaciones.visualitzar(resultat);
	            		  else mostrarError();
					   	  break;
				case 's': 
	            case 'S': System.out.print("Acabem.....");
	                    
	                      break;
				default: System.out.print("opció erronia");
			}
			
		}while (opcio!='s' && opcio!='S');
		
		System.out.print("\nAdeu!!!");
		
	}
	
	
	public static void mostrarError() {
		System.out.print("\nError, primer cal introduir els valors amb els que vols operar");
	}
	
	
	
	static void mostrarMenu()
	{
	     	
			System.out.print("\nCalculadora:\n\n");
			System.out.print("\no.- Obtenir els valors");
			System.out.print("\n+.- Sumar");
			System.out.print("\n-.- Restar");
			System.out.print("\n*.- Multiplicar");
			System.out.print("\n/.- Dividir");
			System.out.print("\nv.- Visualitzar resultat");
			System.out.print("\ns.- Sortir");
			System.out.println("\n\nTria una opció: ");
	}

}
