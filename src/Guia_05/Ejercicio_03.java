package Guia_05;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tam;
        System.out.print("\033[H\033[2J"); // Borra pantalla
        System.out.print("Ingrese el tamaño del vector: ");
        tam = in.nextInt();
        in.close();
        int[] vector = new int[tam];
        
        // Creo un vector para almacenar la cantidad de numeros de la distinta cantidad de digitos
        // En el indice de vector 1 se almacenan los numeros de 1 digito
        // En el indice de vector 2 se almacenan los numeros de 2 digitos
        // etc, etc
        int[] recuento = new int[6];

        inicializaRecuento(recuento); // Llamo a la funcion para llenar de ceros el vector recuento

        llenadoVector(vector); // Lleno el vector principal aleatoriamente

        // En este for recorro el vector, llamando la funcion que cuenta los digitos de cada numero
        // y luego almaceno el numero que devuelve la funcion en el indice correspondiente del
        // vector recuento
        for (int numero: vector){
            int digitos = cantidadDeDigitos(numero);
            recuento[digitos]++;
        }

        imprimeRecuento(recuento);

    }

    static void llenadoVector(int[] vector){
        for (int i=0;i<vector.length;i++){
            vector[i] = (int) (Math.random()*100000);
            System.out.println("Vector " + i + ": " + vector[i]);
        }
    }

    static int cantidadDeDigitos(int numero){
        int digitos=0;
        while(numero>0){
            numero/=10;
            digitos++;
        }
        return digitos;
    }

    static void imprimeRecuento(int[] vector){
        for (int i=1;i<vector.length;i++){
            System.out.println("Hay " + vector[i] + " numeros de " + i + " digitos.");
        }
    }

    static void inicializaRecuento(int[] vector){
        for (int i=0;i<vector.length;i++){
            vector[i]=0;
        }
    }
}
