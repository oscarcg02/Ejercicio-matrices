import java.util.Scanner;

public class Traspuesta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[3][3];
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
			
			//Imprime la resultado
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[ " + (matriz[j][i]) + " ]");
			}
			 System.out.println("");
		}
	}

}
