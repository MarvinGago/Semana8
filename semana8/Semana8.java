/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana8;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author CPUw1010
 */
public class Semana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*int edad[]=new int[1];
        for (int i = 0; i <edad.length; i++){
            edad[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad"));
        }
        for (int i = 0; i< edad.length; i++){
                 JOptionPane.showInputDialog( null, edad[1]);
             }
        */
       /*
       //ejercicio 1
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] arreglo = new int[tamaño];

        llenarArreglo(arreglo);
        mostrarArreglo(arreglo);
    }

    public static void llenarArreglo(int[] arreglo) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("Los datos almacenados en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }}}
       */
       /*
       //ejercicio 2
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero a buscar: ");
        int numero = scanner.nextInt();

        int posicion = buscarNumero(arreglo, numero);
        if (posicion != -1) {
            System.out.println("El numero " + numero + " se encuentra en la posicion " + posicion + " del arreglo.");
        } else {
            System.out.println("El numero " + numero + " no se encuentra en el arreglo.");
        }
    }

    public static int buscarNumero(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i;
            }
        }
        return -1;
    }}
       */
       /*
  //ejercicio 3
       double[] ventas = new double[5]; // para almacenar las ventas de cada vendedor
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el monto vendido por el vendedor " + (i + 1) + ": ");
                ventas[i] = scanner.nextDouble();
            }
            
            System.out.println("Monto total vendido por cada vendedor:");
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Vendedor " + (i + 1) + ": $" + ventas[i]);
            }
        }
       
        //practica 1
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamano de la matriz N x N: ");
        int n = scanner.nextInt();
        
        int[][] matriz = new int[n][n];
        
        // Ingrese los valores de la matriz
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Calcular la suma de las 4 esquinas
        int sumaEsquinas = matriz[0][0] + matriz[0][n-1] + matriz[n-1][0] + matriz[n-1][n-1];
        System.out.println("La suma de las 4 esquinas es: " + sumaEsquinas);
        
        int sumaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
       
        int sumaDiagonalInversa = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalInversa += matriz[i][n-1-i];
        }
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
        
        
        int maximo = matriz[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor de toda la matriz es: " + maximo);
    }}
        */
        //Practica 2
        int[][] matriz = new int[3][3];
        
        // Llenar la matriz con números enteros a Random
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(1000) + 1;
            }
        }
        
        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        //el valor mínimo almacenado en la matriz
        int minimo = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }
        
        // Mostrar el valor mínimo
        System.out.println("El valor minimo almacenado en la matriz es: " + minimo);
    }}

        
        
    


