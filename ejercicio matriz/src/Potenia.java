import java.util.Scanner;

public class Potenia {

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
		
		Scanner potencia = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero al que quieres elevar la matriz");
		numero = potencia.nextInt();
		int contador = 2;
		int matriz2[][] = new int[3][3];
		
		//Copia los valores de la matriz en matriz1
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz1[i][j] = matriz[i][j];
			}
			
		}
		
		//Hacer  potencia
		int [][] resultado_producto = new int [matriz.length][matriz1[0].length];
		 	//multiplico la primera vez la matriz por si misma
			 for(int i = 0; i < matriz.length; i++) {
		            for(int j = 0; j < matriz1[0].length; j++) {
		                for(int k = 0; k < matriz[0].length;k++) {
		                    resultado_producto[i][j] +=  matriz[i][k] * matriz1[k][j];
		                }
		            }
		        }
		 
			
		 while(contador < numero) {
			//Copia los valores de la resultado_producto en matriz
			for(int i = 0; i < resultado_producto.length; i++) {
				for(int j = 0; j < resultado_producto.length; j++) {
					matriz[i][j] = resultado_producto[i][j];
					matriz2[i][j] = resultado_producto[i][j];
				}
					
			}
			
			for(int i = 0; i < matriz.length; i++) {
	            for(int j = 0; j < matriz1[0].length; j++) {
	                for(int k = 0; k < (matriz[0].length);k++) {
	                    resultado_producto[i][j] +=  (matriz[i][k] * matriz1[k][j]);
	                }
	            }
	        }
			for (int i = 0; i < matriz.length; i++) {
    			for (int j = 0; j < matriz1.length; j++) {
    				resultado_producto[i][j] = resultado_producto[i][j] - matriz2[i][j];
    			}
    		}
			
			contador++;
		}
		 
       
       // Imprime la primera
    	for (int i = 0; i < matriz.length; i++){
    		//Imprime la primera
    		for(int j = 0; j < matriz1.length; j++) {
    			System.out.print("[ " + matriz1[i][j] + " ]");
           }
    			
    		//tabula y pone el mas
    		if (i == 1) {
    			System.out.print("   ^   ");
    		}
    		else {
    			System.out.print("       ");
    		}
    		
    		//tabula y pone la potencia
    		if (i == 1) {
    			System.out.print(numero);
    		}
    		else {
    			System.out.print("       ");
    		}	
    			 
    		//tabula y pone el igual
    		if (i == 1) {
    			System.out.print("    =    ");
    		}
    		else {
    			System.out.print("   ");
    		}
    			
    		//Imprime la resultado
    		for (int j = 0; j < resultado_producto.length; j++) {
    			System.out.print("[ " + resultado_producto[i][j] + " ]");
    		}
    		System.out.println("");
    	}

	}

}
