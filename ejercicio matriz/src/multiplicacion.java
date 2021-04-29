import java.util.Scanner;

public class multiplicacion {

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
 		//Introduce los numeros de la segunda matriz
 		for (int x=0; x < matriz1.length; x++) {
 			for (int y=0; y < matriz[x].length; y++) {
 				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
 				matriz1[x][y] = entrada.nextInt();
 				}
 			}
 		//Imprime la segunda matriz
 		for(int i = 0; i < matriz1.length; i++) {
             for(int j = 0; j < matriz1.length; j++) {
                 System.out.print("[ " + matriz1[i][j] + " ]");
             }
             System.out.println("");
         }
 		
 		System.out.println("");
 		
 		//Hacer  multiplicacion
 		int [][] resultado_producto = new int [matriz.length][matriz1[0].length];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz1[0].length; j++) {
                for(int k = 0; k < matriz[0].length;k++) {
                    resultado_producto[i][j] +=  matriz[i][k] * matriz1[k][j];
                }
            }
        }
        // Imprime la primera
     	for (int i = 0; i < matriz.length; i++){
     		//Imprime la primera
     		for(int j = 0; j < matriz.length; j++) {
     			System.out.print("[ " + matriz[i][j] + " ]");
            }
     			
     		//tabula y pone el mas
     		if (i == 1) {
     			System.out.print("   *   ");
     		}
     		else {
     			System.out.print("       ");
     		}
     			
     		//Imprime la segunda
     		for(int j = 0; j < matriz1.length; j++) {
     			System.out.print("[ " + matriz1[i][j] + " ]");
            }
     			 
     		//tabula y pone el igual
     		if (i == 1) {
     			System.out.print("   =   ");
     		}
     		else {
     			System.out.print("       ");
     		}
     			
     		//Imprime la resultado
     		for (int j = 0; j < resultado_producto.length; j++) {
     			System.out.print("[ " + resultado_producto[i][j] + " ]");
     		}
     		System.out.println("");
     	}	
 		
	}

}


