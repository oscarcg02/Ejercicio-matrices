import java.util.Scanner;

public class suma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
				matriz[x][y] = entrada.nextInt();
				}
			}
		for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
		
		int matriz1[][] = new int[3][3];
		for (int x=0; x < matriz1.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
				matriz1[x][y] = entrada.nextInt();
				}
			}
		for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[i][j] + " ]");
            }
            System.out.println("");
        }
		
		System.out.println("");
		
		//Suma las dos matrices
		int matriz_resultado [] [] = new int[3][3]; 
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz1.length; y++) {
				matriz_resultado[x][y] = matriz [x][y] + matriz1[x] [y];
			}
		}
		// Imprime la suma
		for (int i = 0; i < matriz.length; i++){
			//Imprime la primera
			for(int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
			
			//tabula y pone el mas
			if (i == 1) {
				System.out.print("   +   ");
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
			for (int j = 0; j < matriz_resultado.length; j++) {
				System.out.print("[ " + matriz_resultado[i][j] + " ]");
			}
			 System.out.println("");
		}
		
		
	}
}
