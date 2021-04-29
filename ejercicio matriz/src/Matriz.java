import java.util.Arrays;
import java.util.Scanner;
// Oscar Campoamor Getino
public class Matriz {
	  public static void main(String[] args) {
		  
	       Scanner entrada = new Scanner(System.in); //Para introducir por consola
	       boolean salir = false; //Para salir del switch
	       int opcion; //Guarda la opcion del usuario
	       int numFilas;//Guarda el numero de filas que escoja el usuario
 	       int numCol;//Guarda el numero de columnas que escoja el usuario
 	       
	       do{
	    	    System.out.println("1. Suma");
	            System.out.println("2. Producto Escalar");
	            System.out.println("3. Multiplicar");
	            System.out.println("4. Hacer Traspuesta");
	            System.out.println("5. Sacar Diagonal");
	            System.out.println("6. Comprobar Simetria");
	            System.out.println("7. Potencia");
	            System.out.println("8. Restar");
	            System.out.println("9. Salir"); 
	            System.out.println("Escribe el numero de una de las opciones");
                opcion = entrada.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion Suma");
                        //Introduce el tamaño de la matriz
                        System.out.println("Para sumar matrices su tamaño debe ser igual");
                        System.out.println("Pondremos automaticamente el mismo tamaño a la segunda matriz");
                        System.out.println("Escribe cuantas filas quieres que tenga su matriz");
         	            numFilas = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas quieres que tenga su matriz");
         	            numCol = entrada.nextInt();
                        
         	            //Declaro las matrices
                        int matrizSuma[][] = new int[numFilas][numCol];
                        int matrizSuma1[][] = new int[numFilas][numCol];
                        int resultadoSuma[][] = new int[numFilas][numCol];
                        
                      //Para introducir los numeros de la matriz
                        for (int x = 0; x < matrizSuma.length; x++) {
                			for (int y = 0; y < matrizSuma[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizSuma[x][y] = entrada.nextInt();
                				}
                			}
                      //Imprime la matriz
                		for(int i = 0; i < matrizSuma.length; i++) {
                            for(int j = 0; j < matrizSuma[i].length; j++) {
                                System.out.print("[ " + matrizSuma[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		//Introduce los numeros de la segunda matriz
                		for (int x = 0; x < matrizSuma1.length; x++) {
                			for (int y = 0; y < matrizSuma1[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizSuma1[x][y] = entrada.nextInt();
                				}
                			}
                		//Imprime la segunda matriz
                		for(int i = 0; i < matrizSuma1.length; i++) {
                            for(int j = 0; j < matrizSuma1[i].length; j++) {
                                System.out.print("[ " + matrizSuma1[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		System.out.println("");
                		System.out.println("Resultado");
                		System.out.println("");
                		
                		//Suma las dos matrices
                   		for (int x = 0; x < matrizSuma.length; x++) {
                			for (int y = 0; y < matrizSuma1[x].length; y++) {
                				resultadoSuma[x][y] = matrizSuma [x][y] + matrizSuma1[x] [y];
                			}
                		}
                		// Imprime la suma
                		for (int i = 0; i < matrizSuma.length; i++){
                			//Imprime la primera
                			for(int j = 0; j < matrizSuma[i].length; j++) {
                                System.out.print("[ " + matrizSuma[i][j] + " ]");
                            }
                			
                			//tabula y pone el mas
                			
                			if (i == numFilas/2) {
                				System.out.print("   +   ");
                			}
                			else {
                				System.out.print("       ");
                			}
                			
                			//Imprime la segunda
                			for(int j = 0; j < matrizSuma1[i].length; j++) {
                                System.out.print("[ " + matrizSuma1[i][j] + " ]");
                            }
                			 
                			//tabula y pone el igual
                			if (i == numFilas/2) {
                				System.out.print("   =   ");
                			}
                			else {
                				System.out.print("       ");
                			}
                			
                			//Imprime la resultado
                			for (int j = 0; j < resultadoSuma[i].length; j++) {
                				System.out.print("[ " + resultadoSuma[i][j] + " ]");
                			}
                			 System.out.println("");
                		}
                		System.out.println("");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion Producto Escalar");
                        
                        //Introduce el tamaño
                        System.out.println("Escribe cuantas filas quieres que tenga su matriz");
         	            numFilas = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas quieres que tenga su matriz");
         	            numCol = entrada.nextInt();
                        
         	            //Declaro la matriz
                        int matrizEsc[][] = new int[numFilas][numCol];
                       
                        //Para introducir los numeros de la matriz
                		for (int x = 0; x < matrizEsc.length; x++) {
                			for (int y = 0; y < matrizEsc[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizEsc[x][y] = entrada.nextInt();
                				}
                			}
                		//Imprime la matriz
                		for(int i = 0; i < matrizEsc.length; i++) {
                            for(int j = 0; j < matrizEsc[i].length; j++) {
                                System.out.print("[ " + matrizEsc[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		System.out.println("");
                		                		
                		//Producto escalar 
                   		int numero;
                		System.out.println("Introduce un numero");
                		numero = entrada.nextInt();
                		System.out.println("");
                		System.out.println("Resultado");
                		System.out.println("");
                		
                		//Imprime el resultado del producto escalar
                		for (int i = 0; i < matrizEsc.length; i++){
                			//Imprime el numero
                			if (i == numFilas/2) {
                				System.out.print("   "+ numero +"*   ");
                			}
                			else {
                				System.out.print("       ");
                			}
                				
                			//Imprime la matriz inicial
                			for(int j = 0; j < matrizEsc[i].length; j++) {
                                System.out.print("[ " + matrizEsc[i][j] + " ]");
                            }
                			
                			//tabula y pone el igual
                			if (i == numFilas/2) {
                				System.out.print("   =   ");
                			}
                			else {
                				System.out.print("       ");
                			}
                			
                			//Imprime la resultado
                			for (int j = 0; j < matrizEsc[i].length; j++) {
                				System.out.print("[ " + (numero * matrizEsc[i][j]) + " ]");
                			}
                			 System.out.println("");
                		}
                		System.out.println("");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion  Mutiplicar");
                        
                        //Declaro las variables para las filas y columnas
                        int numFilasA;
                        int numColumnasAFilasB;
                        int numColumnasB;
                        
                        //Indtroduce el tamaño
                        System.out.println("Escribe cuantas filas quieres que tenga la priemra matriz");
                        numFilasA = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas de la primera matirz y las flias que tendra la segunda");
         	            numColumnasAFilasB = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas quieres que tenga la segunda matriz");
         	            numColumnasB = entrada.nextInt();
                        
         	            
         	            //Declaro las matrices
                        int matrizMulti[][] = new int[numFilasA][numColumnasAFilasB];
                        int matrizMulti1[][] = new int[numColumnasAFilasB][numColumnasB];
                                                
                        //Para introducir los numeros de la matriz
                        for (int x=  0; x < matrizMulti.length; x++) {
                			for (int y = 0; y < matrizMulti[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizMulti[x][y] = entrada.nextInt();
                				}
                			}
                        //Imprime la matriz
                		for(int i = 0; i < matrizMulti.length; i++) {
                            for(int j = 0; j < matrizMulti[i].length; j++) {
                                System.out.print("[ " + matrizMulti[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		//Introduce los numeros de la segunda matriz
                		for (int x=0; x < matrizMulti1.length; x++) {
                			for (int y = 0; y < matrizMulti1[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizMulti1[x][y] = entrada.nextInt();
                				}
                			}
                		//Imprime la segunda matriz
                		for(int i = 0; i < matrizMulti1.length; i++) {
                            for(int j = 0; j < matrizMulti1[i].length; j++) {
                                System.out.print("[ " + matrizMulti1[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		System.out.println("");
                		System.out.println("Resultado");
                		System.out.println("");
                		
                	   //Hacer  multiplicacion new int [numero de filas de a][numero  de columnas de b]
                	   int [][] resultado_producto = new int [matrizMulti.length][matrizMulti1[0].length];
                       for(int i = 0; i < numFilasA; i++) {
                           for(int j = 0; j < numColumnasB; j++) {
                               for(int k = 0; k < numColumnasAFilasB;k++) {
                                   resultado_producto[i][j] +=  matrizMulti[i][k] * matrizMulti1[k][j];
                               }
                           }
                       }
                       
                       
                       
                       //Imprime la multiplicacion
                       for(int i = 0; i < matrizMulti.length; i++) {
                           for(int j = 0; j < resultado_producto[i].length; j++) {
                               System.out.print("[ " + resultado_producto[i][j] + " ]");
                           }

                           System.out.println("");
                       } 
                            // Imprime la primera
                    		for (int i = 0; i < resultado_producto.length; i++){
                    			//Imprime la primera
                    			for(int j = 0; j < matrizMulti[i].length; j++) {
                                    System.out.print("[ " + matrizMulti[i][j] + " ]");
                                }
                    			
                    			//tabula y pone el mas
                    			if (i == 1) {
                    				System.out.print("   *   ");
                    			}
                    			else {
                    				System.out.print("       ");
                    			}
                    			
                    			//Imprime la segunda
                    			for(int j = 0; j < matrizMulti1[i].length; j++) {
                                    System.out.print("[ " + matrizMulti1[i][j] + " ]");
                                }
                    			 
                    			//tabula y pone el igual
                    			if (i == 1) {
                    				System.out.print("   =   ");
                    			}
                    			else {
                    				System.out.print("       ");
                    			}
                    			
                    			//Imprime la resultado
                    			for (int j = 0; j < resultado_producto[i].length; j++) {
                    				System.out.print("[ " + resultado_producto[i][j] + " ]");
                    			}
                    			 System.out.println("");
                    		}
                    		 System.out.println("");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion Hacer Traspuesta");
                        
                        //Introduce los numeros
                        System.out.println("Escribe cuantas filas quieres que tenga su matriz");
         	            numFilas = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas quieres que tenga su matriz");
         	            numCol = entrada.nextInt();
                        
         	            
         	            //Declaro la matriz
                        int matrizTras[][] = new int[numFilas][numCol];
                                                
                      //Para introducir los numeros de la matriz
                		for (int x = 0; x < matrizTras.length; x++) {
                			for (int y = 0; y < matrizTras[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizTras[x][y] = entrada.nextInt();
                				}
                			}
                		
                		//Imprime la matriz
                		for(int i = 0; i < matrizTras.length; i++) {
                            for(int j = 0; j < matrizTras[i].length; j++) {
                                System.out.print("[ " + matrizTras[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		//declaro la matriz traspuesta
                		int matriz_traspuesta [] [] = new int[numCol][numFilas];
                		
                		//Traspone la matriz 
                		for(int i = 0; i < matrizTras.length; i++){
                            for(int j = 0; j < matrizTras[i].length; j++){
                            	matriz_traspuesta[j][i] = matrizTras[i][j];
                            }
                        }
                		
                		
                		
                		System.out.println("");
                		System.out.println("Resultado");
                		System.out.println("");
                		System.out.println("Esta es la matriz inicial");
                		System.out.println("");
                		
                		//Imprime la matriz inicial
                		for(int i = 0; i < matrizTras.length; i++) {
                            for(int j = 0; j < matrizTras[i].length; j++) {
                                System.out.print("[ " + matrizTras[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		System.out.println("");
                		System.out.println("Esta es la matriz traspuesta");
                		System.out.println("");
                		
                		//Imprime la matriz traspuesta
                		for(int i = 0; i < matriz_traspuesta.length; i++) {
                            for(int j = 0; j < matriz_traspuesta[i].length; j++) {
                                System.out.print("[ " + matriz_traspuesta[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		System.out.println("");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion Sacar Diagonal");
                        
                        //Introduce el tamaño
                        System.out.println("La matriz debera ser cuadrada");
                        System.out.println("Escribe el tamaño de la matriz");
         	            numFilas = entrada.nextInt();
         	               
         	            //Declaro la matriz
                        int matrizDisgonal[][] = new int[numFilas][numFilas];
                                                
                        //Para introducir los numeros de la matriz
                		for (int x=0; x < matrizDisgonal.length; x++) {
                			for (int y=0; y < matrizDisgonal[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizDisgonal[x][y] = entrada.nextInt();
                				}
                			}
                		//Imprime la matriz
                		for(int i = 0; i < matrizDisgonal.length; i++) {
                            for(int j = 0; j < matrizDisgonal[i].length; j++) {
                                System.out.print("[ " + matrizDisgonal[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		System.out.println(""); 
                		System.out.print("La diagonal es: ");
                		System.out.println(""); 
                		
                		//Imprime los numeros de su diagonal
                		for(int i = 0; i < matrizDisgonal.length; i++) {
                			System.out.print( matrizDisgonal[i][i]);
                		}
                  		System.out.println("");
                  		System.out.println("");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion Comprobar Simetria");
                        
                        //Introduce el tamaño
                        System.out.println("La matriz debera ser cuadrada");
                        System.out.println("Escribe el tamaño de la matriz");
         	            numFilas = entrada.nextInt();
                        
         	            //Declaro la matriz
                        int matrizSimetrica[][] = new int[numFilas][numFilas];
                                                
                        //Para introducir los numeros de la matriz
                        for (int x=0; x < matrizSimetrica.length; x++) {
                        	for (int y=0; y < matrizSimetrica[x].length; y++) {
                        		System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                        		matrizSimetrica[x][y] = entrada.nextInt();
                        		}
             				}
                        //Imprime la matriz
                        for(int i = 0; i < matrizSimetrica.length; i++) {
                        	for(int j = 0; j < matrizSimetrica[i].length; j++) {
                        		System.out.print("[ " + matrizSimetrica[i][j] + " ]");
                        	}
                        	System.out.println("");
                        }
                        System.out.println("");
                        System.out.println("Hemos hecho la traspuesta para comprobar si es igual"); 
                        System.out.println("");
                        
                        //Hace la traspuesta
                        for (int i = 0; i < matrizSimetrica.length; i++){	
                        //Imprime la matriz inicial
             			for(int j = 0; j < matrizSimetrica[i].length; j++) {
                             System.out.print("[ " + matrizSimetrica[i][j] + " ]");
                         }
             			
             			//tabula y pone el igual
             			if (i == numFilas/2) {
             				System.out.print("   =   ");
             			}
             			else {
             				System.out.print("       ");
             			}
             			
             			//Imprime la resultado de la traspuesta
             			for (int j = 0; j < matrizSimetrica[i].length; j++) {
             				System.out.print("[ " + (matrizSimetrica[j][i]) + " ]");
             			}
             			System.out.println("");
                        }
                        System.out.println("");
                        
                        //Comprueba que la matriz original sea igual o no a la traspuesta
                        boolean simetria = true;
                        for(int i = 1; i < matrizSimetrica.length;i++) {
                            for(int j = 0; j < i; j++) {
                            	if(matrizSimetrica[i][j] != matrizSimetrica [j][i]) {
                            			simetria = false;
                            		}
                            		else {
                            			simetria = true;
                            		}
                            }
                         }
                        if(simetria) {
                        	System.out.println("Si es simetrica");
                        	}
                        else {
                        	System.out.println("No es simetrica");
                        	}
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion Potencia");
                        
                        //Introduce el tamaño
                        System.out.println("La matriz debera ser cuadrada");
                        System.out.println("Escribe el tamaño de la matriz");
         	            numFilas = entrada.nextInt();
                        
         	            //Declaro las matirces
                        int matrizPotencia[][] = new int[numFilas][numFilas];
                        int matrizPotencia1[][] = new int[numFilas][numFilas];
                        int matrizCopia[][] = new int[numFilas][numFilas];
                        
                      //Para introducir los numeros de la matriz
                        for (int x = 0; x < matrizPotencia.length; x++) {
                			for (int y = 0; y < matrizPotencia[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizPotencia[x][y] = entrada.nextInt();
                				}
                			}
                        
                        //Imprime la matriz
                		for(int i = 0; i < matrizPotencia.length; i++) {
                            for(int j = 0; j < matrizPotencia[i].length; j++) {
                                System.out.print("[ " + matrizPotencia[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		System.out.println("");
                		
                		//Introduce el numero al que se quiere elevar la matriz
                		System.out.println("Introduce un numero al que quieres elevar la matriz");
                		numero = entrada.nextInt();
                		
                		int contador = 2; //Contador para utilizar en el while
                		                		
                		//Copia los valores de la matriz en matriz1
                		for(int i = 0; i < matrizPotencia.length; i++) {
                			for(int j = 0; j < matrizPotencia[i].length; j++) {
                				matrizPotencia1[i][j] = matrizPotencia[i][j];
                			}
                			
                		}
                		
                		//Hacer  potencia
                		int [][] resultado_potencia = new int [matrizPotencia.length][matrizPotencia1[0].length];
                		 	//multiplico la primera vez la matriz por si misma
                			 for(int i = 0; i < matrizPotencia.length; i++) {
                		            for(int j = 0; j < matrizPotencia1[0].length; j++) {
                		                for(int k = 0; k < matrizPotencia[0].length;k++) {
                		                	resultado_potencia[i][j] +=  matrizPotencia[i][k] * matrizPotencia1[k][j];
                		                }
                		            }
                		        }
                		 
                			
                		 while(contador < numero) {
                			//Copia los valores de la resultado_producto en matrizCopia
                			for(int i = 0; i < resultado_potencia.length; i++) {
                				for(int j = 0; j < resultado_potencia[i].length; j++) {
                					matrizPotencia[i][j] = resultado_potencia[i][j];
                					matrizCopia[i][j] = resultado_potencia[i][j];
                				}
                					
                			}
                			
                			//Multiplico las veces que sea necesario
                			for(int i = 0; i < matrizPotencia.length; i++) {
                	            for(int j = 0; j < matrizPotencia1[0].length; j++) {
                	                for(int k = 0; k < (matrizPotencia[0].length);k++) {
                	                	resultado_potencia[i][j] +=  (matrizPotencia[i][k] * matrizPotencia1[k][j]);
                	                }
                	            }
                	        }
                			
                			//Resta la primera matriz resultado
                			for (int i = 0; i < matrizPotencia.length; i++) {
                    			for (int j = 0; j < matrizPotencia1[i].length; j++) {
                    				resultado_potencia[i][j] = resultado_potencia[i][j] - matrizCopia[i][j];
                    			}
                    		}
                			
                			contador++;
                		}
                		 
                       
                		// Imprime la primera
                    	for (int i = 0; i < matrizPotencia.length; i++){
                    		//Imprime la primera
                    		for(int j = 0; j < matrizPotencia1[i].length; j++) {
                    			System.out.print("[ " + matrizPotencia1[i][j] + " ]");
                           }
                    			
                    		//tabula y pone el mas
                    		if (i == numFilas/2) {
                    			System.out.print("   ^   ");
                    		}
                    		else {
                    			System.out.print("       ");
                    		}
                    		
                    		//tabula y pone la potencia
                    		if (i == numFilas/2) {
                    			System.out.print(numero);
                    		}
                    		else {
                    			System.out.print("       ");
                    		}	
                    			 
                    		//tabula y pone el igual
                    		if (i == numFilas/2) {
                    			System.out.print("    =    ");
                    		}
                    		else {
                    			System.out.print("   ");
                    		}
                    			
                    		//Imprime la resultado
                    		for (int j = 0; j < resultado_potencia[i].length; j++) {
                    			System.out.print("[ " + resultado_potencia[i][j] + " ]");
                    		}
                    		System.out.println("");
                    	}
                    	System.out.println("");
                        break;
                    case 8:
                        System.out.println("Has seleccionado la opcion Restar");
                        
                        //Introduce el tamaño
                        System.out.println("Para restar matrices su tamaño debe ser igual");
                        System.out.println("Pondremos automaticamente el mismo tamaño a la segunda matriz");
                        System.out.println("Escribe cuantas filas quieres que tenga su matriz");
         	            numFilas = entrada.nextInt();
         	            System.out.println("Escribe cuantas columnas quieres que tenga su matriz");
         	            numCol = entrada.nextInt();
                        
         	            //Declaro las matrices
                        int matrizResta[][] = new int[numFilas][numCol];
                        int matrizResta1[][] = new int[numFilas][numCol];
                        int resultadoResta[][] = new int[numFilas][numCol];
                        
                      //Para introducir los numeros de la matriz
                        for (int x = 0; x < matrizResta.length; x++) {
                			for (int y = 0; y < matrizResta[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizResta[x][y] = entrada.nextInt();
                				}
                			}
                      //Imprime la matriz
                		for(int i = 0; i < matrizResta.length; i++) {
                            for(int j = 0; j < matrizResta[i].length; j++) {
                                System.out.print("[ " + matrizResta[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		//Introduce los numeros de la segunda matriz
                		for (int x = 0; x < matrizResta1.length; x++) {
                			for (int y = 0; y < matrizResta1[x].length; y++) {
                				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                				matrizResta1[x][y] = entrada.nextInt();
                				}
                			}
                		//Imprime la segunda matriz
                		for(int i = 0; i < matrizResta1.length; i++) {
                            for(int j = 0; j < matrizResta1[i].length; j++) {
                                System.out.print("[ " + matrizResta1[i][j] + " ]");
                            }
                            System.out.println("");
                        }
                		
                		System.out.println("");
                		System.out.println("Resultado");
                		System.out.println("");
                		
                		//Resta las dos matrices
                   		for (int x = 0; x < matrizResta.length; x++) {
                			for (int y = 0; y < matrizResta1[x].length; y++) {
                				resultadoResta[x][y] = matrizResta [x][y] + (-1 * matrizResta1[x] [y]);
                			}
                		}
                		// Imprime la resta
                		for (int i = 0; i < matrizResta.length; i++){
                			//Imprime la primera
                			for(int j = 0; j < matrizResta[i].length; j++) {
                                System.out.print("[ " + matrizResta[i][j] + " ]");
                            }
                			
                			//tabula y pone el menos
                			if (i == numFilas/2) {
                				System.out.print("   +  -1 * ");
                			}
                			else {
                				System.out.print("           ");
                			}
                			
                			//Imprime la segunda
                			for(int j = 0; j < matrizResta1[i].length; j++) {
                                System.out.print("[ " + matrizResta1[i][j] + " ]");
                            }
                			 
                			//tabula y pone el igual
                			if (i == numFilas/2) {
                				System.out.print("   =   ");
                			}
                			else {
                				System.out.print("       ");
                			}
                			
                			//Imprime la resultado
                			for (int j = 0; j < resultadoResta[i].length; j++) {
                				System.out.print("[ " + resultadoResta[i][j] + " ]");
                			}
                			 System.out.println("");
                		}
                		System.out.println("");
                        break;
                    case 9:
                        salir = true;
                        break;
                    default:
                        System.out.println("Numero no valido introduce solo números entre 1 y 4");
                }
	       }
	       while (!salir); 
	    }
	     
}
