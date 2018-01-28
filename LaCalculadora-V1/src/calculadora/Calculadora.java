package calculadora;

import java.util.Scanner;

/* 
 * Exercici de la Calculadora
 */

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op1 = 0, op2 = 0;
		char opcio;
		int resultat = 0;
		boolean control = false;

		do {
			mostrar_menu();
			opcio = llegirCar();

			switch (opcio) {
                case 'o':
                case 'O':
                    op1 = llegirEnter();
                    op2 = llegirEnter();
                    control = true;
                    break;
                case '+':
                    if (control)
                        resultat = suma(op1, op2);
                    else mostrarError("Error, primer has d'introduir els valors a operar");
                    break;
                case '-':
                    if (control)
                        resultat = resta(op1, op2);
                     else mostrarError("Error, primer has d'introduir els valors a operar");
                    break;
                case '*':
                    if (control)
                        resultat = multiplicacio(op1, op2);
                     else mostrarError("Error, primer has d'introduir els valors a operar");
                    break;
                case '/':
                    if (control)
                        resultat = divisio(op1, op2);
                    else mostrarError("Error, primer has d'introduir els valors a operar");
                    break;
                case 'v':
                case 'V':
                    if (control)
                        visualitzar(resultat);
                     else mostrarError("Error, primer has d'introduir els valors a operar");
                    break;
                case 's':
                case 'S':
                    System.out.print("Acabem.....");

                    break;
                default:
                    System.out.print("opci� erronia");
			}
			;
		} while (opcio != 's' && opcio != 'S');
		System.out.print("\nAdeu!!!");

	}



	private static void mostrarError(String str) {
		// TODO Auto-generated method stub
		System.out.println(str.toString());
	}



	public static int suma(int a, int b) { /* funci� */
		int res;
		res = a + b;
		return res;
	}

	public static int resta(int a, int b) { /* funci� */
		int res;
		res = a - b;
		return res;
	}

	public static int multiplicacio(int a, int b) { /* funci� */
		int res;
		res = a * b;
		return res;
	}

	public static int divisio(int a, int b) { /* funci� */
		int res = 0;
		char op;

	/*	if (b == 0)
			throw new java.lang.ArithmeticException("Divisi� per cero");
		else {
			do {
				System.out.println("M. " + a + " mod " + b);
				System.out.println("D  " + a + " / " + b);
				op = llegirCar();
				if (op == 'M' || op == 'm')
					res = a % b;
				else if (op == 'D' || op == 'd')
					res = a / b;
				else
					System.out.print("opci� incorrecte\n");
			} while (op != 'M' && op != 'm' && op != 'D' && op != 'd');
		}
		*/
		res = a / b;
		
		return res;
	}

	public static char llegirCar() // funci�
	{
		char car;
		;
		Scanner reader = new Scanner(System.in);
		boolean valid = false;

		System.out.print("Introdueix un car�cter: ");
		car = reader.next().charAt(0);
		valid = true;

		reader.nextLine();
		return car;
	}

	public static int llegirEnter() // funci�
	{
		int valor = 0;
		Scanner reader = new Scanner(System.in);
		boolean valid = false;

		do {
			try {
				System.out.print("Introdueix un valor enter: ");
				valor = reader.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.print("Error, s'espera un valor enter");
				reader.nextLine();
			}
		} while (!valid);

		return valor;
	}

	public static void visualitzar(int res) { /* procediment */
		System.out.println("\nEl resuktat de l''operacio �s " + res);
	}

	public static void mostrar_menu() {
		System.out.println("\nCalculadora:\n");
		System.out.println("o.- Obtenir els valors");
		System.out.println("+.- Sumar");
		System.out.println("-.- Restar");
		System.out.println("*.- Multiplicar");
		System.out.println("/.- Dividir");
		System.out.println("v.- Visualitzar Operadors");
		System.out.println("s.- Sortir");
		System.out.print("\n\nTria una opci�: ");
	}

}
