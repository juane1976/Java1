package Guia_05.Extras;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Ingrese n: ");
        n = in.nextInt();
        int[] fibonacci = new int[n];
        calcularFibonacci (fibonacci, n);
        for (int i=0;i<n;i++){
            System.out.print(" " + fibonacci[i] + " ");
        }
    }

    static void calcularFibonacci (int[] vector, int n){
        vector[0]=1;
        vector[1]=1;
        for (int i=2;i<n;i++){
            vector[i] = vector [i-1] + vector[i-2];
        }
    }

    
}
