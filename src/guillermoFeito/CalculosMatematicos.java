package guillermoFeito;

/**
 * Programa que calcula
 * @author Guillermo Feito
 * @since 22/4/2025
 * @version 1.0
 */
import java.util.ArrayList;

public class CalculosMatematicos {
	
	
	/**
	 * Constructor
	 */
	
	public CalculosMatematicos() {		
	}
	
	/**
	 * Metodo que realiza calculos
	 * @param numero
	 */

	public void calculosRefactorizados(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		//Añadimos el 1
		miArray.add(1);
		
		noEsPrimo = factorialPrimo(numero, miArray, noEsPrimo);			
		
		System.out.println("Los factoriales primos del número introducido son: "+miArray);
		
		noEsPrimo = primoValidacion(numero, noEsPrimo);
		
		if(noEsPrimo) {
			System.out.println("El número "+numero+ " NO es primo");
		} else System.out.println("El número "+numero+ " SI es primo");
	}

	
	/**
	 * Metodo de validacion de numeros primos
	 * @param numero
	 * @param noEsPrimo
	 * @return
	 */
	private boolean primoValidacion(int numero, boolean noEsPrimo) {
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;			
			if(numero%i==0) {
				noEsPrimo = true;				
				i=numero;
			}
		}
		return noEsPrimo;
	}
	
	/**
	 * Metodo para obtener los primos factoriales
	 * @param numero
	 * @param miArray
	 * @param noEsPrimo
	 * @return
	 */

	private boolean factorialPrimo(int numero, ArrayList<Integer> miArray, boolean noEsPrimo) {
		int j;
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;
			j = 2;
			while(j<i) {
				if(i%j==0) {
					noEsPrimo = true;
					j=i;				
				} else j++;
			}
			if(!noEsPrimo&&numero%i==0) {
				miArray.add(i);								
			}
			
		}
		return noEsPrimo;
	}			
}
