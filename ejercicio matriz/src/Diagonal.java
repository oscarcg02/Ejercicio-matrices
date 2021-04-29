import java.util.Scanner;

public class Diagonal {

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
		//Imprime los numeros de su diagonal
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("La diagonal es: " + matriz[i][i]);
		}
	}

}
