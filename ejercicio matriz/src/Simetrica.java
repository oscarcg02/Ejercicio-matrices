import java.util.Arrays;
import java.util.Scanner;

public class Simetrica {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
 		   int matriz[][] = new int[3][3];
 		   int matriz1[][] = new int[3][3];
 		   int matriz_resultado [] [] = new int[3][3];
		//Para introducir los numeros de la matriz
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
				matriz[x][y] = entrada.nextInt();
				}
			}
		//Imprime la matriz
		for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
		System.out.println("");
		
		//Hace la traspuesta
		for (int i = 0; i < matriz.length; i++){	
			//Imprime la matriz inicial
			for(int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
			
			//tabula y pone el igual
			if (i == 1) {
				System.out.print("   =   ");
			}
			else {
				System.out.print("       ");
			}
			
			//Imprime la resultado de la traspuesta
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[ " + (matriz[j][i]) + " ]");
			}
			System.out.println("");
		}
		
		System.out.println("Hemos gecho la traspuesta para comprobar si es igual");
		
		System.out.println("");
		//Copia los valores de la matriz en matriz1
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz1[i][j] = matriz[i][j];
			}
			
		}
		//Imprime la matriz1
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				System.out.print("[ " + (matriz1[j][i]) + " ]");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//Comprueba que la matriz 1 sea igual o no a la matriz, osea comprueba si la matriz original es igual a su traspuesta
		if(Arrays.deepEquals(matriz, matriz1)) {
			 System.out.println("La matriz es simetrica");
		}
		else {
			System.out.println("La matriz no es simetrica");
		}
	}

}
