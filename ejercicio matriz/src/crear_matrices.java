import java.util.Scanner;

public class crear_matrices {
	public static void main(String[] args) {
		
		int numFilas;//Guarda el numero de filas que escoja el usuario
	    int numCol;//Guarda el numero de columnas que escoja el usuario
	      
	    Scanner numeroFilas = new Scanner(System.in);
	    Scanner numeroColumnas = new Scanner(System.in);
		  
		  
        System.out.println("Escribe cuantas filas quieres que tenga su matriz");
        numFilas = numeroFilas.nextInt();
        System.out.println("Escribe cuantas columnas quieres que tenga su matriz");
        numCol = numeroColumnas.nextInt();
		
		
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[numFilas][numCol];
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
		
		int matriz1[][] = new int[numFilas][numCol];
		for (int x=0; x < matriz1.length; x++) {
			for (int y=0; y < matriz1[x].length; y++) {
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
		
		
	}
}